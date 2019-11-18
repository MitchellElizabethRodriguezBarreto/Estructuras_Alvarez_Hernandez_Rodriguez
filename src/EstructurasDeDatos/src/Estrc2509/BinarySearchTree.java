package Estrc2509;

public class BinarySearchTree {
	//Declaracion de atributos
	public NodeTree root;
  
	//Constructor sin parametros
	public BinarySearchTree(){
	root=null;
	}
	/*
	public NodeTree find (int key, NodeTree root) {
		if (root.key==key) {
			return root;
		} else if (root.key>key) {
			if (root.leftChild!=null) {
				return find(key, root.leftChild);
			}
			return root;
		} else {
			return find(key, root.rightChild);
		}
	}
	*/
	//Falta hacer la funcion Append que es unir nodos para poder hacer la busqueda
	/*public NodeTree rangeSearch(int x, int y, NodeTree root) {
		NodeTree l = null;
		NodeTree n = find(x,root);
		while (n.key<=y) {
			if (n.key>=x) {
				l=l.Append(n);
			}
			n=next(n);
		}
		return l;
	}*/
	
	public NodeTree rightDescendant (NodeTree n) {
		if (n.rightChild==null) {
			return n;
		} else {
			return n.rightChild;
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
				System.out.println("JUEPUTA");
				if(oldNode.leftChild!=null) {
					System.out.println("JUEPUTA");
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
