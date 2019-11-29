package Estrc2509;

public class HeapTree extends DynamicArray{

	private boolean isMax = false;
	
	public HeapTree(boolean isMax) {
		super(1);
		add(0);
		this.isMax = isMax;
	}

	
	//intercambio
	private void change(int n, int n2) {
		int aux = this.array[n2];
		this.array[n2] = this.array[n];
		this.array[n] = aux;
	}
	
	//Hundir
	public void sink(int nRoot) {
		
//		System.out.println("entra " + nRoot + " size " +  this.size);
		
		if(nRoot > this.size) {
			return;
		}
		if((nRoot*2)+1 > this.N || (nRoot*2) > this.N) {
			return;
		}
		else {
			if(this.isMax) {
				if(this.array[nRoot*2] > this.array[(nRoot*2)+1]) {
					change(nRoot, (nRoot*2));

//					System.out.println((nRoot < this.size-1) + "^" + ((nRoot*2)+1 > this.size) + "||" + ((nRoot*2) > this.size));
//					System.out.println("root " + nRoot + " N " + this.N);

					if(nRoot < this.size-1 && (	(nRoot*2)+1 > this.size || (nRoot*2) > this.size) ) {
						this.array[nRoot] = this.array[size-1];
						this.array[size-1] = 0;
						return;
					}
					sink((nRoot*2));
				}else {
					change(nRoot, (nRoot*2)+1);
					
//					System.out.println((nRoot < this.size-1) + "^" + ((nRoot*2)+1 > this.size) + "||" + ((nRoot*2) > this.size));
//					System.out.println("root " + nRoot + " N " + this.N);
					
					if(		nRoot < this.size-1 && 
							(	(nRoot*2)+1 > this.size || (nRoot*2) > this.size) ) {
						
						this.array[nRoot] = this.array[size-1];
						this.array[size-1] = 0;
						floatUp(nRoot);
						return;
						
					}
					sink((nRoot*2)+1);
				}			
				
			}
			else {
												
				if(this.array[nRoot*2] < this.array[(nRoot*2)+1]) {
					change(nRoot, (nRoot*2));

//					System.out.println((nRoot < this.size-1) + "^" + ((nRoot*2)+1 > this.size) + "||" + ((nRoot*2) > this.size));
//					System.out.println("root " + nRoot + " N " + this.N);

					if(		nRoot < this.size-1 && 
							(	(nRoot*2)+1 > this.size || (nRoot*2) > this.size) ) {
						this.array[nRoot] = this.array[size-1];
						this.array[size-1] = 0;
						return;
					}
					sink((nRoot*2));
				}else {
					change(nRoot, (nRoot*2)+1);
					
//					System.out.println((nRoot < this.size-1) + "^" + ((nRoot*2)+1 > this.size) + "||" + ((nRoot*2) > this.size));
//					System.out.println("root " + nRoot + " N " + this.N);
					
					if(		nRoot < this.size-1 && 
							(	(nRoot*2)+1 > this.size || (nRoot*2) > this.size) ) {
						
						this.array[nRoot] = this.array[size-1];
						this.array[size-1] = 0;
						floatUp(nRoot);
						return;
						
					}
					sink((nRoot*2)+1);
				}
			}
		}
	}
	//flotar
	public void floatUp(int n) {
		if(isMax) {
			if(n/2 == 0) {	return;	}
			if(this.array[n] > this.array[n/2]) {
				change(n, (n/2));
				floatUp(n/2);
			}			
		}
		else {
			if(n/2 == 0) {	return;	}
			if(this.array[n] < this.array[n/2]) {
				change(n, (n/2));
				floatUp(n/2);
			}	
		}
	}
	
	//Inutilizo delete
	@Override
	public void delete(int kn) {
		//FIXME que carajos hago con esto
	}
	
	public int delete() {
		int returned = this.array[1];
		this.array[1] = 0;
		sink(1);
		this.size--;
		return returned;
	}
	
	//I add one line to the function
	@Override
	public void add(int kn) {
		super.add(kn);
		floatUp(this.size-1);
	}
	
}
