package Proyecto;

public class Time {

	private double init, finish, total;

	int[] a=new int[2];

	public Time(){
	     this.init = 0;
	     this.finish = 0;
	}

	public double initTime(){	
	    init = System.currentTimeMillis();
	    return init;
	}
	    
	public double finishTime(){		
		finish = System.currentTimeMillis();
	    return finish;
	}
	    
	public void getTime(){	
		total=finish-init;
	    System.out.println("Tiempo de ejecucion en milisegundos: " + total); //Mostramos en pantalla el tiempo de ejecucion en milisegundos
	    return;    
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
