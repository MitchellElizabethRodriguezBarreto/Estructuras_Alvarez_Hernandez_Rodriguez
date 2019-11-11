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
		
		JLabel phrase = new JLabel("Síguenos! Y prepárate para viajar con AeroUN");
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
		
		//BuscarPulsado hola = new BuscarPulsado(name);
		
		//searchFlight.addActionListener(press);
		
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
		String[] orig = new String[]{"Origen","Barranquilla","Bogotá","Bucaramanga","Cali","Cartagena","Cúcuta","Medellín","Montería","San Andrés","Santa Marta","Villavicencio"};
		origin.setModel(new DefaultComboBoxModel(orig));
		
		GridBagConstraints locate10 = new GridBagConstraints();
		locate10.gridx = 0;
		locate10.gridy = 3;
		locate10.anchor = GridBagConstraints.WEST;
		locate10.insets = new Insets(10, 20, 10, 0);
		first.add(origin, locate10);
		
		JComboBox<String[]> destination = new JComboBox<String[]>();
		String[] des = new String[]{"Destino","Barranquilla","Bucaramanga","Cali","Cartagena","Cúcuta","Medellín","Montería","San Andrés","Santa Marta"};
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
		
		JPanel second = new JPanel();
		second.setLayout(new GridBagLayout());
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
		second.add(aero, locate0);
		
		JLabel labelName = new JLabel("Nombre2:");
		GridBagConstraints locate1 = new GridBagConstraints();
		locate1.gridx = 0;
		locate1.gridy = 1;
		locate1.anchor = GridBagConstraints.WEST;
		locate1.insets = new Insets(10, 20, 10, 0);
		second.add(labelName, locate1);
		
		JLabel labelDate = new JLabel("Fecha de salida2:");
		GridBagConstraints locate2 = new GridBagConstraints();
		locate2.gridx = 0;
		locate2.gridy = 2;
		locate2.anchor = GridBagConstraints.WEST;
		locate2.insets = new Insets(10, 20, 10, 0);
		second.add(labelDate, locate2);
		
		JLabel space1 = new JLabel(" ");
		GridBagConstraints locate5 = new GridBagConstraints();
		locate5.gridx = 2;
		locate5.gridy = 1;
		locate5.anchor = GridBagConstraints.WEST;
		locate5.weightx = 1.0;
		second.add(space1, locate5);
		
		JLabel labeleMail = new JLabel("Correo2:");
		GridBagConstraints locate6 = new GridBagConstraints();
		locate6.gridx = 3;
		locate6.gridy = 1;
		locate6.anchor = GridBagConstraints.WEST;
		locate6.insets = new Insets(0, 0, 0, 20);
		second.add(labeleMail, locate6);	
		
		JLabel phrase = new JLabel("Síguenos! Y prepárate para viajar con AeroUN2");
		GridBagConstraints locate12 = new GridBagConstraints();
		locate12.gridx = 0;
		locate12.gridy = 5;
		locate12.anchor = GridBagConstraints.WEST;
		locate12.insets = new Insets(10, 20, 10, 0);
		locate12.gridwidth = 5;
		second.add(phrase, locate12);
		
		
		// Cajas de texto -------------------------------------------------------------
		
		JTextField name = new JTextField(10);
		GridBagConstraints locate3 = new GridBagConstraints();
		locate3.gridx = 2;
		locate3.gridy = 1;
		locate3.anchor = GridBagConstraints.WEST;
		second.add(name, locate3);

		JTextField date = new JTextField(10);
		GridBagConstraints locate4 = new GridBagConstraints();
		locate4.gridx = 2;
		locate4.gridy = 2;
		locate4.anchor = GridBagConstraints.WEST;
		second.add(date, locate4);		
			
		JTextField eMail = new JTextField(10);
		GridBagConstraints locate8 = new GridBagConstraints();
		locate8.gridx = 4;
		locate8.gridy = 1;
		locate8.anchor = GridBagConstraints.WEST;
		locate8.insets = new Insets(0, 0, 0, 20);
		second.add(eMail, locate8);
		
		// Botones -------------------------------------------------------------
		
		JButton labelReservations = new JButton("Ver reservas2");
		GridBagConstraints locate7 = new GridBagConstraints();
		locate7.gridx = 4;
		locate7.gridy = 2;
		locate7.anchor = GridBagConstraints.WEST;
		second.add(labelReservations, locate7);
		
		JButton searchFlight = new JButton("Buscar2");
		
		//BuscarPulsado hola = new BuscarPulsado(name);
		//searchFlight.addActionListener(hola);
		//System.out.println(hola.nombre);		
		/*while(hola.datos()) {
			System.out.println(":(");
		}*/
		
		GridBagConstraints locate11 = new GridBagConstraints();
		locate11.gridx = 4;
		locate11.gridy = 4;
		locate11.anchor = GridBagConstraints.EAST;
		locate11.insets = new Insets(50, 0, 0, 20);
		second.add(searchFlight, locate11);	
		
		
		// Listas desplegables -------------------------------------------------------------
		
		JComboBox<String[]> origin = new JComboBox<String[]>();
		String[] orig = new String[]{"Origen","Barranquilla","Bogotá","Bucaramanga","Cali","Cartagena","Cúcuta","Medellín","Montería","San Andrés","Santa Marta","Villavicencio"};
		origin.setModel(new DefaultComboBoxModel(orig));
		
		GridBagConstraints locate10 = new GridBagConstraints();
		locate10.gridx = 0;
		locate10.gridy = 3;
		locate10.anchor = GridBagConstraints.WEST;
		locate10.insets = new Insets(10, 20, 10, 0);
		second.add(origin, locate10);
		
		JComboBox<String[]> destination = new JComboBox<String[]>();
		String[] des = new String[]{"Destino","Barranquilla","Bucaramanga","Cali","Cartagena","Cúcuta","Medellín","Montería","San Andrés","Santa Marta"};
		destination.setModel(new DefaultComboBoxModel(des));
		
		GridBagConstraints locate9 = new GridBagConstraints();
		locate9.gridx = 4;
		locate9.gridy = 3;
		locate9.anchor = GridBagConstraints.WEST;
		locate9.insets = new Insets(10, 0, 10, 20);
		second.add(destination, locate9);
		
		//first.setVisible(true);
		distribution.add(second);
		
		frame.setVisible(true);	
	}
}
