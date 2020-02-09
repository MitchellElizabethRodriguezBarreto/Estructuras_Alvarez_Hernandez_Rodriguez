package Proyecto;

import Estrc2509.BinarySearchTree;

public class Information {
	BinarySearchTreeFly cartagena = new BinarySearchTreeFly();
	BinarySearchTreeFly santamarta = new BinarySearchTreeFly();
	BinarySearchTreeFly medellin = new BinarySearchTreeFly();
	BinarySearchTreeFly cali = new BinarySearchTreeFly();
	BinarySearchTreeFly sanandres = new BinarySearchTreeFly();
	BinarySearchTreeFly barranquilla = new BinarySearchTreeFly();
	BinarySearchTreeFly monteria = new BinarySearchTreeFly();
	BinarySearchTreeFly bucaramanga = new BinarySearchTreeFly();
	BinarySearchTreeFly cucuta = new BinarySearchTreeFly();
	
	public void createFly() {
		int dailyHours = 23;
		int dailyMinutes = 59;
		
		for(int i = 0; i <= dailyHours; i++) {
			for(int j = 0; j <= dailyMinutes; j=j+5) {
				Fly flyCar = new Fly(0, i, j);
				cartagena.insert(flyCar);
				
				Fly flySant = new Fly(1, i, j);
				santamarta.insert(flySant);
				
				Fly flyMed = new Fly(2, i, j);
				medellin.insert(flyMed);
				
				Fly flyCal = new Fly(3, i, j);
				cali.insert(flyCal);
				
				Fly flySana = new Fly(4, i, j);
				sanandres.insert(flySana);
				
				Fly flyBar = new Fly(5, i, j);
				barranquilla.insert(flyBar);
				
				Fly flyMon = new Fly(6, i, j);
				monteria.insert(flyMon);
				
				Fly flyBuc = new Fly(7, i, j);
				bucaramanga.insert(flyBuc);
				
				Fly flyCuc = new Fly(8, i, j);
				cucuta.insert(flyCuc);
			}
		}
		
		/*cartagena.inOrder(cartagena.root);
		santamarta.inOrder(santamarta.root);
		medellin.inOrder(medellin.root);
		cali.inOrder(cali.root);
		sanandres.inOrder(sanandres.root);
		barranquilla.inOrder(barranquilla.root);
		monteria.inOrder(monteria.root);
		bucaramanga.inOrder(bucaramanga.root);
		cucuta.inOrder(cucuta.root);*/
	}
	
	/*public int filterMinutes(String filter) {
		int dailyHours = 59;
		
		for(int i = 0; i<=dailyHours; i++) {
			minutes.insert(i);
		}
		
		if(filter.contains("Temprano")) {
			minutes.min();
			//System.out.println("Su vuelo es a las: " + minutes.min().getKey());
			return minutes.min().getKey();
		}
		else if(filter.contains("Tarde")) {
			minutes.max();
			//System.out.println("Su vuelo es a las: " + minutes.max().getKey());
			return minutes.max().getKey();
		}
		return 0;
	}
	
	public void filterHour(String filter) {
		int minute;
		int dailyHours = 23;
		
		for(int i = 0; i<=dailyHours; i++) {
			hours.insert(i);
		}
		
		if(filter.contains("Temprano")) {
			minute = filterMinutes("Temprano");
			hours.min();
			System.out.println("Su vuelo es a las: " + hours.min().getKey() + ":" + minute);
		}
		else if(filter.contains("Tarde")) {
			minute = filterMinutes("Tarde");
			hours.max();
			System.out.println("Su vuelo es a las: " + hours.max().getKey() + ":" + minute);
		}
	}*/

	public final String temprano = "Temprano";
	public final String tarde = "Tarde";
	
	public void filterHour(String filter, String city) {
		//System.out.println(city);
		
		if(filter.contains("Temprano")) {
			if(city.contains("Barranquilla")) {
				System.out.println("Su vuelo es a las: " + barranquilla.min().getKey());
			}
			else if(city.contains("Bucaramanga")) {
				System.out.println("Su vuelo es a las: " + bucaramanga.min().getKey());
			}
			else if(city.contains("Cali")) {
				System.out.println("Su vuelo es a las: " + cali.min().getKey());
			}
			else if(city.contains("Cartagena")) {
				System.out.println("Su vuelo es a las: " + cartagena.min().getKey());
			}
			else if(city.contains("Cúcuta")) {
				System.out.println("Su vuelo es a las: " + cucuta.min().getKey());
			}
			else if(city.contains("Medellín")) {
				System.out.println("Su vuelo es a las: " + medellin.min().getKey());
			}
			else if(city.contains("Montería")) {
				System.out.println("Su vuelo es a las: " + monteria.min().getKey());
			}
			else if(city.contains("San Andrés")) {
				System.out.println("Su vuelo es a las: " + sanandres.min().getKey());
			}
			else if(city.contains("Santa Marta")) {
				System.out.println("Su vuelo es a las: " + santamarta.min().getKey());
			}
		}
		else if(filter.contains("Tarde")) {
			if(city.contains("Barranquilla")) {
				System.out.println("Su vuelo es a las: " + barranquilla.max().getKey());
			}
			else if(city.contains("Bucaramanga")) {
				System.out.println("Su vuelo es a las: " + bucaramanga.max().getKey());
			}
			else if(city.contains("Cali")) {
				System.out.println("Su vuelo es a las: " + cali.max().getKey());
			}
			else if(city.contains("Cartagena")) {
				System.out.println("Su vuelo es a las: " + cartagena.max().getKey());
			}
			else if(city.contains("Cúcuta")) {
				System.out.println("Su vuelo es a las: " + cucuta.max().getKey());
			}
			else if(city.contains("Medellín")) {
				System.out.println("Su vuelo es a las: " + medellin.max().getKey());
			}
			else if(city.contains("Montería")) {
				System.out.println("Su vuelo es a las: " + monteria.max().getKey());
			}
			else if(city.contains("San Andrés")) {
				System.out.println("Su vuelo es a las: " + sanandres.max().getKey());
			}
			else if(city.contains("Santa Marta")) {
				System.out.println("Su vuelo es a las: " + santamarta.max().getKey());
			}
		}
	}

	public BinarySearchTreeFly getFly(int city) {
		if(-1 == city) {
			return null;
		}
		
		//"Cartagena"
		if( 0 == city) {
			return this.cartagena;
		}
		//"Barranquilla"
		if( 5 == city) {
			return this.barranquilla;
		}
		//"Bucaramanga"
		if( 7 == city) {
			return this.bucaramanga;
		}
		//"Cali"
		if(3 == city) {
			return this.cali;
		}
		//"Cúcuta"
		if( 8 == city) {
			return this.cucuta;
		}
		//"Medellín"
		if( 2 == city) {
			return this.medellin;
		}
		//"Montería"
		if( 6 == city) {
			return this.monteria;
		}
		//"San Andrés"
		if( 4 == city) {
			return this.sanandres;
		}
		//"Santa Marta"
		if( 1 == city) {
			return this.santamarta;
		}
			
		return null;
	}

}