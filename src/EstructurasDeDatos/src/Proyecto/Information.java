package Proyecto;

import Estrc2509.BinarySearchTree;

public class Information {
	BinarySearchTree hours = new BinarySearchTree();
	BinarySearchTree minutes = new BinarySearchTree();
	
	public int filterMinutes(String filter) {
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
			minutes.min();
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
			hours.min();
			System.out.println("Su vuelo es a las: " + hours.max().getKey() + ":" + minute);
		}
	}
}
