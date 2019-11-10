package Estrc2509;

public class Test {


	
	public static void main(String[] args) {
		Tree<Integer> arbol = new Tree<Integer>();
		
		arbol.insert(4, arbol.getRoot());
		arbol.insert(5, arbol.getRoot());
		arbol.insert(2, arbol.getRoot());
		arbol.insert(3, arbol.getRoot());
		arbol.insert(1, arbol.getRoot());
		
		System.out.println(arbol.getRoot().getKey());		
		System.out.println(arbol.next(arbol.getRoot()).getKey());
		
		System.out.println(arbol.getRoot().getRight().getKey());				
		
		
	}

}
