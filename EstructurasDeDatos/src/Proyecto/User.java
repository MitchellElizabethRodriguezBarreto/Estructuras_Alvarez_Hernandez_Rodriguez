package Proyecto;

public class User <T>{
	Data<T> head;
	Data<T> tail;
	int tam = 0;
	
	public void add(T reserva) {
		Data<T> valor = new Data<T> (reserva);
		
		if(this.head == null) {
			this.head = valor;
		}
		else {
			valor.prev = this.tail;
			this.tail.next = valor;
		}
		this.tail = valor;
		valor.next = null;
		//System.out.println("La reserva se ha añadido exitosamente");
		tam++;
	}
	
	public void delete(T reserva) {
		
		Data<T> valor = new Data<T> (reserva);
		
		if(this.head == null && this.tail == null) {
			System.out.println("La lista está vacía, no es posible eliminar reservas");
		} 
		else if(this.head == this.tail) {
			this.head = null;
			this.tail = null;
			System.out.println("La reserva se ha eliminado exitosamente");
			tam--;
		} 
		else {
			Data<T> busca_valor = this.head;
			
			for(int i = 0; i < tam; i++) {
				if(busca_valor.value != valor.value && busca_valor.next == null) {
					System.out.println("Ésta reserva no se ha encontrado, no es posible eliminarla");
				}
				else if(busca_valor.value == valor.value) {
						busca_valor.prev.next = busca_valor.next;
						busca_valor.next.prev = busca_valor.prev;
						busca_valor.prev = null;
						busca_valor.next = null;
						System.out.println("La reserva se ha eliminado exitosamente");
						tam--;
						break;						
				}
				
				if(busca_valor.next != null) {
					busca_valor = busca_valor.next;
				}				
			}
		}
	}
	
	public void empty() {
		if(this.head == null && this.tail == null) {
			System.out.println("La lista está vacía, no se encontró ninguna reserva");
		}
		else {
			System.out.println("La lista si presenta reservas");
		}
	}
	
	public void show() {
		if(this.head == null && this.tail == null) {
			System.out.println("La lista está vacía, no es posible mostrala");
		}
		else {
			Data<T> valor = this.head;
			System.out.println("Las reservas encontradas son las siguientes:");
			
			for(int i = 0; i < tam; i++) {
				array((String[])valor.value);
				valor = valor.next;
			}
		}
	}
	
	public void array(String[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();		
	}
	
	public void search(T reserva) {
		Data<T> valor = new Data<T> (reserva);
		
		if(this.head == null && this.tail == null) {
			System.out.println("La lista está vacía, esta reserva no existe");
		}
		else {
			Data<T> busca_valor = this.head;
			for(int i = 0; i < tam; i++) {
				if(busca_valor.value != valor.value && busca_valor.next == null) {
					System.out.println("Esta reserva no se ha encontrado");
				}
				else if(busca_valor.value == valor.value) {
					System.out.println("Los datos de la reserva solicitada son:");
					array((String[])valor.value);
					break;
				}
				if(busca_valor.next != null) {
					busca_valor = busca_valor.next;
				}
			}	
		}
	}
}