package Proyecto;

import java.awt.Rectangle;
import java.util.Random;

import Estrc2509.MyArrayList;
import Estrc2509.Tree;
import Estrc2509.DoubleLinkedList;

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
		
		Tree<Integer> tree = new Tree<Integer>();
		
		for(int i = 0; i<10; i++) {
			int ID = rnd.nextInt(100000);
			int city= rnd.nextInt(9);
			int hour= rnd.nextInt(23);
			int minutes = rnd.nextInt(59);
			
			int[] array = new int[4];
			
			tree.insert(ID, tree.getRoot());
			
			array[0]=city;
			array[1]=hour;
			array[2]=minutes;
			array[3]=113;
			
			tree.find(ID, tree.getRoot()).setReservation(array);
		}
		
		tree.inOrder(tree.getRoot());
		tree.getRoot().displayNode();
	}
	
}