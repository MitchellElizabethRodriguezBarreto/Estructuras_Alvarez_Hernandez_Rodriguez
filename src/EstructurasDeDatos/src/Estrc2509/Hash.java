package Estrc2509;

import java.util.Random;

public class Hash {
	
	int n;
	ListNumeric[] array;
	
	
	public Hash(int n) {
		if(n < 10) {
			this.n = n;
		}else {
			String IDstring = String.valueOf(n);
			IDstring = IDstring.substring(0, IDstring.length()-1);
			n = Integer.parseInt(IDstring);
			this.n = n;
		}
		array = new ListNumeric[n];
		
		//Es necesario inicializar para poder usar correctamente el code
		for(int i = 0; i < n ; i++) {
			array[i] = new ListNumeric();
		}
		
//		System.out.println(array.length);
	}

	public static int getHash(int ID) {
		if(ID < 10) {
			return ID;
		}
		String IDstring = String.valueOf(ID);
		IDstring = IDstring.substring(1);
		if(IDstring.equals("")) {
			return ID;
		}
		return Integer.parseInt(IDstring);
	}
	
	public void display() {
		for(int i = 0; i < n ; i++) {
			System.out.println("Index " + i + ":");
			array[i].DisplayList();
		}
	}
	
	public void displayIndex(int n) {
		DoubleNodeNumeric p = array[n].head;
		if(p == null) {
			System.out.println("Null");
		}
		while (p != null) {
			System.out.println(p.getKey());
			p = p.getNext();
		}
	}
	
	public void displayInfo(int ID) {

		int hash = getHash(ID);
		DoubleNodeNumeric p = array[hash].head;
		
		if(p == null) {
			System.out.println();
			System.out.println("lista vacia");
			return;
		}
		while (p != null) {
			if(p.getKey() == ID) {
				p.displayArray();
				return;
			}else {
				p = p.getNext();
			}
		}
		System.out.println("El ID no existe en la tabla hash");
	}
	
	public void add(int ID) {
		if(find(ID) == null) {
//			System.out.println(ID);
			int hash = getHash(ID);
			if(array[hash] == null) {
				array[hash] = new ListNumeric();
			}
//		System.out.println("array: " + m + "  N = " + n);
			array[hash].PushBack(ID);
//		array[m].DisplayList();			
		}
		else {
			System.out.println("el ID ya existe");
		}
	}
	
	public void setArrayInfo(int ID, int[] array) {

		int hash = getHash(ID);
		
		DoubleNodeNumeric node = find(ID);
		if(node == null) {
			System.out.println("El ID no existe");
			return;
		}else {
			node.setArray(array);
		}
	}
	
	public DoubleNodeNumeric find(int ID) {

		int hash = getHash(ID);
		DoubleNodeNumeric p = array[hash].head;
		while (p != null) {
			if(p.getKey() == ID) {
				return p;
			}
			p = p.getNext();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		int hashLength = 1000000;
		
		Hash myHash = new Hash(hashLength);
				
//		myHash.display();

		Random rnd= new Random();
				
		for (int i = 0; i < hashLength; i++) {
			int ID = rnd.nextInt(hashLength);
			ID = (int)Integer.toUnsignedLong(ID);
			myHash.add(ID);
			
			int array[] = new int[3];
			array[0] = rnd.nextInt(hashLength);
			array[1] = rnd.nextInt(hashLength);
			array[2] = rnd.nextInt(hashLength);

			myHash.setArrayInfo(ID, array);
		}
		
			myHash.display();
			System.out.println();
			
			myHash.displayIndex(1);
			System.out.println();
			myHash.find(41).displayArray();
		
	}

}
