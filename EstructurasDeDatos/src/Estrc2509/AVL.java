package Estrc2509;

public class AVL<T> extends Tree{
	


	public AVL() {
		super();
	}
	
	
	@Override
	public void Balance(BinaryNodeTree root) {
		// TODO Auto-generated method stub
		
	}
	
	
	public BinaryNodeTree<T> find(int k, BinaryNodeTree<T> root) {
		
		if(super.root == null) {
			System.out.println("El arbol esta vacio");
			return null;
		}
		
		
		if(k == root.getKey()) {
			return root;
		}
		else if(root.getKey() > k) {
			if(root.getLeft() != null) {
				return find(k, root.getLeft());
			}else {
				return root;
			}
		}
		else {
			if(root.getRight() != null) {
				return find(k, root.getRight());
			}else {
				return root;
			}
		}
	}

	/*
	public void CalculateDepth() {
		
	}
	*/
	
	public BinaryNodeTree<T> next(BinaryNodeTree<T> N){
		//NO PROBADO podria tener casos nullpointer.
		if(N.getRight() != null) {
			return leftDescendant(N);
		}
		else {
			return rightAncestor(N);
		}
	}
	
	private BinaryNodeTree<T> leftDescendant(BinaryNodeTree<T> N){
		if(N.getLeft() == null) {
			return N;
		}else {
			return leftDescendant(N.getLeft());
		}
	}
	private BinaryNodeTree<T> rightAncestor(BinaryNodeTree<T> N){
		if(N.getKey() < N.getParent().getKey()) {
			return N.getParent();
		}else {
			return rightAncestor(N.getParent());
		}
	}
	
	
	public DoubleLinkedList<BinaryNodeTree<T>> rangeSearch(int x, int y, BinaryNodeTree<T> root){
		//No probado (no se sabe si esto funciona =v pero compila)
		DoubleLinkedList<BinaryNodeTree<T>> L = new DoubleLinkedList<BinaryNodeTree<T>>();
		BinaryNodeTree<T> N = find(x, root);
		while(N.getKey() <= y ) {
			if(N.getKey() >= x) {
				L.PushBack(N);
			}
			N = next(N);
		}
		return L;
	}
	
	@Override
	public void insert(int k, BinaryNodeTree root) {
		
		BinaryNodeTree<T> N = find(k,root);

		if(super.root == null) {
			N = new BinaryNodeTree<>(k);
			super.root = N;
			return;
		}
		
		if(N.getKey() == k) {
			System.out.println("Ese elemento ya se encuentra en el arbol. No agregado");
			return;
		}else if(k < N.getKey() ) {
			BinaryNodeTree<T> left = new BinaryNodeTree<>(k);
			N.setLeft(left);
			left.setParent(N);
		}else {
			BinaryNodeTree<T> right = new BinaryNodeTree<>(k);
			N.setRight(right);
			right.setParent(N);
		}
		
	}
	
	@Override
	public void Delete(int k, BinaryNodeTree root) {
		
		if(super.root == null) {
			System.out.println("El arbol esta vacio. No eliminado");
			return;
		}
		
		BinaryNodeTree<T> N = find(k, root);
		
		if(N.getKey() != k) {
			System.out.println("Ese elemento no se encuentra en el arbol. No eliminado");
			return;
			
		}
		
		else if(N.getLeft() == null && N.getRight() == null) {
			if(N.getParent() == null) {
				super.root = null;
			}else if(k < N.getParent().getKey() ){
				N.getParent().setLeft(null);
			}else {
				N.getParent().setRight(null);
			}
		}
		
		/*
		 * completar code!!! para eliminar :c
		 */
		
	}
	
	
	
	public void preOrder(BinaryNodeTree<T> root) {
//		NODE, LEFT, RIGHT
		if(root == null) {
			return;
		}else {
			System.out.println(root.getKey());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
		
	public void postOrder(BinaryNodeTree<T> root) {
//		LEFT, RIGHT, NODE
		if(root == null) {
			return;
		}else {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.println(root.getKey());
		}
	}
	
	public void inOrder(BinaryNodeTree<T> root) {
//		LEFT, NODE RIGHT
		if(root == null) {
			return;
		}else {
			inOrder(root.getLeft());
			System.out.println(root.getKey());
			inOrder(root.getRight());
		}
	}

	
}