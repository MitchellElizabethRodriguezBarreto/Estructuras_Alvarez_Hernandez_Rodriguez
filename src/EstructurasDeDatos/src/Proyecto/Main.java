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
		
		DoubleLinkedList<Integer> tree = new DoubleLinkedList<Integer>();
		User<int[]> reserva = new User<int[]>();
		
		int iteraciones = 1000000;
		int[] arrayData = new int[4];
		
		Time mytime = new Time();
		mytime.initTime();
		for(int i = 0; i<iteraciones; i++) {
			int ID = rnd.nextInt(1555555555);
			int city= rnd.nextInt(9);
			int hour= rnd.nextInt(23);
			int minutes = rnd.nextInt(59);
			
			int[] array = new int[4];
			
			tree.PushBack(ID);
			
			array[0]=city;
			array[1]=hour;
			array[2]=minutes;
			array[3]=113;
			
			reserva.add(array);
			
			if(i == iteraciones-2) {
				arrayData = array;
			}
		}
		mytime.finishTime();
		mytime.getTime();
		
		int alea = rnd.nextInt(1555555555);
		System.out.println(alea);
		
		mytime.initTime();
		tree.PoPBack();
		mytime.finishTime();
		mytime.getTime();
		
		mytime.initTime();
		reserva.delete(arrayData);
		mytime.finishTime();	
		mytime.getTime();		
		
//		tree.inOrder(tree.getRoot());
//		tree.getRoot().displayNode();
		
		VisualInterface window = new VisualInterface();
		window.FirstWindow();
	}
	
}