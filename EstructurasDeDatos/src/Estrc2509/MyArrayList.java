package Estrc2509;

import Proyecto.Destination;

public class MyArrayList<T> extends DoubleLinkedList<T> {

	@Override
	public void DisplayList() {
		if(this.head == null) {
			System.out.println("Lista Vacia...");
		}
		
		DoubleNode<T> p = this.head;
		while (p!=null) {
			getArray((String[])p.getKey());
			p = p.getNext();
		}
	}
	
	public void getArray(String[] array) {
		for(int i = 0; i<array.length; i++) {
			if(i==0) {
				System.out.print("ID: " + array[i]);				
			}
			if(i==1) {
				System.out.print("	City: " + array[i]);				
			}
			if(i==2) {
				System.out.print("	Hour: " + array[i]);				
			}
			if(i==3) {
				System.out.print(":" + array[i]);				
			}
		}
		System.out.println();		
	}
}
