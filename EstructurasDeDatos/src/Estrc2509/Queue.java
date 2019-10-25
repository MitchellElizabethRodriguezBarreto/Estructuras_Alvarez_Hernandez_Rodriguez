package Estrc2509;

public class Queue<T> {
	
	private int size;
	private DoubleNode<T> head;
	private	DoubleNode<T> tail;
	
	public Queue() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	
	}

	public void enQueue(T key) {
		DoubleNode<T> node2 = new DoubleNode<>(key);
		node2.setNext(null);
		node2.setPrev(null);
		
		if(this.head == null) {
			this.tail = node2;
			this.head = tail;
		}
		else {
			this.tail.setNext(node2);
			node2.setPrev(this.tail);
			this.tail = node2;
		}
		size++;
	}

	public void deQueue() {
		if(this.isEmpty()) {
			System.out.println("La lista esta vacia!!!");
			return;
		}
		this.head = this.head.getNext();
		this.head.setPrev(null);
		size--;
	}

	public boolean isEmpty() {
		if(this.head == null && this.tail == null){
			return true;			
		}
		return false;
	}

	public DoubleNode<T> peek() {
		return this.head;
	}
	
	public void DisplayQueue() {
		if(this.head == null) {
			System.out.println("Lista Vacia...");
		}
		
		DoubleNode<T> p = this.head;
		while (p!=null) {
			System.out.println(p.getKey());
			p = p.getNext();
		}
	}
	
	public int getSize() {
		return this.size;
	}
	
}
