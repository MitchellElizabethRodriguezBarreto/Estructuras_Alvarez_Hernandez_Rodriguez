package Proyecto;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hour {
	
	private int hour;
	private int minutes;
	

//	un sencillo verificador para que la hora se mantenga
//	en sus formato 24h  
	private Hour(int hour, int minutes) {
		this.hour = hour;
		this.minutes = minutes;
	}
	
	
//	Intento de Constructor a partir de la clase CALENDAR
//	public Hour() {
//		Date fechaActual = new Date();
//        System.out.println(fechaActual);
//        System.out.println("---------------------------------------------");
//        
//        //Formateando la fecha:
//        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
//        Calendar fecha = Calendar.getInstance();
//        fecha.set(Calendar.MINUTE, 30);
//        fecha.set(Calendar.HOUR_OF_DAY, 24);
//        int hora = fecha.get(Calendar.HOUR_OF_DAY);
//        int minuto = fecha.get(Calendar.MINUTE);
//        System.out.println(hora + ":" + minuto);
//	}
	
	static public Hour newInstance(int hour, int minutes) {
		if(hour < 24 && minutes < 60) {
			if(hour >= 0 && minutes >= 0) {
				Hour ThisHour = new Hour(hour,minutes);
				return ThisHour;
			}
		}
		System.out.println("Error, los parametros seleccionados para la hora no son consistentes.");
		return null;
	}
	
	
//	Obtener Hora y Minutos
	public int[] getHour() {
		int[] array = new int[2];
		array[0] = this.hour;
		array[1] = this.minutes;
		return array;
	}
	
	public void setHour(int hour, int minutes) {
		if(hour < 24 && minutes < 60) {
			if(hour >= 0 && minutes >= 0) {
				this.hour = hour;
				this.minutes = minutes;
				return;
			}
		}
		System.out.println("Error, los parametros seleccionados para la hora no son consistentes, No se ha cambiado");
	}
	
//	Vizualizar en pantalla la hora
	public void displayHour() {
		System.out.println(String.format("%02d", this.hour) + ":" + String.format("%02d", this.minutes));
	}
	
}
