package Estrc2509;

public class Test {


	
	public static void main(String[] args) {
		HeapTree array = new HeapTree(true);

		array.add(6);
		array.display();
		System.out.println();

		array.add(2);
		array.display();
		System.out.println();

		array.add(5);
		array.display();
		System.out.println();

		array.add(3);
		array.display();
		System.out.println();

		array.add(7);
		array.display();
		System.out.println();
		
		array.add(1);
		array.display();
		System.out.println();
		
		array.add(4);
		array.display();
		System.out.println();
		
		array.add(8);
		array.display();
		System.out.println();

		array.delete();	
		array.display();
		System.out.println();

		array.delete();	
		array.display();
		System.out.println();

		array.delete();	
		array.display();
		System.out.println();

		
		
//		System.out.println("N=" + array.getN() + " - Size=" + array.getSize());
		
		array.display();
		System.out.println();

		System.out.println();
		
		for(int i = 0; i < array.getN(); i++) {
			System.out.print(array.array[i] + " - ");			
		}
	}

}
