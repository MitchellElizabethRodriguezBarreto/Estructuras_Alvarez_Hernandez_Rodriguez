package Estrc2509;

import java.util.Iterator;

public class DoubleNodeNumeric {

	private int key;
	private DoubleNodeNumeric next;
	private DoubleNodeNumeric prev;
	
	int[] array;
	
	public DoubleNodeNumeric(int key) {
		this.key = key;
		this.next = null;
		this.prev = null;
		this.array = null;
	}

	public DoubleNodeNumeric(int key, DoubleNodeNumeric next ,DoubleNodeNumeric prev, int[] array) {
		this.key = key;
		this.next = next;
		this.prev = prev;
		this.array = array;
	}

	public void setNext(DoubleNodeNumeric next) {
		this.next = next;
	}
	
	public void setPrev(DoubleNodeNumeric prev) {
		this.prev = prev;
	}

	public int getKey() {
		return this.key;
	}

	public DoubleNodeNumeric getNext() {
		return this.next;
	}

	public DoubleNodeNumeric getPrev() {
		return this.prev;
	}
	
	public void displayArray() {
		System.out.println("llega");
		if(array == null) {
			System.out.println("Array vacio");
			return;
		}
		
		System.out.println("ID: " + key + "  Index: " + Hash.getHash(key));
		for(int i = 0; i < array.length ; i++) {
			System.out.print(array[i] + " - " );
		}
	}
	
	public void setArray(int[] array) {
		this.array = array;
	}
}
