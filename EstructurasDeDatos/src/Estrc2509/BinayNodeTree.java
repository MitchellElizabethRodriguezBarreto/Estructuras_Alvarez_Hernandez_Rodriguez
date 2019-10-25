package Estrc2509;

public class BinayNodeTree<T> {

	private T key;
	private BinayNodeTree<T> left;
	private BinayNodeTree<T> right;
	private BinayNodeTree<T> parent;
	
	public BinayNodeTree(T key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
	public void setLeft(BinayNodeTree<T> left) {
		this.left = left;
	}
	
	public BinayNodeTree<T> getLeft() {
		return this.left;
	}
	
	public void setRight(BinayNodeTree<T> right) {
		this.right = right;
	}

	public BinayNodeTree<T> getRight() {
		return this.right;
	}
	
	public void setParent(BinayNodeTree<T> parent) {
		this.parent = parent;
	}

	public BinayNodeTree<T> getParent() {
		return this.parent = parent;
	}

	public T getKey() {
		return this.key;
	}


	
}
