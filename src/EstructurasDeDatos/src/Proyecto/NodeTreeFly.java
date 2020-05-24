package Proyecto;

import Estrc2509.NodeTree;

public class NodeTreeFly {
	//Declaracion de atributos
	
	Fly key;
	NodeTreeFly parent;
	NodeTreeFly leftChild;
	NodeTreeFly rightChild;
	int heightR;
	int heightL;
	   
	//Constructor
	public NodeTreeFly(Fly key, int heightR, int heightL){
		this.key=key;
	}
   
 	//Metodos getter and setters
	
	public String getKey() {
		return key.getFly();
	}
	public int getHour() {		
		return key.getHour();
	}
	public void setKey(Fly key) {
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
	public NodeTreeFly getParent(){
		return parent;
	}
	public void setParent(NodeTreeFly parent){
		this.parent = parent;
	}
	public NodeTreeFly getLeftChild(){
		return leftChild;
	}
	public void setLeftChild(NodeTreeFly leftChild){
		this.leftChild = leftChild;
	}
	public NodeTreeFly getRightChild(){
		return leftChild;
	}
	public void setRightChild(NodeTreeFly rightChild){
		this.rightChild = rightChild;
	}
	
    //Metodo toString
	
	public String toString(){
		String s=" "+key+" ";
		return s;
	}
}
