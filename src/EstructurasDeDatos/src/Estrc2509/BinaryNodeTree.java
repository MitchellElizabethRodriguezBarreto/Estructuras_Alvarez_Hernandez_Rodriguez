package Estrc2509;

import Proyecto.Destination;

public class BinaryNodeTree<T> {

	private int key;
	private int Height;
	
	
	private BinaryNodeTree<T> left;
	private BinaryNodeTree<T> right;
	private BinaryNodeTree<T> parent;
	
	
	public BinaryNodeTree(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
		this.Height = 0;
	}
	
	public void adjustHeight(){
		if(this.left == null && this.right == null) {
			this.Height = 0;
		}
		else if(this.right == null) {
			this.Height = 1 + this.left.getHeight();
		}
		else if(this.left == null ) {
			this.Height = 1 + this.right.getHeight();;
		}
		else {
			setHeight(1 + Math.max(this.left.getHeight(), this.right.getHeight()));			
		}
	}

	public void setLeft(BinaryNodeTree<T> left) {
		this.left = left;
	}
	
	public BinaryNodeTree<T> getLeft() {
		return this.left;
	}
	
	public void setRight(BinaryNodeTree<T> right) {
		this.right = right;
	}

	public BinaryNodeTree<T> getRight() {
		return this.right;
	}
	
	public void setParent(BinaryNodeTree<T> parent) {
		this.parent = parent;
	}

	public BinaryNodeTree<T> getParent() {
		return this.parent;
	}

	public int getKey() {
		return this.key;
	}

	
	public int getHeight() {
		return this.Height;
	}

	
	public void setHeight(int height) {
		this.Height = height;
	}

	
	
	
	
	/*
	 * HE PEGADO EL CONTENIDO DEL NODO DEL PROYECTO DEBIDO A QUE ENTRARIA EN CONFLICTO CON EL ARBOL
	 */
 

	
	int[] Reservation = new int[4];
	
	public static final int DESTINO	= 0;
	public static final int HOUR	= 1;
	public static final int MINUTES	= 2;
	public static final int CHAIR	= 3;
	

	public int[] getReservation() {
		return Reservation;
	}
	
	public void setReservation(int set, int date) {
		switch(set) {
		case DESTINO:
			if(date > 9) {
				System.out.println("No Range");
				return;
			}else {
				Reservation[DESTINO] = date;				
			}
		case HOUR:
			if(date < 0 && date > 23) {
				System.out.println("No Range");
				return;
			}else {
				Reservation[HOUR] = date;
			}
		case MINUTES:
			if(date > 9) {
				System.out.println("No Range");
				return;
			}else {
				Reservation[MINUTES] = date;
			}
		case CHAIR:
			if(date > 9) {
				System.out.println("No Range");
				return;
			}else {
				Reservation[CHAIR] = date;
			}
		default:
			return;
		}
			
	}
	
	public void displayNode() {
		System.out.print("ID: " + getKey());				
		for(int i = 0; i< 4; i++) {
			if(i==DESTINO) {
				System.out.print("	City: " + Destination.getCity(this.Reservation[i]));				
			}
			if(i==HOUR) {
				System.out.print("	Hour: " + this.Reservation[i]);				
			}
			if(i==MINUTES) {
				System.out.print(":" + this.Reservation[i]);				
			}
			if(i==CHAIR) {
				System.out.print(":" + this.Reservation[i]);				
			}
		}
		System.out.println();
	}
	
	public void setReservation(int[] set) {
		this.Reservation = set;
	}
	
}
