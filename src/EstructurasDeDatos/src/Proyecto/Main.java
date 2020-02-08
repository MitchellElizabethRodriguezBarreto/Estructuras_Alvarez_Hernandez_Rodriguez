package Proyecto;

import java.util.Random;

import Estrc2509.BinarySearchTree;
import Estrc2509.Hash;

public class Main {
	
	// Se crea el atributo de mismo como un objeto
	private static Main main;
	
	// este es el constructor es privado
	private Main() {
		
	}
	
	// este es el contructor del constructor 	
	// Revisa si ya esta creado, si lo esta entonces lo retorna	
	public static Main getInstance() {
		if(main==null) {
			main = new Main();
		}
		return main;
	}
	
	private void run() {
		
	}
	
	public static void main(String[] args) {
		Random rnd= new Random();
		
		Information flyInfo = new Information();
		flyInfo.createFly();
		
		VisualInterface window = new VisualInterface(flyInfo);
		window.FirstWindow();			
		
	}
	
}