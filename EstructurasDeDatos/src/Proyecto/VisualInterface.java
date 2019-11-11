package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*class BuscarPulsado implements ActionListener{
	private JTextField cuadro;
	public String nombre;
	
	public BuscarPulsado(JTextField Texto) {
		this.cuadro = Texto;		
	}

	public void actionPerformed(ActionEvent e) {
		this.nombre = cuadro.getText();
		System.out.println("Nombre: " + nombre);
		//datos(1);
	}
	
	/*public boolean datos(int a) {
		return true;		
	}
}*/

public class VisualInterface{
	
	
	public void FirstWindow(){
		JFrame frame = new JFrame("AeroUN");
  		frame.setSize(500,450);
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container distribution = frame.getContentPane();
		
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
		GridBagConstraints locate5 = new GridBagConstraints();
		locate5.gridx = 2;
		locate5.gridy = 1;
		locate5.anchor = GridBagConstraints.WEST;
		locate5.weightx = 1.0;
		first.add(space1, locate5);
		
		JLabel labeleMail = new JLabel("Correo:");
		GridBagConstraints locate6 = new GridBagConstraints();
		locate6.gridx = 3;
		locate6.gridy = 1;
		locate6.anchor = GridBagConstraints.WEST;
		locate6.insets = new Insets(0, 0, 0, 20);
		first.add(labeleMail, locate6);	
		
		JLabel phrase = new JLabel("S�guenos! Y prep�rate para viajar con AeroUN");
		GridBagConstraints locate12 = new GridBagConstraints();
		locate12.gridx = 0;
		locate12.gridy = 5;
		locate12.anchor = GridBagConstraints.WEST;
		locate12.insets = new Insets(10, 20, 10, 0);
		locate12.gridwidth = 5;
		first.add(phrase, locate12);
		
		
		// Cajas de texto -------------------------------------------------------------
		
		JTextField name = new JTextField(10);
		GridBagConstraints locate3 = new GridBagConstraints();
		locate3.gridx = 2;
		locate3.gridy = 1;
		locate3.anchor = GridBagConstraints.WEST;
		first.add(name, locate3);

		JTextField date = new JTextField(10);
		GridBagConstraints locate4 = new GridBagConstraints();
		locate4.gridx = 2;
		locate4.gridy = 2;
		locate4.anchor = GridBagConstraints.WEST;
		first.add(date, locate4);		
			
		JTextField eMail = new JTextField(10);
		GridBagConstraints locate8 = new GridBagConstraints();
		locate8.gridx = 4;
		locate8.gridy = 1;
		locate8.anchor = GridBagConstraints.WEST;
		locate8.insets = new Insets(0, 0, 0, 20);
		first.add(eMail, locate8);
		
		// Botones -------------------------------------------------------------
		
		JButton labelReservations = new JButton("Ver reservas");
		GridBagConstraints locate7 = new GridBagConstraints();
		locate7.gridx = 4;
		locate7.gridy = 2;
		locate7.anchor = GridBagConstraints.WEST;
		first.add(labelReservations, locate7);
		
		JButton searchFlight = new JButton("Buscar");
	
		searchFlight.addActionListener(new AbstractAction(){ 
			 public void actionPerformed(ActionEvent e){ 
				 /*frame.setVisible(false); 
				 frame.dispose(); */
				 System.out.println("Nombre: " + name.getText());
				 SecondWindow();
				 frame.setVisible(false);
			 } 
			});
			
		GridBagConstraints locate11 = new GridBagConstraints();
		locate11.gridx = 4;
		locate11.gridy = 4;
		locate11.anchor = GridBagConstraints.EAST;
		locate11.insets = new Insets(50, 0, 0, 20);
		first.add(searchFlight, locate11);	
		
		
		// Listas desplegables -------------------------------------------------------------
		
		JComboBox<String[]> origin = new JComboBox<String[]>();
		String[] orig = new String[]{"Origen","Barranquilla","Bogot�","Bucaramanga","Cali","Cartagena","C�cuta","Medell�n","Monter�a","San Andr�s","Santa Marta","Villavicencio"};
		origin.setModel(new DefaultComboBoxModel(orig));
		
		GridBagConstraints locate10 = new GridBagConstraints();
		locate10.gridx = 0;
		locate10.gridy = 3;
		locate10.anchor = GridBagConstraints.WEST;
		locate10.insets = new Insets(10, 20, 10, 0);
		first.add(origin, locate10);
		
		JComboBox<String[]> destination = new JComboBox<String[]>();
		String[] des = new String[]{"Destino","Barranquilla","Bucaramanga","Cali","Cartagena","C�cuta","Medell�n","Monter�a","San Andr�s","Santa Marta"};
		destination.setModel(new DefaultComboBoxModel(des));
		
		GridBagConstraints locate9 = new GridBagConstraints();
		locate9.gridx = 4;
		locate9.gridy = 3;
		locate9.anchor = GridBagConstraints.WEST;
		locate9.insets = new Insets(10, 0, 10, 20);
		first.add(destination, locate9);
		
		//first.setVisible(true);
		distribution.add(first);
		
		frame.setVisible(true);	
	}
	
	
	public void SecondWindow(){ 
		JFrame frame = new JFrame("AeroUN");
  		frame.setSize(500,450);
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
  		
  		Container distribution = frame.getContentPane();
  		distribution.setLayout(new GridBagLayout());
  		
  		JLabel aero = new JLabel("AeroUN");
  		GridBagConstraints locate0 = new GridBagConstraints();
  	    locate0.gridx = 0;
  	    locate0.gridy = 0;
  	    locate0.anchor = GridBagConstraints.CENTER;
  	    locate0.insets = new Insets(10, 20, 20, 20);
  	    locate0.gridwidth = 5;
  	    distribution.add(aero, locate0);
  	   
  	    JLabel labelName = new JLabel("Tu vuelo m�s:");
  	    GridBagConstraints locate1 = new GridBagConstraints();
  	    locate1.gridx = 0;
  	    locate1.gridy = 1;
  	    locate1.anchor = GridBagConstraints.WEST;
  	    locate1.insets = new Insets(10, 20, 10, 0);
  	    distribution.add(labelName, locate1);
  	   
  	    JComboBox<String[]> origin = new JComboBox<String[]>();
  	    String[] orig = new String[]{"Precio", "Hora", "Disponibilidad"};
  	    origin.setModel(new DefaultComboBoxModel(orig));
  	    
  	    GridBagConstraints locate10 = new GridBagConstraints();
		locate10.gridx = 1;
		locate10.gridy = 1;
		locate10.anchor = GridBagConstraints.WEST;
		locate10.insets = new Insets(10, 20, 10, 0);
		distribution.add(origin, locate10);
  	   
  	    JLabel passenger = new JLabel("N�mero de pasajeros:");
  	    GridBagConstraints locate2 = new GridBagConstraints();
  	    locate2.gridx = 0;
  	    locate2.gridy = 2;
  	    locate2.anchor = GridBagConstraints.WEST;
  	    locate2.insets = new Insets(10, 20, 10, 0);
  	    distribution.add(passenger, locate2);
  	   
  	    JComboBox<String[]> number = new JComboBox<String[]>();
  	    String[] num = new String[]{"1", "2", "3"};
  	    number.setModel(new DefaultComboBoxModel(num));
  	   
  	    GridBagConstraints locate3 = new GridBagConstraints();
  	    locate3.gridx = 1;
  	    locate3.gridy = 2;
  	    locate3.anchor = GridBagConstraints.EAST;
  	    distribution.add(number, locate3);
  	   
  	    JLabel space1 = new JLabel(" ");
  	    GridBagConstraints locate5 = new GridBagConstraints();
  	    locate5.gridx = 2;
  	    locate5.gridy = 1;
  	    locate5.anchor = GridBagConstraints.WEST;
  	    locate5.weightx = 1.0;
  	    distribution.add(space1, locate5);
  	    	   
  	    JLabel no = new JLabel("No. ");
  	    GridBagConstraints locate12 = new GridBagConstraints();
  	    locate12.gridx = 3;
  	    locate12.gridy = 1;
  	    locate12.anchor = GridBagConstraints.WEST;
  	    locate12.insets = new Insets(10, 20, 10, 20);
  	    distribution.add(no, locate12);
  	   
  	    JLabel sal = new JLabel("Hora de salida ");
        GridBagConstraints locate13 = new GridBagConstraints();
        locate13.gridx = 3;
        locate13.gridy = 2;
        locate13.anchor = GridBagConstraints.WEST;
        locate13.insets = new Insets(10, 20, 10, 0);
        distribution.add(sal, locate13);
     
        JLabel lleg = new JLabel("Hora de llegada ");
        GridBagConstraints locate14 = new GridBagConstraints();
        locate14.gridx = 3;
        locate14.gridy = 3;
        locate14.anchor = GridBagConstraints.WEST;
        locate14.insets = new Insets(10, 20, 10, 0);
        distribution.add(lleg, locate14);
     
        JLabel sillas = new JLabel("Sillas disponibles ");
        GridBagConstraints locate15 = new GridBagConstraints();
        locate15.gridx = 3;
        locate15.gridy = 4;
        locate15.anchor = GridBagConstraints.WEST;
        locate15.insets = new Insets(10, 20, 10, 0);
        distribution.add(sillas, locate15);
     
        JLabel costo = new JLabel("Costo ");
        GridBagConstraints locate16 = new GridBagConstraints();
        locate16.gridx = 3;
        locate16.gridy = 5;
        locate16.anchor = GridBagConstraints.WEST;
        locate16.insets = new Insets(10, 20, 10, 0);
        distribution.add(costo, locate16);
     
        // Botones -------------------------------------------------------------
     
        JButton labelReservations = new JButton("Reservar");
        GridBagConstraints locate7 = new GridBagConstraints();
        locate7.gridx = 1;
        locate7.gridy = 5;
        locate7.anchor = GridBagConstraints.EAST;
        distribution.add(labelReservations, locate7);
        frame.setVisible(true);
        
        JButton back = new JButton("Regresar");
        back.addActionListener(new AbstractAction(){ 
			 public void actionPerformed(ActionEvent e){ 
				 /*frame.setVisible(false); 
				 frame.dispose(); */
				 FirstWindow();
				 frame.setVisible(false);
			 } 
			});        
        
        GridBagConstraints locate8 = new GridBagConstraints();
        locate8.gridx = 0;
        locate8.gridy = 5;
        locate8.anchor = GridBagConstraints.EAST;
        locate8.insets = new Insets(10, 20, 10, 0);
        distribution.add(back, locate8);
        frame.setVisible(true);
	}
}
