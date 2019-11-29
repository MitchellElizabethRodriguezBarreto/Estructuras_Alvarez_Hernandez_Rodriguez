package Estrc2509;

public class Test {


	
	public static void main(String[] args) {
		DynamicArray array = new DynamicArray(1);

		array.add(0);
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		
		System.out.println("N=" + array.getN() + " - Size=" + array.getSize());
		
		array.delete(0);
		array.delete(1);	
		array.delete(2);	
//		System.out.println("N-=" + array.getN() + " - Size-=" + array.getSize());
		array.delete(3);	
		array.delete(3);	
		array.delete(3);	
		array.delete(99);	
		
		
		System.out.println("N=" + array.getN() + " - Size=" + array.getSize());
		
		array.display();

		System.out.println();
		System.out.println();
		
		for(int i = 0; i < array.getN(); i++) {
			System.out.print(array.array[i] + " - ");			
		}
	}

}
