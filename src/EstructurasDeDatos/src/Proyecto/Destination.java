package Proyecto;

public class Destination {
	
//	DECLARACION de ciudades, y sus precios para poder utilizarlos
//	como enteros 
	
//	Si se desea anadir o quitar ciudades, FAVOR actualizar las 
//	funciones getPrice, getCity, y por ultimo la interfaz DestinationAndPrice
	
	public static final int QUANTYCITIES = 9;
	
	public static final int CARTAGENA	= 0;
	public static final int SANTAMARTA 	= 1;
	public static final int MEDELLIN 	= 2;
	public static final int CALI 		= 3;
	public static final int SANANDRES 	= 4;
	public static final int BARRANQUILLA = 5;
	public static final int MONTERIA 	= 6;
	public static final int BUCARAMANGA	= 7;
	public static final int CUCUTA 		= 8;

	public static final int CARTAGENA_PRICE		= 240000;
	public static final int SANTAMARTA_PRICE 	= 330000;
	public static final int MEDELLIN_PRICE 		= 160000;
	public static final int CALI_PRICE 			= 200000;
	public static final int SANANDRES_PRICE 	= 290000;
	public static final int BARRANQUILLA_PRICE 	= 280000;
	public static final int MONTERIA_PRICE 		= 200000;
	public static final int BUCARAMANGA_PRICE	= 190000;
	public static final int CUCUTA_PRICE 		= 390000;
	
	
//	ciudad destino =v
	private int city;
	
	public Destination(int city) {
		this.city = city;
	}
	
	public int getPrice() {
		switch(city) {
		case CARTAGENA:
			return CARTAGENA_PRICE;
		case SANTAMARTA:
			return SANTAMARTA_PRICE;
		case MEDELLIN:
			return MEDELLIN_PRICE;
		case CALI:
			return CALI_PRICE;
		case SANANDRES:
			return SANANDRES_PRICE;
		case BARRANQUILLA:
			return BARRANQUILLA_PRICE;
		case MONTERIA:
			return MONTERIA_PRICE;
		case BUCARAMANGA:
			return BUCARAMANGA_PRICE;
		case CUCUTA:
			return CUCUTA_PRICE;
		
		}
		return 0;
	}
	
	public static int getPrice(int city) {
		switch(city) {
		case CARTAGENA:
			return CARTAGENA_PRICE;
		case SANTAMARTA:
			return SANTAMARTA_PRICE;
		case MEDELLIN:
			return MEDELLIN_PRICE;
		case CALI:
			return CALI_PRICE;
		case SANANDRES:
			return SANANDRES_PRICE;
		case BARRANQUILLA:
			return BARRANQUILLA_PRICE;
		case MONTERIA:
			return MONTERIA_PRICE;
		case BUCARAMANGA:
			return BUCARAMANGA_PRICE;
		case CUCUTA:
			return CUCUTA_PRICE;
		
		}
		return 0;
	}

	public String getCity() {
		switch(city) {
		case CARTAGENA:
			return DestinationAndPrice.city.CARTAGENA.toString();
		case SANTAMARTA:
			return DestinationAndPrice.city.SANTAMARTA.toString();
		case MEDELLIN:
			return DestinationAndPrice.city.MEDELLIN.toString();
		case CALI:
			return DestinationAndPrice.city.CALI.toString();
		case SANANDRES:
			return DestinationAndPrice.city.SANANDRES.toString();
		case BARRANQUILLA:
			return DestinationAndPrice.city.BARRANQUILLA.toString();
		case MONTERIA:
			return DestinationAndPrice.city.MONTERIA.toString();
		case BUCARAMANGA:
			return DestinationAndPrice.city.BUCARAMANGA.toString();
		case CUCUTA:
			return DestinationAndPrice.city.CUCUTA.toString();
		
		}
		return null;
	}

	public static String getCity(int city) {
		switch(city) {
		case CARTAGENA:
			return DestinationAndPrice.city.CARTAGENA.toString();
		case SANTAMARTA:
			return DestinationAndPrice.city.SANTAMARTA.toString();
		case MEDELLIN:
			return DestinationAndPrice.city.MEDELLIN.toString();
		case CALI:
			return DestinationAndPrice.city.CALI.toString();
		case SANANDRES:
			return DestinationAndPrice.city.SANANDRES.toString();
		case BARRANQUILLA:
			return DestinationAndPrice.city.BARRANQUILLA.toString();
		case MONTERIA:
			return DestinationAndPrice.city.MONTERIA.toString();
		case BUCARAMANGA:
			return DestinationAndPrice.city.BUCARAMANGA.toString();
		case CUCUTA:
			return DestinationAndPrice.city.CUCUTA.toString();
		
		}
		return null;
	}
	
}
