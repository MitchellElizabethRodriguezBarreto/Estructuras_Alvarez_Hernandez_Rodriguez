package Estrc2509;

public class Hash {
	
	int n;
	ListNumeric[] array;
	
	
	public Hash(int n) {
		this.n = n;
		array = new ListNumeric[n];
		
		//Es necesario inicializar para poder usar correctamente el code
		for(int i = 0; i < n ; i++) {
			array[i] = new ListNumeric();
		}
		
//		System.out.println(array.length);
	}

	public void display() {
		for(int i = 0; i < n ; i++) {
			System.out.println("Index " + i + ":");
			array[i].DisplayList();
		}
	}
	
	public void add(int n, int m) {
		if(array[m] == null) {
			array[m] = new ListNumeric();
		}
//		System.out.println("array: " + m + "  N = " + n);
		array[m].PushBack(n);
//		array[m].DisplayList();
	}
	public static void main(String[] args) {
		Hash myHash = new Hash(10);
//		myHash.display();
		myHash.add(7, 9);
		myHash.add(5, 3);
		myHash.add(2, 9);
		myHash.add(5, 4);
		myHash.add(6, 2);

		myHash.display();
	}

}
