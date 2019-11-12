package Proyecto;

public class Fly {

	private boolean availability;
	private Destination city;
	private int price;
	private Chairs chairs;
	private Hour hour;
	
	
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


	public int[] getHour() {
		return hour.getHour();
	}

//	Sobrecarga de metodo
	public void setHour(Hour hour) {
		this.hour = hour;
	}
	public void setHour(int hour, int minutes) {
		this.hour.setHour(hour, minutes);;
	}
	
}
