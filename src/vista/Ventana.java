package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
//Java program to create a blank text  
//field of definite number of columns. 
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {

	 public Ventana() {
		 this.setSize(600, 600); //Establece el tamaño de la ventana
		 this.setMinimumSize(new Dimension(200, 200)); //Establece el tamaño minimo de la ventana
		 /**
		  * DO_NOTHING_ON_CLOSE  //Nothing happens
		  * HIDE_ON_CLOSE        //setVisible(false)
		  * DISPOSE_ON_CLOSE     //Closes JFrame, Application still runs
		  * EXIT_ON_CLOSE        //Closes Application
		  */
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 this.setTitle("LaLiga"); // Titulo de la ventana
		 this.setLocationRelativeTo(null);// Establece la ventana en el centro de la pantalla
		 
		 iniciarVentana();

	}

	// main class
	public static void main(String[] args) {
		
		Ventana ventana = new Ventana();
		
		ventana.setVisible(true);
	}
	
	public void iniciarVentana () {
		//Estructura del panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);// Añadir color al panel
		
		panel.setLayout(null); //Desactivar el diseño
		
		//Estructura de la etiquetaTexto
		JLabel etiquetaTexto = new JLabel(/*"LaLiga 2.0", SwingConstants.CENTER*/); //Centrar la etiqueta al texto
		etiquetaTexto.setText("LaLiga 2.0");
		etiquetaTexto.setFont(new Font("Segoe Print", Font.BOLD, 10)); //Darle estilo a la fuente
		etiquetaTexto.setBounds(100, 100, 75, 50); //Localizacion de la etiqueta dentro del panel
		etiquetaTexto.setForeground(Color.WHITE); //Color de la fuente de la etiqueta
		etiquetaTexto.setBackground(Color.BLACK); //Color del fondo de la etiqueta
		etiquetaTexto.setHorizontalAlignment(SwingConstants.CENTER);//Centrar el fondo de la etiqueta de manera horizontal
		etiquetaTexto.setOpaque(true); //Opacar el fondo de la etiqueta para que sea visible
		
		//Estructura de la etiquetaImagen
		JLabel etiquetaImagen = new JLabel(new ImageIcon("ficheros/imagenes/laliga.jpg"));
		etiquetaImagen.setBounds(100, 150, 400, 255);
		
		/*
		 * OTRA FORMA DE HACERLO
		ImageIcon imagen = new ImageIcon("ficheros/imagenes/laliga.jpg");	
		JLabel etiquetaImagen = new JLabel();
		etiquetaImagen.setBounds(100, 150, 400, 255);
		etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), 200, Image.SCALE_SMOOTH)));
		*/
		
		//Añadir componetes al panel
		panel.add(etiquetaTexto);
		panel.add(etiquetaImagen);
		
		this.getContentPane().add(panel);//Agregar el panel a la ventana, this se refiere a la ventana creada
		
	}
		/*// create a new frame to stor text field and button
		f = new JFrame("LaLiga");
		

		// create a label to display text
		l = new JLabel("nothing entered");
		
		// create a new button
		b1 = new JButton("Crear Temporada");
		b1.setBounds(270, 10, 140, 25);
		// create a new button
		b2 = new JButton("Temporada Creada");
		b2.setBounds(270, 100, 140, 25);

		// create a object of the vista class
		Vista te = new Vista();

		// addActionListener to button
		b1.addActionListener(te);
		b2.addActionListener(te);

		// create a object of JTextField with 16 columns
		t = new JTextField(16);
		t.setBounds(100, 10, 160, 25);
		// create a panel to add buttons and textfield
		JPanel p = new JPanel();
		p.setSize(600, 300);

		// add buttons and textfield to panel
		p.add(t);
		p.add(b1);
		p.add(b2);
		p.add(l);

		// add panel to frame
		f.add(p);
		f.setSize(600, 300);

		// set the size of frame
		
		//f.setSize(300, 300);

		f.show();
	}

	// if the vutton is pressed*/
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		Integer aux;
		/*if (s.equals("Crear Temporada")) {
			// set the text of the label to the text of the field
			if (t.getText() == ""){
				l.setText("Introduce algun dato");
			} else {
				aux = Integer.parseInt(t.getText()) * 2;
				l.setText(Integer.toString(aux));
			}
			// set the text of field to blank
			t.setText("");
		} else if (s.equals("Temporada Creada")) {
			l.setText("Quiero ir a la temporada creada");

			// set the text of field to blank
			t.setText("");
		}*/
	}
}