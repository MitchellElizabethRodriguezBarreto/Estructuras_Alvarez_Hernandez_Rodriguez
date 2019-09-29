package Estrc2509;

public class ArrayList<T> extends ManagementPeople<T> {

	@Override
	public void DisplayList() {
		if(this.head == null) {
			System.out.println("Lista Vacia...");
		}
		
		DoubleNode<T> p = this.head;
		while (p!=null) {
			getArray((int[])p.getKey());
			p = p.getNext();
		}
	}
	
	public void getArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.print(" - " + array[i]);
		}
		System.out.println();		
	}
}
