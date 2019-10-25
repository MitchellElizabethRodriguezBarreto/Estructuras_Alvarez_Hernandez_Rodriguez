package Proyecto;

public interface DestinationAndPrice {

		public enum city{

	/*	si se anaden nuevas herramientas, hay que actualizar Mycanvas.compareTools
	 * 	y cada uno de los toolchange (MenuManager, ToolbarManager)
	 */		
			
			SANTAMARTA 	 	(Destination.SANTAMARTA),
			CARTAGENA		(Destination.CARTAGENA),
			MEDELLIN 	 	(Destination.MEDELLIN),
			CALI 		 	(Destination.CALI),
			SANANDRES 	 	(Destination.SANANDRES),
			BARRANQUILLA 	(Destination.BARRANQUILLA),
			MONTERIA 	 	(Destination.MONTERIA),
			BUCARAMANGA	 	(Destination.BUCARAMANGA),
			CUCUTA 		 	(Destination.CUCUTA);
			
			private int City;
			
			city(int city) {
		        this.City = city;
		    }
			
			public int getIntCity() {
				return this.City;
		    }

		}

		void getCity( city E);
}
