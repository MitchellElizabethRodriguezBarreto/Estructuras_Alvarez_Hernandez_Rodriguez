package Proyecto;

import Estrc2509.BinaryNodeTree;

public class NodeTreeProject<T> extends BinaryNodeTree<T> {

	
	int[] Reservation = new int[4];
	
	public static final int DESTINO	= 0;
	public static final int HOUR	= 1;
	public static final int MINUTES	= 2;
	public static final int CHAIR	= 3;
	
	public NodeTreeProject(int key) {
		super(key);
		for(int i=0; i<4; i++) {
			Reservation[i]=0;
		}
	}

	
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
}
	
	
