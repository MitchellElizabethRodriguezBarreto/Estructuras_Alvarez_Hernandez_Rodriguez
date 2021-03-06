package Proyecto;

public class Chairs {
	
	public static final int QUANTYCHAIRS = 30;
	
//	Por defecto se inicializa todo el Array en FALSE
	private boolean[] chairs = new boolean[QUANTYCHAIRS];
	
	
	public Chairs() {
		for(int i=0; i<QUANTYCHAIRS; i++) {
			chairs[i]=true;
		}
	}
	
	
//	Obtener una silla en especifico
	public boolean getChair(int i) {
		return this.chairs[i];
	}
	
	public void setChair(int i) {
		this.chairs[i] = false;
	}

	
//	Obtener todo el conjunto de sillas
	public boolean[] getChairs() {
		return this.chairs;
	}
	
//	Imprimir todas las sillas
	public void displayChairs() {
		for(int i = 0; i < QUANTYCHAIRS; i++) {
			System.out.println(chairs[i]);			
		}
	}
	
//	Para saber si quedan sillas libres o no
	public boolean getAvailability() {
		for(int i = 0; i < QUANTYCHAIRS; i++) {
			if(chairs[i] == true) {
				return true;
			}
		}
		return false;
	}
	
	
}
