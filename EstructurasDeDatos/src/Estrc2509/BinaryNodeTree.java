package Estrc2509;

public class BinaryNodeTree<T> {

	private int key;
	private int Height;
	
	private BinaryNodeTree<T> left;
	private BinaryNodeTree<T> right;
	private BinaryNodeTree<T> parent;
	
	
	public BinaryNodeTree(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
		this.Height = 0;
	}
	
	public void adjustHeight(){
		if(this.left == null && this.right == null) {
			this.Height = 0;
		}
		else if(this.right == null) {
			this.Height = 1 + this.left.getHeight();
		}
		else if(this.left == null ) {
			this.Height = 1 + this.right.getHeight();;
		}
		else {
			setHeight(1 + Math.max(this.left.getHeight(), this.right.getHeight()));			
		}
	}

	public void setLeft(BinaryNodeTree<T> left) {
		this.left = left;
	}
	
	public BinaryNodeTree<T> getLeft() {
		return this.left;
	}
	
	public void setRight(BinaryNodeTree<T> right) {
		this.right = right;
	}

	public BinaryNodeTree<T> getRight() {
		return this.right;
	}
	
	public void setParent(BinaryNodeTree<T> parent) {
		this.parent = parent;
	}

	public BinaryNodeTree<T> getParent() {
		return this.parent;
	}

	public int getKey() {
		return this.key;
	}

	
	public int getHeight() {
		return this.Height;
	}

	
	public void setHeight(int height) {
		this.Height = height;
	}

	

	
}
