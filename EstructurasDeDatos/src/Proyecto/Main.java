package Proyecto;

import java.awt.Rectangle;
import java.util.Random;

import Estrc2509.MyArrayList;
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
		Destination prueba = new Destination(2);
		System.out.println(prueba.getCity());
		
		
		Random rnd= new Random();
		//MyArrayList<String[]> list = new MyArrayList<String[]>();
		User<String[]> reserv = new User<String[]>();
		//list.DisplayList();
					
		String[] arrayData = new String[4];
		
		int iteraciones = 10;
		
		for(int i = 0; i<iteraciones; i++) {
			int ID = rnd.nextInt(100000);
			int city= rnd.nextInt(9);
			int hour= rnd.nextInt(23);
			int minutes = rnd.nextInt(59);
			
			String[] array = new String[4];
			array[0]=Integer.toString(ID);
			array[1]=Integer.toString(city);
			array[2]=Integer.toString(hour);
			array[3]=Integer.toString(minutes);

			Fly fly = new Fly(city, hour,minutes);
			//list.PushFront(array);
			reserv.add(array);
			
			if(i == iteraciones-2) {
				arrayData = array;
			}						
		}
		
		Time time = new Time();
		time.initTime();
		reserv.delete(arrayData);
		time.finishTime();		
		//reserv.show();		
		time.getTime();
		
		
		VisualInterface window = new VisualInterface();
		window.FirstWindow();
		
	}
	
}