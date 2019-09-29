
public class ManagementPeople <T>{
	Data<T> head;
	Data<T> tail;
	int tam = 0;
	
	public void Annadir(T reserva) {
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
		System.out.println("La reserva se ha a�adido exitosamente");
		tam++;
	}
	
	public void Eliminar(T reserva) {
		
		Data<T> valor = new Data<T> (reserva);
		
		if(this.head == null && this.tail == null) {
			System.out.println("La lista est� vac�a, no es posible eliminar reservas");
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
					System.out.println("�sta reserva no se ha encontrado, no es posible eliminarla");
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
	
	public void Vac�a() {
		if(this.head == null && this.tail == null) {
			System.out.println("La lista est� vac�a, no se encontr� ninguna reserva");
		}
		else {
			System.out.println("La lista si presenta reservas");
		}
	}
	
	public void Mostrar() {
		if(this.head == null && this.tail == null) {
			System.out.println("La lista est� vac�a, no es posible mostrala");
		}
		else {
			Data<T> valor = this.head;
			System.out.println("Las reservas encontradas son las siguientes:");
			
			for(int i = 0; i < tam; i++) {
				Arreglo((int[])valor.value);
				valor = valor.next;
			}
		}
	}
	
	public void Arreglo(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();		
	}
	
	public void Buscar(T reserva) {
		Data<T> valor = new Data<T> (reserva);
		
		if(this.head == null && this.tail == null) {
			System.out.println("La lista est� vac�a, �sta reserva no existe");
		}
		else {
			Data<T> busca_valor = this.head;
			for(int i = 0; i < tam; i++) {
				if(busca_valor.value != valor.value && busca_valor.next == null) {
					System.out.println("�sta reserva no se ha encontrado");
				}
				else if(busca_valor.value == valor.value) {
					System.out.println("Los datos de la reserva solicitada son:");
					Arreglo((int[])valor.value);
					break;
				}
				if(busca_valor.next != null) {
					busca_valor = busca_valor.next;
				}
			}	
		}
	}		
		
}
