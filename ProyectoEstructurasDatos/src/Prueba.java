
public class Prueba {
	public static void main(String[] args) {
		ManagementPeople<int[]> list = new ManagementPeople<int[]>();
		int[] datos1 = new int[5];
		datos1[0]=5;
		datos1[1]=4;
		datos1[2]=3;
		datos1[3]=2;
		datos1[4]=1;
		
		int[] datos2 = new int[5];
		datos2[0]=11;
		datos2[1]=12;
		datos2[2]=13;
		datos2[3]=14;
		datos2[4]=15;
		
		int[] datos3 = new int[5];
		datos3[0]=20;
		datos3[1]=19;
		datos3[2]=18;
		datos3[3]=17;
		datos3[4]=16;
		
		list.Vac�a();
		list.Annadir(datos1);
		list.Annadir(datos2);		
		list.Annadir(datos3);
		list.Buscar(datos3);
		list.Mostrar();
		list.Vac�a();
		list.Eliminar(datos2);
		list.Mostrar();
	}
}
