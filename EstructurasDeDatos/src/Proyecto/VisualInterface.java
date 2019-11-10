package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class VisualInterface{
	
	public void FirstWindow(){
  		JFrame first = new JFrame("AeroUN");
		first.setSize(500,450);
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container distribution = first.getContentPane();
		distribution.setLayout(new GridBagLayout());
		
		//GridBagConstraints(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty, int anchor, int fill, Insets insets, int ipadx, int ipady)
		
		// Etiquetas -------------------------------------------------------------
		
		JLabel aero = new JLabel("AeroUN");
		GridBagConstraints locate0 = new GridBagConstraints();
		locate0.gridx = 0;
		locate0.gridy = 0;
		locate0.anchor = GridBagConstraints.CENTER;
		locate0.insets = new Insets(10, 20, 20, 20);
		locate0.gridwidth = 5;
		distribution.add(aero, locate0);
		
		JLabel labelName = new JLabel("Nombre:");
		GridBagConstraints locate1 = new GridBagConstraints();
		locate1.gridx = 0;
		locate1.gridy = 1;
		locate1.anchor = GridBagConstraints.WEST;
		locate1.insets = new Insets(10, 20, 10, 0);
		distribution.add(labelName, locate1);
		
		JLabel labelDate = new JLabel("Fecha de salida:");
		GridBagConstraints locate2 = new GridBagConstraints();
		locate2.gridx = 0;
		locate2.gridy = 2;
		locate2.anchor = GridBagConstraints.WEST;
		locate2.insets = new Insets(10, 20, 10, 0);
		distribution.add(labelDate, locate2);
		
		JLabel space1 = new JLabel(" ");
		GridBagConstraints locate5 = new GridBagConstraints();
		locate5.gridx = 2;
		locate5.gridy = 1;
		locate5.anchor = GridBagConstraints.WEST;
		locate5.weightx = 1.0;
		distribution.add(space1, locate5);
		
		JLabel labeleMail = new JLabel("Correo:");
		GridBagConstraints locate6 = new GridBagConstraints();
		locate6.gridx = 3;
		locate6.gridy = 1;
		locate6.anchor = GridBagConstraints.WEST;
		locate6.insets = new Insets(0, 0, 0, 20);
		distribution.add(labeleMail, locate6);	
		
		JLabel phrase = new JLabel("S�guenos! Y prep�rate para viajar con AeroUN");
		GridBagConstraints locate12 = new GridBagConstraints();
		locate12.gridx = 0;
		locate12.gridy = 5;
		locate12.anchor = GridBagConstraints.WEST;
		locate12.insets = new Insets(10, 20, 10, 0);
		locate12.gridwidth = 5;
		distribution.add(phrase, locate12);
		
		
		// Cajas de texto -------------------------------------------------------------
		
		JTextField name = new JTextField(10);
		GridBagConstraints locate3 = new GridBagConstraints();
		locate3.gridx = 2;
		locate3.gridy = 1;
		locate3.anchor = GridBagConstraints.WEST;
		distribution.add(name, locate3);

		JTextField date = new JTextField(10);
		GridBagConstraints locate4 = new GridBagConstraints();
		locate4.gridx = 2;
		locate4.gridy = 2;
		locate4.anchor = GridBagConstraints.WEST;
		distribution.add(date, locate4);		
			
		JTextField eMail = new JTextField(10);
		GridBagConstraints locate8 = new GridBagConstraints();
		locate8.gridx = 4;
		locate8.gridy = 1;
		locate8.anchor = GridBagConstraints.WEST;
		locate8.insets = new Insets(0, 0, 0, 20);
		distribution.add(eMail, locate8);
		
		// Botones -------------------------------------------------------------
		
		JButton labelReservations = new JButton("Ver reservas");
		GridBagConstraints locate7 = new GridBagConstraints();
		locate7.gridx = 4;
		locate7.gridy = 2;
		locate7.anchor = GridBagConstraints.WEST;
		distribution.add(labelReservations, locate7);
		
		JButton searchFlight = new JButton("Buscar");
		GridBagConstraints locate11 = new GridBagConstraints();
		locate11.gridx = 4;
		locate11.gridy = 4;
		locate11.anchor = GridBagConstraints.EAST;
		locate11.insets = new Insets(50, 0, 0, 20);
		distribution.add(searchFlight, locate11);
		
		// Listas desplegables -------------------------------------------------------------
		
		JComboBox<String[]> origin = new JComboBox<String[]>();
		String[] orig = new String[]{"Origen","Barranquilla","Bogot�","Bucaramanga","Cali","Cartagena","C�cuta","Medell�n","Monter�a","San Andr�s","Santa Marta","Villavicencio"};
		origin.setModel(new DefaultComboBoxModel(orig));
		
		GridBagConstraints locate10 = new GridBagConstraints();
		locate10.gridx = 0;
		locate10.gridy = 3;
		locate10.anchor = GridBagConstraints.WEST;
		locate10.insets = new Insets(10, 20, 10, 0);
		distribution.add(origin, locate10);
		
		JComboBox<String[]> destination = new JComboBox<String[]>();
		String[] des = new String[]{"Destino","Barranquilla","Bucaramanga","Cali","Cartagena","C�cuta","Medell�n","Monter�a","San Andr�s","Santa Marta"};
		destination.setModel(new DefaultComboBoxModel(des));
		
		GridBagConstraints locate9 = new GridBagConstraints();
		locate9.gridx = 4;
		locate9.gridy = 3;
		locate9.anchor = GridBagConstraints.WEST;
		locate9.insets = new Insets(10, 0, 10, 20);
		distribution.add(destination, locate9);
		
		first.setVisible(true);	
	}
}
