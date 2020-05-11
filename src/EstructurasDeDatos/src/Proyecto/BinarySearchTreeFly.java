package Proyecto;

import Estrc2509.NodeTree;

public class BinarySearchTreeFly {
	//Declaracion de atributos
	public NodeTreeFly root;
  
	//Constructor sin parametros
	public BinarySearchTreeFly(){
	root=null;
	}
	
	
	public NodeTreeFly find(int key, NodeTreeFly root) {
		NodeTreeFly refNode = root;
		
		if(empty()) {
			return null;
		}
		else if(key < refNode.getHour() && refNode.leftChild != null) {
			refNode = refNode.leftChild;
			if(key == refNode.getHour()) {
			}
			else {
				refNode = find(key,refNode);
			}
		}
		else if(key > refNode.getHour() && refNode.rightChild != null) {
			refNode = refNode.rightChild;
			if (key == refNode.getHour()) {				
			}
			else {
				refNode = find(key,refNode);
			}
		}
		return refNode;
	}
	
	public NodeTreeFly next(NodeTreeFly Node) {
		NodeTreeFly nextNode = Node;
		
		if(Node == this.root | this.root == null) {
			nextNode = null; 
		}
		if(Node.rightChild == null) {
			nextNode = rightAncestor(Node);
		}
		else {
			nextNode = leftDescendant(Node.rightChild);
		}
		return nextNode;
	}
	
	public NodeTreeFly leftDescendant(NodeTreeFly Node) {
		while(Node.leftChild != null) {
			Node = Node.leftChild;
		}			
		return Node;
	}
	
	public NodeTreeFly rightAncestor (NodeTreeFly n) {
		if (n.getHour() < n.parent.getHour()) {
			return n.parent;
		} else {
			return rightAncestor(n.parent);
		}
	}
	
	public NodeTreeFly rightDescendant (NodeTreeFly n) {
		if (n.rightChild==null) {
			return n;
		} else {
			return n.rightChild;
		}
	}
	public boolean empty() {
		if(this.root == null) {
			//System.out.println("El arbol esta vacio");
			return true;
		}
		else {
			//System.out.println("El arbol esta vacio");
			return false;
		}
	}	

	public void inOrder(NodeTreeFly root) {
		if(root==null) {
			return;
		} else {
			inOrder(root.leftChild);
			// System.out.println(root.key+" L "+root.heightL+" R "+root.heightR + " left " + root.leftChild  + " right " + root.rightChild);
			System.out.println(root.key.getFly() +" L "+root.heightL+" R "+root.heightR);
			inOrder(root.rightChild);
		}
	}

	public void preOrder(NodeTreeFly root) {
		if(root==null) {
			return;
		} else {
			System.out.println(root.key.getFly() +" L "+root.heightL+" R "+root.heightR);
			preOrder(root.leftChild);
			preOrder(root.rightChild);
		}
	}
	
	public void postOrder(NodeTreeFly root) {
		if(root==null) {
			return;
		} else {
			postOrder(root.leftChild);
			postOrder(root.rightChild);
			System.out.println(root.key.getFly() +" L "+root.heightL+" R "+root.heightR);
		}
	}
	
	public NodeTreeFly min () {
		NodeTreeFly minNode = this.root;
		while(minNode.leftChild!=null) {
			minNode=minNode.leftChild;
		}
		//System.out.println(minNode.key);
		return minNode;
	}
	
	public NodeTreeFly max () {
		NodeTreeFly maxNode = this.root;
		while(maxNode.rightChild!=null) {
			maxNode=maxNode.rightChild;
		}
		//System.out.println(maxNode.key);
		return maxNode;
	}
	
	public void insert(Fly key) {
		int heightR=0;
		int heightL=0;
		NodeTreeFly newNode = new NodeTreeFly (key,heightR,heightL);		
		NodeTreeFly parentNode = null;
		if(empty()) {
			this.root = newNode;
			parentNode = null;
		} else {
			parentNode = find(key.getHour(), this.root);
			//System.out.println("padre: " + parentNode.key);
			if(key.getHour() < parentNode.getHour() && parentNode.leftChild == null) {				
				parentNode.leftChild = newNode;
				newNode.parent = parentNode;
				newNode.leftChild = null;
				newNode.rightChild = null;
				height(parentNode);
			} else if(key.getHour() > parentNode.getHour() && parentNode.rightChild == null) {
				parentNode.rightChild = newNode;
				newNode.parent = parentNode;
				newNode.leftChild = null;
				newNode.rightChild = null;
				height(parentNode);
			}
		}
	}
	public void delete(Fly key) {
		NodeTreeFly oldNode = find(key.getHour(), this.root);
		NodeTreeFly newNode = next(oldNode);
		if(empty() | next(oldNode) == null) {
			oldNode = null;
		} else if(oldNode.leftChild==null&&oldNode.rightChild==null) {
			if(key.getHour() > oldNode.parent.getHour()) {
				oldNode.parent.rightChild=null;
			} else {
				oldNode.parent.leftChild=null;
			}
			oldNode.parent=null;
		} else {			
			if(newNode.rightChild!=null) {
				newNode.parent.leftChild = newNode.rightChild;
				newNode.rightChild.parent = newNode.parent;
			} else {
				newNode.parent.rightChild =null;
			}
			if(key.getHour() > oldNode.parent.getHour()) {
				oldNode.parent.rightChild = newNode;
				if(oldNode.rightChild!=null) {
					oldNode.rightChild.parent = newNode;
					newNode.rightChild = oldNode.rightChild;
				}
				if(oldNode.leftChild!=null) {
					oldNode.leftChild.parent= newNode;
					newNode.leftChild = oldNode.leftChild;
				} else {
					newNode.leftChild=null;
				}
								
				newNode.parent = oldNode.parent;
			} else if(key.getHour() < oldNode.parent.getHour()) {
				oldNode.parent.leftChild = newNode;
				if(oldNode.rightChild!=null) {
					oldNode.rightChild.parent = newNode;
					newNode.rightChild = oldNode.rightChild;
				}			
				if(oldNode.leftChild!=null) {
					oldNode.leftChild.parent= newNode;
					newNode.leftChild = oldNode.leftChild;	
				}
				newNode.parent = oldNode.parent;
			}		
		}
		if(newNode.rightChild!=null) {
			height(newNode.rightChild);
		} else {
			height(newNode);
		}
	}
	
	
	public void height(NodeTreeFly nodito) {
		while(nodito!=null) {
			if(nodito.rightChild==null) {
				nodito.heightR=0;
			} else {
				int RR=nodito.rightChild.heightR;
				int RL=nodito.rightChild.heightL;
				if(RR>=RL) {
					nodito.heightR=RR+1;	
				} else {
					nodito.heightR=RL+1;
				}
			}
			if(nodito.leftChild==null) {
				nodito.heightL=0;
			} else {
				int LR=nodito.leftChild.heightR;
				int LL=nodito.leftChild.heightL;
				if(LR>=LL) {
					nodito.heightL=LR+1;	
				} else {
					nodito.heightL=LL+1;
				}
			}
			rebalance(nodito.getHour());
			nodito=nodito.parent;
		}
	}
	//El nodo gravedad es el que esta DESBALANCEADO y es el que va a caer
	public void rotateRight(int gravity) {
		NodeTreeFly gravedad=find(gravity,root);
		NodeTreeFly pivote = gravedad.leftChild;	
		if(gravedad.parent != null) {
			if (gravedad==gravedad.parent.leftChild) {
				gravedad.parent.leftChild=pivote;
			} else {
				gravedad.parent.rightChild=pivote;
			}
			pivote.parent=gravedad.parent;
			if (pivote.rightChild!=null) {
				gravedad.leftChild=pivote.rightChild;
				pivote.rightChild.parent=gravedad;
			} else {
				gravedad.leftChild=null;
			}
			pivote.rightChild=gravedad;
			gravedad.parent=pivote;
			height(gravedad);
		} else if(gravedad == this.root) {
			
			if (pivote.rightChild!=null) {
				gravedad.leftChild=pivote.rightChild;
				pivote.rightChild.parent=gravedad;
			} else {
				gravedad.leftChild=null;
			}
			pivote.parent=null;
			this.root=pivote;
			pivote.rightChild=gravedad;
			gravedad.parent=pivote;
			height(gravedad);
		}
	}
	public void rotateLeft(int gravity) {
		NodeTreeFly gravedad=find(gravity,root);
		NodeTreeFly pivote = gravedad.rightChild;
		if(gravedad.parent != null) {
			if (gravedad==gravedad.parent.leftChild) {
				gravedad.parent.leftChild=pivote;
			} else {
				gravedad.parent.rightChild=pivote;
			}
			pivote.parent=gravedad.parent;
			if (pivote.leftChild!=null) {
				gravedad.rightChild=pivote.leftChild;
				pivote.leftChild.parent=gravedad;
			} else {
				gravedad.rightChild=null;
			}
			pivote.leftChild=gravedad;
			gravedad.parent=pivote;
			height(gravedad);
		}
		else if(gravedad == this.root){

			if (pivote.leftChild!=null) {
				gravedad.rightChild=pivote.leftChild;
				pivote.leftChild.parent=gravedad;
			} else {
				gravedad.rightChild=null;
			}

			pivote.parent=null;
			this.root=pivote;
			pivote.leftChild=gravedad;
			gravedad.parent=pivote;
			height(gravedad);			
		}
		
	}
	public void rotateLeftRight(int a) {
		NodeTreeFly arriba=find(a,root);
		NodeTreeFly abajo=arriba.rightChild;
		if (arriba==arriba.parent.leftChild) {
			arriba.parent.leftChild=abajo;
		} else {
			arriba.parent.rightChild=abajo;
		}
		abajo.parent=arriba.parent;
		if (abajo.leftChild!=null) {
			arriba.rightChild=abajo.leftChild;
			abajo.leftChild.parent=arriba;
		} else {
			arriba.rightChild=null;
		}
		abajo.leftChild=arriba;
		arriba.parent=abajo;
		height(arriba);
		//rotateRight(abajo.parent.key);
	}
	public void rotateRightLeft(int a) {
		NodeTreeFly arriba=find(a,root);
		NodeTreeFly abajo=arriba.leftChild;
		if (arriba==arriba.parent.leftChild) {
			arriba.parent.leftChild=abajo;
		} else {
			arriba.parent.rightChild=abajo;
		}
		abajo.parent=arriba.parent;
		if (abajo.rightChild!=null) {
			arriba.leftChild=abajo.rightChild;
			abajo.rightChild.parent=arriba;
		} else {
			arriba.leftChild=null;
		}
		abajo.rightChild=arriba;
		arriba.parent=abajo;
		height(arriba);
		//rotateLeft(abajo.parent.key);
	}
	public void rebalance(int n){
		NodeTreeFly N=find(n,this.root);
		if(N==null) {
			return;
		} else {
			if(N.leftChild!=null) {				
				rebalance(N.leftChild.getHour());
			}
			if(N.heightR>N.heightL+1) {
				if(N.rightChild.heightR<N.rightChild.heightL) {	
					rotateRightLeft(N.rightChild.getHour());
				} else if (N.rightChild.heightR>N.rightChild.heightL){
					rotateLeft(N.getHour());
				}
			} else if (N.heightL>N.heightR+1) {
				if(N.leftChild.heightL<N.leftChild.heightR) {
					rotateLeftRight(N.leftChild.getHour());
				} else if (N.leftChild.heightL>N.leftChild.heightR) {
					rotateRight(N.getHour());
				}
			}
			if(N.rightChild!=null) {
				rebalance(N.rightChild.getHour());
			}
		}
	}

}
