package Proyecto;

public class Time {

	private long init, finish, total;

	int[] a=new int[2];

	public Time(){
	     this.init = 0;
	     this.finish = 0;
	}

	public long initTime(){	
	    init = System.currentTimeMillis();
	    return init;
	}
	    
	public long finishTime(){		
		finish = System.currentTimeMillis();
	    return finish;
	}
	    
	public long getTime(){	
		total=finish-init;
	    System.out.println("Tiempo de ejecucion en milisegundos: " + total); //Mostramos en pantalla el tiempo de ejecucion en milisegundos
	    return total;    
	}

		
	public static void main(String[] args) {
		Time timi = new Time();
		timi.initTime();
		long valor = 1;
		for(int i=0; i<1000000000;i++) {
			valor++;
		}
		timi.finishTime();
		System.out.println(valor);
		timi.getTime();
	}

}
