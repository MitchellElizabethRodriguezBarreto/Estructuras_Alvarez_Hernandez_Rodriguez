package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VisualInterface{
	JFrame frame = new JFrame("AeroUN");
	Container distribution = frame.getContentPane();
	
	public VisualInterface() {
		frame.setSize(500,450);
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  		
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
		
		JLabel labelDate = new JLabel("Fecha de salida:");
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
		
		JLabel labeleMail = new JLabel("Correo:");
		GridBagConstraints locate4 = new GridBagConstraints();
		locate4.gridx = 3;
		locate4.gridy = 1;
		locate4.anchor = GridBagConstraints.WEST;
		locate4.insets = new Insets(0, 0, 0, 20);
		first.add(labeleMail, locate4);	
		
		JLabel phrase = new JLabel("Síguenos! Y prepárate para viajar con AeroUN");
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

		JTextField date = new JTextField(10);
		GridBagConstraints locate7 = new GridBagConstraints();
		locate7.gridx = 2;
		locate7.gridy = 2;
		locate7.anchor = GridBagConstraints.WEST;
		first.add(date, locate7);		
			
		JTextField eMail = new JTextField(10);
		GridBagConstraints locate8 = new GridBagConstraints();
		locate8.gridx = 4;
		locate8.gridy = 1;
		locate8.anchor = GridBagConstraints.WEST;
		locate8.insets = new Insets(0, 0, 0, 20);
		first.add(eMail, locate8);	
		
		// Listas desplegables -------------------------------------------------------------
		
		JComboBox<String[]> origin = new JComboBox<String[]>();
		String[] orig = new String[]{"Origen","Barranquilla","Bogotá","Bucaramanga","Cali","Cartagena","Cúcuta","Medellín","Montería","San Andrés","Santa Marta","Villavicencio"};
		origin.setModel(new DefaultComboBoxModel(orig));
		
		GridBagConstraints locate9 = new GridBagConstraints();
		locate9.gridx = 0;
		locate9.gridy = 3;
		locate9.anchor = GridBagConstraints.WEST;
		locate9.insets = new Insets(10, 20, 10, 0);
		first.add(origin, locate9);
		
		JComboBox<String[]> destination = new JComboBox<String[]>();
		String[] des = new String[]{"Destino","Barranquilla","Bucaramanga","Cali","Cartagena","Cúcuta","Medellín","Montería","San Andrés","Santa Marta"};
		destination.setModel(new DefaultComboBoxModel(des));
		
		GridBagConstraints locate10 = new GridBagConstraints();
		locate10.gridx = 4;
		locate10.gridy = 3;
		locate10.anchor = GridBagConstraints.WEST;
		locate10.insets = new Insets(10, 0, 10, 20);
		first.add(destination, locate10);
				
		// Botones -------------------------------------------------------------
		
		JButton labelReservations = new JButton("Ver reservas");
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
				 System.out.println("Nombre: " + name.getText());
				 System.out.println("Nombre: " + date.getText());
				 System.out.println("Nombre: " + eMail.getText());
				 System.out.println("Nombre: " + origin.getSelectedItem());
				 System.out.println("Nombre: " + destination.getSelectedItem());
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
  	   
  	    JLabel labelName = new JLabel("Tu vuelo más:");
  	    GridBagConstraints locate1 = new GridBagConstraints();
  	    locate1.gridx = 0;
  	    locate1.gridy = 1;
  	    locate1.anchor = GridBagConstraints.WEST;
  	    locate1.insets = new Insets(10, 20, 10, 0);
  	    second.add(labelName, locate1);
  	   
  	    JComboBox<String[]> origin = new JComboBox<String[]>();
  	    String[] orig = new String[]{"Precio", "Hora", "Disponibilidad"};
  	    origin.setModel(new DefaultComboBoxModel(orig));
  	    
  	    GridBagConstraints locate2 = new GridBagConstraints();
		locate2.gridx = 1;
		locate2.gridy = 1;
		locate2.anchor = GridBagConstraints.WEST;
		locate2.insets = new Insets(10, 20, 10, 0);
		second.add(origin, locate2);
  	   
  	    JLabel passenger = new JLabel("Número de pasajeros:");
  	    GridBagConstraints locate3 = new GridBagConstraints();
  	    locate3.gridx = 0;
  	    locate3.gridy = 2;
  	    locate3.anchor = GridBagConstraints.WEST;
  	    locate3.insets = new Insets(10, 20, 10, 0);
  	    second.add(passenger, locate3);
  	   
  	    JComboBox<String[]> number = new JComboBox<String[]>();
  	    String[] num = new String[]{"1", "2", "3"};
  	    number.setModel(new DefaultComboBoxModel(num));
  	   
  	    GridBagConstraints locate4 = new GridBagConstraints();
  	    locate4.gridx = 1;
  	    locate4.gridy = 2;
  	    locate4.anchor = GridBagConstraints.EAST;
  	    second.add(number, locate4);
  	   
  	    JLabel space1 = new JLabel(" ");
  	    GridBagConstraints locate5 = new GridBagConstraints();
  	    locate5.gridx = 2;
  	    locate5.gridy = 1;
  	    locate5.anchor = GridBagConstraints.WEST;
  	    locate5.weightx = 1.0;
  	    second.add(space1, locate5);
  	    	   
  	    JLabel no = new JLabel("No. ");
  	    GridBagConstraints locate6 = new GridBagConstraints();
  	    locate6.gridx = 3;
  	    locate6.gridy = 1;
  	    locate6.anchor = GridBagConstraints.WEST;
  	    locate6.insets = new Insets(10, 20, 10, 20);
  	    second.add(no, locate6);
  	   
  	    JLabel sal = new JLabel("Hora de salida ");
        GridBagConstraints locate7 = new GridBagConstraints();
        locate7.gridx = 3;
        locate7.gridy = 2;
        locate7.anchor = GridBagConstraints.WEST;
        locate7.insets = new Insets(10, 20, 10, 0);
        second.add(sal, locate7);
     
        JLabel lleg = new JLabel("Hora de llegada ");
        GridBagConstraints locate8 = new GridBagConstraints();
        locate8.gridx = 3;
        locate8.gridy = 3;
        locate8.anchor = GridBagConstraints.WEST;
        locate8.insets = new Insets(10, 20, 10, 0);
        second.add(lleg, locate8);
     
        JLabel sillas = new JLabel("Sillas disponibles ");
        GridBagConstraints locate9 = new GridBagConstraints();
        locate9.gridx = 3;
        locate9.gridy = 4;
        locate9.anchor = GridBagConstraints.WEST;
        locate9.insets = new Insets(10, 20, 10, 0);
        second.add(sillas, locate9);
     
        JLabel costo = new JLabel("Costo ");
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
				 System.out.println("Nombre: " + origin.getSelectedItem());
				 System.out.println("Nombre: " + number.getSelectedItem());
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
	   
	    JLabel labelName = new JLabel("Tu reserva está lista!");
	    GridBagConstraints locate1 = new GridBagConstraints();
	    locate1.gridx = 0;
	    locate1.gridy = 1;
	    locate1.anchor = GridBagConstraints.WEST;
	    locate1.insets = new Insets(10, 20, 10, 0);
	    third.add(labelName, locate1);
	   
	    JLabel nombre = new JLabel("Nombre ");
	    GridBagConstraints locate2 = new GridBagConstraints();
	    locate2.gridx = 3;
	    locate2.gridy = 1;
	    locate2.anchor = GridBagConstraints.WEST;
	    locate2.insets = new Insets(10, 20, 10, 0);
	    third.add(nombre, locate2);
	       
	    JLabel no = new JLabel("No. ");
	    GridBagConstraints locate3 = new GridBagConstraints();
	    locate3.gridx = 3;
	    locate3.gridy = 2;
	    locate3.anchor = GridBagConstraints.WEST;
	    locate3.insets = new Insets(10, 20, 10, 0);
	    third.add(no, locate3);
	   
	    JLabel sal = new JLabel("Hora de salida ");
	    GridBagConstraints locate4 = new GridBagConstraints();
	    locate4.gridx = 3;
	    locate4.gridy = 3;
	    locate4.anchor = GridBagConstraints.WEST;
	    locate4.insets = new Insets(10, 20, 10, 0);
	    third.add(sal, locate4);
	   
	    JLabel lleg = new JLabel("Hora de llegada ");
	    GridBagConstraints locate5 = new GridBagConstraints();
	    locate5.gridx = 3;
	    locate5.gridy = 4;
	    locate5.anchor = GridBagConstraints.WEST;
	    locate5.insets = new Insets(10, 20, 10, 0);
	    third.add(lleg, locate5);
	   
	    JLabel sillas = new JLabel("Sillas disponibles ");
	    GridBagConstraints locate6 = new GridBagConstraints();
	    locate6.gridx = 3;
	    locate6.gridy = 5;		
	    locate6.anchor = GridBagConstraints.WEST;
	    locate6.insets = new Insets(10, 20, 10, 0);
	    third.add(sillas, locate6);
	   
	    JLabel costo = new JLabel("Costo ");
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
