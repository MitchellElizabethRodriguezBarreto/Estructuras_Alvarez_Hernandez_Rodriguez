package Estrc2509;

import java.awt.Insets;

public class Tree<T> {
	
	private int size;
	private BinaryNodeTree<T> root;
	
	
	public Tree() {
		this.size = 0;
		this.root = null;
	}
	
	public BinaryNodeTree<T> getRoot (){
		return this.root;
	}
	
	public int size() {
		return this.size;
	}
	
	public BinaryNodeTree<T> find(int k, BinaryNodeTree<T> root) {
		
		
		if(this.root == null) {
			System.out.println("Arbol vacio");
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
	
	public BinaryNodeTree<T> next(BinaryNodeTree<T> N){

		
		if(N.getRight() != null) {
			return leftDescendant(N.getRight());
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
		
		if(N.getParent() == null) {
			return null;
		}
		
		if(N.getKey() < N.getParent().getKey()) {
			return N.getParent();
		}else {
			return rightAncestor(N.getParent());
		}
	}
	
	
	public DoubleLinkedList<BinaryNodeTree<T>> rangeSearch(int x, int y, BinaryNodeTree<T> root){
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
	
//	public void insertAVL(int k, BinaryNodeTree<T> root) {
//		insert(k, root);
//		BinaryNodeTree<T> N = find(k, root);
//		rebalance(N);
//	}
//	
//	
//	public void AVLDelete(int k) {
//		Delete(k, this.root);
//		BinaryNodeTree<T> M = (?)
//		rebalance(M);
//	}
	
	private void rebalance(BinaryNodeTree<T> N) {
		BinaryNodeTree<T> P = N.getParent();
		if(N.getLeft().getHeight() > N.getRight().getHeight() +1) {
			rebalanceRight(N);
		}
		if(N.getRight().getHeight() > N.getLeft().getHeight() +1) {
			rebalanceLeft(N);
		}
		N.adjustHeight();
		
		if(P != null) {
			rebalance(P);
		}
		
	}

	private void rebalanceLeft(BinaryNodeTree<T> N) {
		BinaryNodeTree<T> M = N.getRight();
		
		if(M.getLeft().getHeight() > M.getRight().getHeight()) {
			rotateRight(M);
			M.adjustHeight();
		}
		rotateLeft(N);
		N.adjustHeight();		
	}

	private void rebalanceRight(BinaryNodeTree<T> N) {
		BinaryNodeTree<T> M = N.getLeft();
		
		if(M.getRight().getHeight() > M.getLeft().getHeight()) {
			rotateLeft(M);
			M.adjustHeight();
		}
		rotateRight(N);
		N.adjustHeight();
	}

	private void rotateRight(BinaryNodeTree<T> X) {
		BinaryNodeTree<T> P = X.getParent();
		BinaryNodeTree<T> Y = X.getLeft();
		BinaryNodeTree<T> B = Y.getRight();
		
		Y.setParent(P);
		if(P.getKey() > Y.getKey()) {
			P.setRight(Y);
		}else {
			P.setLeft(Y);
		}
		
		X.setParent(Y);
		Y.setRight(X);
		
		B.setParent(X);
		X.setLeft(B);
	}

	private void rotateLeft(BinaryNodeTree<T> X) {
		BinaryNodeTree<T> P = X.getParent();
		BinaryNodeTree<T> Y = X.getRight();
		BinaryNodeTree<T> B = Y.getLeft();
		
		Y.setParent(P);
		if(P.getKey() > Y.getKey()) {
			P.setLeft(Y);
		}else {
			P.setRight(Y);
		}
		
		X.setParent(Y);
		Y.setLeft(X);
		
		B.setParent(X);
		X.setRight(B);		
	}

	public void insert(int k, BinaryNodeTree<T> root) {
		BinaryNodeTree<T> N = find(k,root);
		
		if(this.root == null) {
			this.root = new BinaryNodeTree<T>(k);
			return;
		}
		
		if(N.getKey() == k) {
			System.out.println("Ese elemento ya se encuentra en el arbol. No agregado " + k);
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
	
	public void Delete(int k, BinaryNodeTree<T> root) {
		BinaryNodeTree<T> N = find(k, root);
		
		
		if(this.root == null) {
			System.out.println("Arbol vacio");
			return;
		}
		
		
	
		if(N.getKey() != k) {
			System.out.println("Ese elemento no se encuentra en el arbol. No eliminado");
			return;
			
		}
		
		else if(N.getLeft() == null && N.getRight() == null) {
			if(N.getParent() == null) {
				this.root = null;
			}else if(k < N.getParent().getKey() ){
				N.getParent().setLeft(null);
			}else {
				N.getParent().setRight(null);
			}
		}
		
		/*
		 * completar code!!! para eliminar
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
	
	public void levels() {
		
	}
	
}