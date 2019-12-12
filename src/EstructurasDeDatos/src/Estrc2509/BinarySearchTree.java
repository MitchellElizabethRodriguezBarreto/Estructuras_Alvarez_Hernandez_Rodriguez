package Estrc2509;

public class BinarySearchTree {
	//Declaracion de atributos
	public NodeTree root;
  
	//Constructor sin parametros
	public BinarySearchTree(){
	root=null;
	}
	
	public NodeTree find(double key, NodeTree root) {
		NodeTree refNode = root;
		
		if(empty()) {
			return null;
		}
		else if(key < refNode.key && refNode.leftChild != null) {
			refNode = refNode.leftChild;
			if(key == refNode.key) {
			}
			else {
				refNode = find(key,refNode);
			}
		}
		else if(key > refNode.key && refNode.rightChild != null) {
			refNode = refNode.rightChild;
			if (key == refNode.key) {				
			}
			else {
				refNode = find(key,refNode);
			}
		}
		return refNode;
	}
	
	public NodeTree next(NodeTree Node) {
		NodeTree nextNode = Node;
		
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
	
	public NodeTree leftDescendant(NodeTree Node) {
		while(Node.leftChild != null) {
			Node = Node.leftChild;
		}			
		return Node;
	}
	
	public NodeTree rightAncestor (NodeTree n) {
		if (n.key<n.parent.key) {
			return n.parent;
		} else {
			return rightAncestor(n.parent);
		}
	}
	
	public NodeTree rightDescendant (NodeTree n) {
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

	public void inOrder(NodeTree root) {
		if(root==null) {
			return;
		} else {
			inOrder(root.leftChild);
			// System.out.println(root.key+" L "+root.heightL+" R "+root.heightR + " left " + root.leftChild  + " right " + root.rightChild);
			System.out.println(root.key+" L "+root.heightL+" R "+root.heightR);
			inOrder(root.rightChild);
		}
	}

	public void preOrder(NodeTree root) {
		if(root==null) {
			return;
		} else {
			System.out.println(root.key+" L "+root.heightL+" R "+root.heightR);
			preOrder(root.leftChild);
			preOrder(root.rightChild);
		}
	}
	
	public void postOrder(NodeTree root) {
		if(root==null) {
			return;
		} else {
			postOrder(root.leftChild);
			postOrder(root.rightChild);
			System.out.println(root.key+" L "+root.heightL+" R "+root.heightR);
		}
	}
	
	public NodeTree min () {
		NodeTree minNode = this.root;
		while(minNode.leftChild!=null) {
			minNode=minNode.leftChild;
		}
		//System.out.println(minNode.key);
		return minNode;
	}
	
	public NodeTree max () {
		NodeTree maxNode = this.root;
		while(maxNode.rightChild!=null) {
			maxNode=maxNode.rightChild;
		}
		//System.out.println(maxNode.key);
		return maxNode;
	}
	
	public void insert(int key) {
		int heightR=0;
		int heightL=0;
		NodeTree newNode = new NodeTree (key,heightR,heightL);		
		NodeTree parentNode = null;
		if(empty()) {
			this.root = newNode;
			parentNode = null;
		} else {
			parentNode = find(key, this.root);
			//System.out.println("padre: " + parentNode.key);
			if(key < parentNode.key && parentNode.leftChild == null) {				
				parentNode.leftChild = newNode;
				newNode.parent = parentNode;
				newNode.leftChild = null;
				newNode.rightChild = null;
				height(parentNode);
			} else if(key > parentNode.key && parentNode.rightChild == null) {
				parentNode.rightChild = newNode;
				newNode.parent = parentNode;
				newNode.leftChild = null;
				newNode.rightChild = null;
				height(parentNode);
			}
		}
	}
	public void delete(int key) {
		NodeTree oldNode = find(key, this.root);
		NodeTree newNode = next(oldNode);
		if(empty() | next(oldNode) == null) {
			oldNode = null;
		} else if(oldNode.leftChild==null&&oldNode.rightChild==null) {
			if(key>oldNode.parent.key) {
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
			if(key > oldNode.parent.key) {
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
			} else if(key < oldNode.parent.key) {
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
	
	
	public void height(NodeTree nodito) {
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
			rebalance(nodito.key);
			nodito=nodito.parent;
		}
	}
	//El nodo gravedad es el que esta DESBALANCEADO y es el que va a caer
	public void rotateRight(int gravity) {
		NodeTree gravedad=find(gravity,root);
		NodeTree pivote = gravedad.leftChild;	
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
		NodeTree gravedad=find(gravity,root);
		NodeTree pivote = gravedad.rightChild;
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
		NodeTree arriba=find(a,root);
		NodeTree abajo=arriba.rightChild;
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
		NodeTree arriba=find(a,root);
		NodeTree abajo=arriba.leftChild;
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
		NodeTree N=find(n,this.root);
		if(N==null) {
			return;
		} else {
			if(N.leftChild!=null) {				
				rebalance(N.leftChild.key);
			}
			if(N.heightR>N.heightL+1) {
				if(N.rightChild.heightR<N.rightChild.heightL) {	
					rotateRightLeft(N.rightChild.key);
				} else if (N.rightChild.heightR>N.rightChild.heightL){
					rotateLeft(N.key);
				}
			} else if (N.heightL>N.heightR+1) {
				if(N.leftChild.heightL<N.leftChild.heightR) {
					rotateLeftRight(N.leftChild.key);
				} else if (N.leftChild.heightL>N.leftChild.heightR) {
					rotateRight(N.key);
				}
			}
			if(N.rightChild!=null) {
				rebalance(N.rightChild.key);
			}
		}
	}
}
