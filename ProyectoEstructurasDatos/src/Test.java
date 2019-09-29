package Estrc2509;

public class Test {


	public static void main(String[] args) {

		ArrayList<int[]> list = new ArrayList();
		int[] pepe = new int[5];
		pepe[0]=5;
		pepe[1]=4;
		pepe[2]=3;
		pepe[3]=2;
		pepe[4]=1;
		
		int[] pepe2 = new int[5];
		pepe2[0]=11;
		pepe2[1]=12;
		pepe2[2]=13;
		pepe2[3]=14;
		pepe2[4]=15;
		
		list.PushFront(pepe);
		list.PushBack(pepe2);
		list.DisplayList();
		
		
//		DoubleLinkedList<Integer> dlList = new DoubleLinkedList<>();
//
//		System.out.println("Adicionando con PushFront");
//		dlList.PushFront(1);
//		dlList.PushFront(2);
//		dlList.PushFront(3);
//		dlList.PushFront(4);
//		dlList.PushFront(5);
//		
//		System.out.println("\n \n Adicionando con PushBack");
//		dlList.PushBack(5);
//		dlList.PushBack(6);
//		dlList.PushBack(7);
//		dlList.PushBack(8);
//		dlList.PushBack(9);
//		
//		
//		System.out.println("\\n \\n Buscando valor en la lista");
//		dlList.DisplayList();
//		
//		System.out.println("\n \n Buscando valor en la lista");
//		DoubleNode<Integer> a = dlList.FindByKey(8);
//		
//		if(a != null) {
//			
//			System.out.println("Nodo Encontrado " + a.getKey());
//			
//			System.out.println("Adicionando nuevo valor antes del valor encontrado:" + a.getKey());
//			dlList.AddBefore(a, 10);
//			
//			System.out.println("\n \n Enlistando denuevo");
//			dlList.DisplayList();
//			
//		}
//		else {
//			System.out.println("No encontrado");
//		}
		
		
		
	}

}
