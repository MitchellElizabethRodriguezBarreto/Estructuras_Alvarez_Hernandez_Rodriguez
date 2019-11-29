package Estrc2509;

public class DynamicArray {

	public int[] array;
	private int n;
	private int size;
	
	public DynamicArray(int n) {
		array = new int[n];
		this.n = n;
		this.size = 0;
	}

	
	public void delete(int k) {
		if(k>=size) {
			return;
		}
		for(int i = k; i <= this.size; i++) {
			if(i == n-1) {
				this.array[i] = 0;
			}
			else {
				this.array[i] = this.array[i+1];
			}
		}
		
		if(this.size == (n/2)-1) {
			setNMiddle(n);
		}
		
		this.size--;
	}
	
	public void add(int kn) {
//		System.out.println(this.n + " " + this.size);
		if(this.size > this.n-1) {
			setNDouble(n);
		}
//		System.out.println(this.n + " " + this.size);
		array[this.size] = kn;
		this.size++;
	}
	
	
	public int getN() {
		return n;
	}

	public void setNMiddle(int n) {
		this.n = n/2;
		int[] newArray = new int[n];
		for(int i = 0; i<(this.size); i++) {
			newArray[i] = this.array[i];
		}
		this.array = newArray;
	}
	public void setNDouble(int n) {
		this.n = n*2;
		int newArray[] = new int[this.n];
		for(int i = 0; i<(this.size); i++) {
			newArray[i] = this.array[i];
		}
		this.array = newArray;
	}

	public int getSize() {
		return size;
	}
	
	public void display() {
		for(int i = 0; i < this.size ; i++) {
			System.out.print(this.array[i] + " - ");
		}
	}
}
