package Estrc2509;

public abstract class Tree<T> {

	protected int depth;
	protected BinaryNodeTree<T> root;
	
	
	public abstract void insert(int k, BinaryNodeTree<T> root);
	public abstract void Delete(int k, BinaryNodeTree root);
	public abstract void Balance(BinaryNodeTree<T> root);
	
	public Tree() {
		this.depth = 0;
		this.root = null;
	}
	
	public int depth() {
		return this.depth;
	}

	public BinaryNodeTree<T> getRoot(){
		return this.root;
	}
	
	public void setRoot(BinaryNodeTree<T> root){
		this.root = root;
	}

	
}
