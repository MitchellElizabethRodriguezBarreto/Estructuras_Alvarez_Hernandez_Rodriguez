package Proyecto;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Estrc2509.BinarySearchTree;
import Estrc2509.Hash;
import Estrc2509.ListNumeric;

public class VisualInterface{
	
	
	
	//////
	
	Random rnd= new Random();
	Hash hashTable = new Hash(100);
	ListNumeric user = new ListNumeric();
	int[] arrayInfoSearch = new int[5];
	int[] arrayInfo = new int[4];
	
	private int convertStringCity(String city) {
		
		if("Destino" == city) {
			return -1;
		}
		
		if("Cartagena" == city) {
			return 0;
		}
		if("Barranquilla"== city) {
			return 5;
		}
		if("Bucaramanga" == city) {
			return 7;
		}
		if("Cali" == city) {
			return 3;
		}
		if("C�cuta" == city) {
			return 8;
		}
		if("Medell�n" == city) {
			return 2;
		}
		if("Monter�a" == city) {
			return 6;
		}
		if("San Andr�s" == city) {
			return 4;
		}
		if("Santa Marta" == city) {
			return 1;
		}
			
		return -2;
	} 
	
	
	/////
	JFrame frame = new JFrame("AeroUN");
	Container distribution = frame.getContentPane();
	
	Information info = new Information();
	String city;
	
	BinarySearchTree Users = new BinarySearchTree();
	//public String nameKey = "";
	
	public VisualInterface(Information infoFly) {
		frame.setSize(500,450);
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  		
  		info = infoFly;
  		for(int i = 0; i<4 ; i++) {
  			arrayInfo[i] = 0;
  			arrayInfoSearch[i] = 0;
  		};
  		arrayInfoSearch[4] = 1;
  		

	}
	
	// Primera ventana ------------------------------------------------------------------------------------------------------------------
	
	
	public void FirstWindow(){
	
		JPanel first = new JPanel();
		first.setLayout(new GridBagLayout());
		//distribution.setLayout(new GridBagLayout());
		
		//GridBagConstraints(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty, int anchor, int fill, Insets insets, int ipadx, int ipady)
		
		// Etiquetas -------------------------------------------------------------
		
		JLabel aero = new JLabel("AeroUN");
		GridBagConstraints locate0 = new GridBagConstraints();
		locate0.gridx = 0;
		locate0.gridy = 0;
		locate0.anchor = GridBagConstraints.CENTER;
		locate0.insets = new Insets(10, 20, 20, 20);
		locate0.gridwidth = 5;
		first.add(aero, locate0);
		
		JLabel labelName = new JLabel("Nombre:");
		GridBagConstraints locate1 = new GridBagConstraints();
		locate1.gridx = 0;
		locate1.gridy = 1;
		locate1.anchor = GridBagConstraints.WEST;
		locate1.insets = new Insets(10, 20, 10, 0);
		first.add(labelName, locate1);
		
		
		JLabel labelDate = new JLabel("C�dula");
		GridBagConstraints locate2 = new GridBagConstraints();
		locate2.gridx = 0;
		locate2.gridy = 2;
		locate2.anchor = GridBagConstraints.WEST;
		locate2.insets = new Insets(10, 20, 10, 0);
		first.add(labelDate, locate2);
		
		JLabel space1 = new JLabel(" ");
		GridBagConstraints locate3 = new GridBagConstraints();
		locate3.gridx = 2;
		locate3.gridy = 1;
		locate3.anchor = GridBagConstraints.WEST;
		locate3.weightx = 1.0;
		first.add(space1, locate3);
		
		/*JLabel labeleMail = new JLabel("Correo:");
		GridBagConstraints locate4 = new GridBagConstraints();
		locate4.gridx = 3;
		locate4.gridy = 1;
		locate4.anchor = GridBagConstraints.WEST;
		locate4.insets = new Insets(0, 0, 0, 20);
		first.add(labeleMail, locate4);	*/
		
		JLabel phrase = new JLabel("S�guenos! Y prep�rate para viajar con AeroUN");
		GridBagConstraints locate5 = new GridBagConstraints();
		locate5.gridx = 0;
		locate5.gridy = 5;
		locate5.anchor = GridBagConstraints.WEST;
		locate5.insets = new Insets(10, 20, 10, 0);
		locate5.gridwidth = 5;
		first.add(phrase, locate5);
		
		
		// Cajas de texto -------------------------------------------------------------
		
		JTextField name = new JTextField(10);
		GridBagConstraints locate6 = new GridBagConstraints();
		locate6.gridx = 2;
		locate6.gridy = 1;
		locate6.anchor = GridBagConstraints.WEST;
		first.add(name, locate6);

		JTextField id = new JTextField(10);
		GridBagConstraints locate7 = new GridBagConstraints();
		locate7.gridx = 2;
		locate7.gridy = 2;
		locate7.anchor = GridBagConstraints.WEST;
		first.add(id, locate7);		
			
		/*JTextField eMail = new JTextField(10);
		GridBagConstraints locate8 = new GridBagConstraints();
		locate8.gridx = 4;
		locate8.gridy = 1;
		locate8.anchor = GridBagConstraints.WEST;
		locate8.insets = new Insets(0, 0, 0, 20);
		first.add(eMail, locate8);	*/
		
		// Listas desplegables -------------------------------------------------------------
		
		JComboBox<String[]> origin = new JComboBox<String[]>();
		String[] orig = new String[]{"Origen","Barranquilla","Bucaramanga","Cali","Cartagena","C�cuta","Medell�n","Monter�a","San Andr�s","Santa Marta"};
		origin.setModel(new DefaultComboBoxModel(orig));
		
		GridBagConstraints locate9 = new GridBagConstraints();
		locate9.gridx = 0;
		locate9.gridy = 3;
		locate9.anchor = GridBagConstraints.WEST;
		locate9.insets = new Insets(10, 20, 10, 0);
		first.add(origin, locate9);
		
		JComboBox<String[]> destination = new JComboBox<String[]>();
		String[] des = new String[]{"Destino","Barranquilla","Bucaramanga","Cali","Cartagena","C�cuta","Medell�n","Monter�a","San Andr�s","Santa Marta"};
		destination.setModel(new DefaultComboBoxModel(des));
		
		
//		///
//		destination.addActionListener(new ActionListener() {
//			   @Override
//			   public void actionPerformed(ActionEvent e) {
//				   // Aqu� hacemos lo que queramos hacer.
//				   destination.setSelectedItem(e);
//			   }
//			});
//		///
		
		GridBagConstraints locate10 = new GridBagConstraints();
		locate10.gridx = 4;
		locate10.gridy = 3;
		locate10.anchor = GridBagConstraints.WEST;
		locate10.insets = new Insets(10, 0, 10, 20);
		first.add(destination, locate10);
				
		// Botones -------------------------------------------------------------
		
		JButton labelReservations = new JButton("Ver reservas");
		
		
		
		labelReservations.addActionListener(new AbstractAction(){ 
			 public void actionPerformed(ActionEvent e){ 
				 /*frame.setVisible(false); 
				 frame.dispose(); */
//				 String nameString=name.getText();
				 String idString=id.getText();
				 int idInt = Integer.parseInt(idString);
				 
				 
				 if(user.find(idInt)) {
					 arrayInfo = hashTable.find(idInt).getArray();
				 }
				 else{
					 
					 /*
					  * arrayInfo[0]--> Id
					  * arrayInfo[1]--> city
					  * arrayInfo[2]--> hora
					  * arrayInfo[3]--> minutos
					  * arrayInfo[4]--> silla
					  */
					 arrayInfo = new int[5];
					 //id
					 arrayInfo[0] = idInt;
					 //ciudad
					 city = (String) origin.getSelectedItem();
					 arrayInfo[1] = convertStringCity(city);;
					 System.out.println(city);
					 System.out.println(arrayInfo[1]);
					 //hora
					 arrayInfo[2] = 0;
					 //minutos
					 arrayInfo[3] = 0;
					 //silla
					 arrayInfo[4] = rnd.nextInt(30);
					 
					 user.PushFront(idInt);
					 hashTable.add(idInt);
					 hashTable.find(idInt).setArray(arrayInfo);
				 }
				 
				 
				 
				 first.setVisible(false);
				 ThirdWindow();
				 //frame.setVisible(false);				 
			 }

			
			});
		GridBagConstraints locate11 = new GridBagConstraints();
		locate11.gridx = 4;
		locate11.gridy = 2;
		locate11.anchor = GridBagConstraints.WEST;
		first.add(labelReservations, locate11);
		
		JButton searchFlight = new JButton("Buscar");
		
		searchFlight.addActionListener(new AbstractAction(){ 
			 public void actionPerformed(ActionEvent e){ 
				 /*frame.setVisible(false); 
				 frame.dispose(); */
				 //nameKey = name.getText();
				 // System.out.println("Nombre: " + name.getText());
				 // System.out.println("C�dula: " + id.getText());
				 // System.out.println("Nombre: " + eMail.getText());
				 // System.out.println("Origen: " + origin.getSelectedItem());
				 // System.out.println("Destino: " + destination.getSelectedItem());				
//				 String nameString=name.getText();
				 String idString=id.getText();
				 int idInt = Integer.parseInt(idString);
				 
				 
				 if(user.find(idInt)) {
					 arrayInfo = hashTable.find(idInt).getArray();
				 }
				 else{
					 arrayInfo = new int[5];
					 //id
					 arrayInfo[0] = idInt;
					 //ciudad
					 
					 city = (String) origin.getSelectedItem();
					 arrayInfo[1] = convertStringCity(city);
					 arrayInfoSearch[0] = arrayInfo[1];
					 //hora
					 arrayInfo[2] = 0;
					 //minutos
					 arrayInfo[3] = 0;
					 //silla
					 arrayInfo[4] = rnd.nextInt(30);
					 
					 user.PushFront(idInt);
					 hashTable.add(idInt);
					 
				 }
				 arrayInfoSearch[3] = arrayInfo[0];
				 
				 System.out.println(arrayInfoSearch[0] + "wey!");

				 first.setVisible(false);
				 SecondWindow();
				 
				 //frame.setVisible(false);				 
			 } 
			});
		
		GridBagConstraints locate12 = new GridBagConstraints();
		locate12.gridx = 4;
		locate12.gridy = 4;
		locate12.anchor = GridBagConstraints.EAST;
		locate12.insets = new Insets(50, 0, 0, 20);
		first.add(searchFlight, locate12);
				
		first.setVisible(true);
		distribution.add(first);
		
		frame.setVisible(true);	
	}
	
	// Segunda ventana ------------------------------------------------------------------------------------------------------------------
	
	@SuppressWarnings("null")
	public void SecondWindow(){ 
		
		JPanel second = new JPanel();
		second.setLayout(new GridBagLayout());
  		
  		JLabel aero = new JLabel("AeroUN");
  		GridBagConstraints locate0 = new GridBagConstraints();
  	    locate0.gridx = 0;
  	    locate0.gridy = 0;
  	    locate0.anchor = GridBagConstraints.CENTER;
  	    locate0.insets = new Insets(10, 20, 20, 20);
  	    locate0.gridwidth = 5;
  	    second.add(aero, locate0);
  	   
  	    JLabel labelName = new JLabel("Tu vuelo m�s:");
  	    GridBagConstraints locate1 = new GridBagConstraints();
  	    locate1.gridx = 0;
  	    locate1.gridy = 1;
  	    locate1.anchor = GridBagConstraints.WEST;
  	    locate1.insets = new Insets(10, 20, 10, 0);
  	    second.add(labelName, locate1);
  	   
  	    JComboBox<String[]> origin = new JComboBox<String[]>();
  	    String[] orig = new String[]{"Temprano", "Tarde"};
  	    origin.setModel(new DefaultComboBoxModel(orig));
  	    
  	   	JLabel sal = new JLabel("Hora de salida: " + arrayInfoSearch[1] + ":" + rnd.nextInt(59));
  	   	JLabel llegada = new JLabel("Hora de llegada: " + (arrayInfoSearch[1]+2) +":"+ rnd.nextInt(59) );
  	    ////////
  	    origin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int city = arrayInfo[1];
				
				BinarySearchTreeFly tree = info.getFly(city);
				//city
				arrayInfoSearch[0] = city;
				//
				arrayInfoSearch[1] = 0;
				if(origin.getSelectedItem() == "Temprano") {
					arrayInfoSearch[1] = rnd.nextInt(11);
				}else{
					int aux = 0;
					while(aux < 11) {
						aux = rnd.nextInt(23);
					}
					arrayInfoSearch[1] = aux;
				};
				System.out.println(arrayInfoSearch[1]);
				arrayInfoSearch[2] = rnd.nextInt(59);
//				arrayInfoSearch[2] = 0;
				//id
				arrayInfoSearch[3] = arrayInfo[0];
				//pasajeros
				
				llegada.setText( "Hora de llegada: " + (arrayInfoSearch[1]+2) + ":" + arrayInfoSearch[2]);
				sal.setText( "Hora de salida: " + arrayInfoSearch[1] + ":" + arrayInfoSearch[2]);
			}
		});
  	    
  	    ////////
  	    
  	  
  	    GridBagConstraints locate2 = new GridBagConstraints();
		locate2.gridx = 1;
		locate2.gridy = 1;
		locate2.anchor = GridBagConstraints.WEST;
		locate2.insets = new Insets(10, 20, 10, 0);
		second.add(origin, locate2);
  	   
  	    JLabel passenger = new JLabel("N�mero de pasajeros: 1" );
  	    GridBagConstraints locate3 = new GridBagConstraints();
  	    locate3.gridx = 0;
  	    locate3.gridy = 2;
  	    locate3.anchor = GridBagConstraints.WEST;
  	    locate3.insets = new Insets(10, 20, 10, 0);
  	    second.add(passenger, locate3);
  	   
  	    JComboBox<String[]> number = new JComboBox<String[]>();
  	    String[] num = new String[]{"1", "2", "3"};
  	    number.setModel(new DefaultComboBoxModel(num));
  	    number.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(number.getSelectedItem() == "1") {
					arrayInfoSearch[4] = 1;
					passenger.setText("N�mero de pasajeros: 1" );
//					System.out.println("1");
				}
				else if(number.getSelectedItem() == "2") {
					arrayInfoSearch[4] = 2;
					passenger.setText("N�mero de pasajeros: 2" );
//					System.out.println("2");
				}
				else if(number.getSelectedItem() == "3") {
					arrayInfoSearch[4] = 3;
					passenger.setText("N�mero de pasajeros: 3" );
//					System.out.println("3");
				}
			}
		});
  	   
  	    GridBagConstraints locate4 = new GridBagConstraints();
  	    locate4.gridx = 1;
  	    locate4.gridy = 2;
  	    locate4.anchor = GridBagConstraints.EAST;
  	    second.add(number, locate4);
  	   
  	    JLabel space1 = new JLabel("  ");
  	    GridBagConstraints locate5 = new GridBagConstraints();
  	    locate5.gridx = 2;
  	    locate5.gridy = 1;
  	    locate5.anchor = GridBagConstraints.WEST;
  	    locate5.weightx = 1.0;
  	    second.add(space1, locate5);
  	    	   
  	    /*
  	     * array[0]=city
  	     * array[1]=hour
  	     * array[2]=minutes
  	     * array[3]=id
  	     * array[4]=pasajeros
  	    */
  	    System.out.println(arrayInfo[0] + "--" + arrayInfoSearch[3]);
  	    JLabel no = new JLabel("Id. " + arrayInfoSearch[3]);
  	    GridBagConstraints locate6 = new GridBagConstraints();
  	    locate6.gridx = 3;
  	    locate6.gridy = 1;
  	    locate6.anchor = GridBagConstraints.WEST;
  	    locate6.insets = new Insets(10, 20, 10, 20);
  	    second.add(no, locate6);
  	   
  	    
        GridBagConstraints locate7 = new GridBagConstraints();
        locate7.gridx = 3;
        locate7.gridy = 2;
        locate7.anchor = GridBagConstraints.WEST;
        locate7.insets = new Insets(10, 20, 10, 0);
        second.add(sal, locate7);
        sal.setText( "Hora de salida: " + arrayInfoSearch[1] +":"+ arrayInfoSearch[2]);
        
        
        
//        llegada = new JLabel("Hora de llegada: " + (arrayInfoSearch[2]+2) +":"+ rnd.nextInt(59) );
        GridBagConstraints locate8 = new GridBagConstraints();
        locate8.gridx = 3;
        locate8.gridy = 3;
        locate8.anchor = GridBagConstraints.WEST;
        locate8.insets = new Insets(10, 20, 10, 0);
        second.add(llegada, locate8);
     
        JLabel sillas = new JLabel("Sillas disponibles: " + arrayInfoSearch[4]);
        GridBagConstraints locate9 = new GridBagConstraints();
        locate9.gridx = 3;
        locate9.gridy = 4;
        locate9.anchor = GridBagConstraints.WEST;
        locate9.insets = new Insets(10, 20, 10, 0);
        second.add(sillas, locate9);
     
        JLabel costo = new JLabel("Costo: " + Destination.getPrice(arrayInfoSearch[0]));
        GridBagConstraints locate10 = new GridBagConstraints();
        locate10.gridx = 3;
        locate10.gridy = 5;
        locate10.anchor = GridBagConstraints.WEST;
        locate10.insets = new Insets(10, 20, 10, 0);
        second.add(costo, locate10);
     
        // Botones -------------------------------------------------------------

        JButton labelReservations = new JButton("Reservar");
        labelReservations.addActionListener(new AbstractAction(){ 
			 public void actionPerformed(ActionEvent e){
				 //String prueba = (String) number.getSelectedItem();
				 System.out.println("Filtro: " + origin.getSelectedItem());
				 // System.out.println("Pasajeros: " + number.getSelectedItem());
//				 info.filterHour((String) origin.getSelectedItem(), city);
				 
				 /*
			  	     * array[0]=city
			  	     * array[1]=hour
			  	     * array[2]=minutes
			  	     * array[3]=id
			  	     * array[4]=pasajeros
			  	  */
				 /*
				  * arrayInfo[0]--> Id
				  * arrayInfo[1]--> city
				  * arrayInfo[2]--> hora
				  * arrayInfo[3]--> minutos
				  * arrayInfo[4]--> silla
				  */
				 arrayInfo[1] =arrayInfoSearch[0];
				 arrayInfo[2]=arrayInfoSearch[1];
				 arrayInfo[3]=arrayInfoSearch[2];
				 arrayInfo[0]=arrayInfoSearch[3];
				 arrayInfo[4]=arrayInfoSearch[4];
														 
				 
				 second.setVisible(false);
				 ThirdWindow();
			 } 
			}); 
        
        
        GridBagConstraints locate11 = new GridBagConstraints();
        locate11.gridx = 1;
        locate11.gridy = 5;
        locate11.anchor = GridBagConstraints.EAST;
        second.add(labelReservations, locate11);
                
        JButton back = new JButton("Regresar");
        back.addActionListener(new AbstractAction(){ 
			 public void actionPerformed(ActionEvent e){ 
				 /*frame.setVisible(false); 
				 frame.dispose(); */
				 second.setVisible(false);
				 FirstWindow();
			 } 
			});        
        
        GridBagConstraints locate12 = new GridBagConstraints();
        locate12.gridx = 0;
        locate12.gridy = 5;
        locate12.anchor = GridBagConstraints.EAST;
        locate12.insets = new Insets(10, 20, 10, 0);
        second.add(back, locate12);
        
        second.setVisible(true);
		distribution.add(second);
		
		frame.setVisible(true);
	}
	
	// Tercera ventana ------------------------------------------------------------------------------------------------------------------
	
	public void ThirdWindow() {
		
  		JPanel third = new JPanel();
  		third.setLayout(new GridBagLayout());	

		//GridBagConstraints(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty, int anchor, int fill, Insets insets, int ipadx, int ipady)

		// Etiquetas -------------------------------------------------------------

		JLabel aero = new JLabel("AeroUN");
	    GridBagConstraints locate0 = new GridBagConstraints();
	    locate0.gridx = 0;
	    locate0.gridy = 0;
	    locate0.anchor = GridBagConstraints.CENTER;
	    locate0.insets = new Insets(10, 20, 20, 20);
	    locate0.gridwidth = 5;
	    third.add(aero, locate0);
	   
	    JLabel labelName = new JLabel("Tu reserva est� lista!");
	    GridBagConstraints locate1 = new GridBagConstraints();
	    locate1.gridx = 0;
	    locate1.gridy = 1;
	    locate1.anchor = GridBagConstraints.WEST;
	    locate1.insets = new Insets(10, 20, 10, 0);
	    third.add(labelName, locate1);
	   
	    JLabel nombre = new JLabel("");
	    GridBagConstraints locate2 = new GridBagConstraints();
	    locate2.gridx = 3;
	    locate2.gridy = 1;
	    locate2.anchor = GridBagConstraints.WEST;
	    locate2.insets = new Insets(10, 20, 10, 0);
	    third.add(nombre, locate2);
	       
	    JLabel no = new JLabel(	"ID: " +	(Integer.toString(arrayInfo[0])));
	    GridBagConstraints locate3 = new GridBagConstraints();
	    locate3.gridx = 3;
	    locate3.gridy = 2;
	    locate3.anchor = GridBagConstraints.WEST;
	    locate3.insets = new Insets(10, 20, 10, 0);
	    third.add(no, locate3);
	   
	    JLabel sal = new JLabel("Salida: " + Integer.toString(arrayInfo[2]) + ":"+ Integer.toString(arrayInfo[3]));
	    GridBagConstraints locate4 = new GridBagConstraints();
	    locate4.gridx = 3;
	    locate4.gridy = 3;
	    locate4.anchor = GridBagConstraints.WEST;
	    locate4.insets = new Insets(10, 20, 10, 0);
	    third.add(sal, locate4);
	   
	    JLabel lleg = new JLabel("Hora de llegada: " + Integer.toString((arrayInfo[2]+2)) + ":"+ Integer.toString(arrayInfo[3]));
	    GridBagConstraints locate5 = new GridBagConstraints();
	    locate5.gridx = 3;
	    locate5.gridy = 4;
	    locate5.anchor = GridBagConstraints.WEST;
	    locate5.insets = new Insets(10, 20, 10, 0);
	    third.add(lleg, locate5);
	   
	    JLabel sillas = new JLabel("Sillas disponibles: " + arrayInfo[4]);
	    GridBagConstraints locate6 = new GridBagConstraints();
	    locate6.gridx = 3;
	    locate6.gridy = 5;		
	    locate6.anchor = GridBagConstraints.WEST;
	    locate6.insets = new Insets(10, 20, 10, 0);
	    third.add(sillas, locate6);
	   
	    JLabel costo = new JLabel("Costo: " + Destination.getPrice(arrayInfo[1]));
	    GridBagConstraints locate7 = new GridBagConstraints();
	    locate7.gridx = 3;
	    locate7.gridy = 6;
	    locate7.anchor = GridBagConstraints.WEST;
	    locate7.insets = new Insets(10, 20, 10, 0);
	    third.add(costo, locate7);
	   
	    // Botones -------------------------------------------------------------
	   
	    JButton cancel = new JButton("Cancelar");
	    cancel.addActionListener(new AbstractAction(){ 
			 public void actionPerformed(ActionEvent e){ 
				 frame.setVisible(false);
			 } 
			});
	    
	    GridBagConstraints locate8 = new GridBagConstraints();
	    locate8.gridx = 1;
	    locate8.gridy = 6;
	    locate8.anchor = GridBagConstraints.WEST;
	    third.add(cancel, locate8);
	   
	    JButton Back = new JButton("Regresar");
	    Back.addActionListener(new AbstractAction(){ 
			 public void actionPerformed(ActionEvent e){
				 third.setVisible(false);
				 SecondWindow();				 
			 } 
			});
	    GridBagConstraints locate9 = new GridBagConstraints();
	    locate9.gridx = 0;
	    locate9.gridy = 5;
	    locate9.anchor = GridBagConstraints.WEST;
	    third.add(Back, locate9);
	   
	    JButton inicio = new JButton("Volver al inicio");
	    inicio.addActionListener(new AbstractAction(){ 
			 public void actionPerformed(ActionEvent e){
				 third.setVisible(false);
				 FirstWindow();
			 } 
			});
	    GridBagConstraints locate10 = new GridBagConstraints();
	    locate10.gridx = 0;
	    locate10.gridy = 6;
	    locate10.anchor = GridBagConstraints.WEST;
	    third.add(inicio, locate10);

	    third.setVisible(true);
		distribution.add(third);
		
	    frame.setVisible(true);
	}


}


