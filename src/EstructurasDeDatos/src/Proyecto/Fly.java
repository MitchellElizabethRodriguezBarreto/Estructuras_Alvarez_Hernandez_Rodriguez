package Proyecto;

public class Fly {

	private boolean availability;
	private Destination city;
	private int price;
	private Chairs chairs;
	private Hour hour;
	String hoursMinutes;
	
	public Fly(int city, int hour, int minutes) {
		this.availability = true;
		this.city = new Destination(city);
		this.price = this.city.getPrice();
		this.chairs = new Chairs();
		this.hour = Hour.newInstance(hour, minutes);
	}


	public boolean isAvailability() {
		return availability;
	}

	public String getCity() {
		return city.getCity();
	}
	public int getPrice() {
		return city.getPrice();
	}

	public void setDestination(Destination destination) {
		this.city = destination;
	}


	public Chairs getChairs() {
		return chairs;
	}


	public void setChair(int chair) {
		this.chairs.setChair(chair);;
	}


	public int[] getHours() {
		return hour.getHour();
	}
	
	public int getHour() {		
		
		if(hour.getHour()[0] >= 0 && hour.getHour()[0] <= 9) {
			hoursMinutes = "0" + String.valueOf(hour.getHour()[0]);
		}
		else {
			hoursMinutes = String.valueOf(hour.getHour()[0]);
		}
		
		if(hour.getHour()[1] >= 0 && hour.getHour()[1] <= 9) {
			hoursMinutes = hoursMinutes + "0" + String.valueOf(hour.getHour()[1]);
		}
		else {
			hoursMinutes = hoursMinutes + String.valueOf(hour.getHour()[1]);
		}

		return Integer.parseInt(hoursMinutes);
	}

//	Sobrecarga de metodo
	public void setHour(Hour hour) {
		this.hour = hour;
	}
	public void setHour(int hour, int minutes) {
		this.hour.setHour(hour, minutes);;
	}
	
	public String getFly() {
		String dataFly = hoursMinutes.substring(0, 2) + ":" + hoursMinutes.substring(2, 4) + " " + getCity();
		return dataFly;
	}
}
