package Estrc2509;

public class NodeTree {
	//Declaracion de atributos
	
	int key;
	NodeTree parent;
	NodeTree leftChild;
	NodeTree rightChild;
	int heightR;
	int heightL;
	   
	//Constructor
	public NodeTree(int key, int heightR, int heightL){
		this.key=key;
	}
   
 	//Metodos getter and setters
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getHeightR() {
		return heightR;
	}
	public void setHeightR(int heightR) {
		this.heightR = heightR;
	}
	public int getHeightL() {
		return heightR;
	}
	public void setHeightL(int heightL) {
		this.heightL = heightL;
	}
	public NodeTree getParent(){
		return parent;
	}
	public void setParent(NodeTree parent){
		this.parent = parent;
	}
	public NodeTree getLeftChild(){
		return leftChild;
	}
	public void setLeftChild(NodeTree leftChild){
		this.leftChild = leftChild;
	}
	public NodeTree getRightChild(){
		return leftChild;
	}
	public void setRightChild(NodeTree rightChild){
		this.rightChild = rightChild;
	}
	
    //Metodo toString
	
	public String toString(){
		String s=" "+key+" ";
		return s;
	}
}