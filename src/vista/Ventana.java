package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
//Java program to create a blank text  
//field of definite number of columns. 
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
	
	public JPanel panel;
	
	 public Ventana() {
		 this.setSize(800, 600); //Establece el tamaño de la ventana
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
		
		//File directorio = new File("C:/Users/Hector/git/vistas");
		//recursivo(directorio, "");
		
		Ventana ventana = new Ventana();
		
		ventana.setVisible(true);
	}
	
	public void iniciarVentana () {
		
		colocarPaneles();
		//colocarEtiquetas();
		//colocarBotones();
		//colocarRadioBotones();
		//colocarCajasDeTexto();
		colocarAreasDeTexto();
	}

	public void colocarPaneles(){
		//Estructura del panel
		panel = new JPanel();
		panel.setBackground(Color.blue);// Añadir color al panel
		panel.setLayout(null); //Desactivar el diseño
		this.getContentPane().add(panel);//Agregar el panel a la ventana, this se refiere a la ventana creada
	}
	
	public void colocarEtiquetas() {
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
	}
	
	private void colocarBotones() {
		//boton 1 - boton de texto
		JButton boton1 = new JButton();//Se puede añadir texto al boton dentro del parentesis JButton("texto")
		boton1.setText("pulsame");//añadir texto al boton
		boton1.setForeground(Color.ORANGE);
		boton1.setFont(new Font("cooper", Font.BOLD, 15));
		boton1.setEnabled(true);
		boton1.setBounds(100, 500, 100, 40);//dimensiones en el boton y localizacion en el panel
		boton1.setMnemonic('a'); //Establecemos alt + tecla
		
		//boton 2 - boton de imagen
		JButton boton2 = new JButton();//Se puede añadir texto al boton dentro del parentesis JButton("texto")
		boton2.setBounds(250, 500, 100, 40);//dimensiones en el boton y localizacion en el panel
		ImageIcon clickAqui = new ImageIcon("ficheros/imagenes/boton.jpg");
		boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
		boton2.setOpaque(true);
		boton2.setBackground(Color.GREEN);
		
		//boton 3 - boton de bordes
		JButton boton3 = new JButton();
		boton3.setBounds(400, 500, 100, 40);
		boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4 ,false));
		
		panel.add(boton1);//añadir boton al panel
		panel.add(boton2);//añadir boton al panel
		panel.add(boton3);//añadir boton al panel

	}

	private void colocarRadioBotones() {
		JRadioButton radioBoton1 = new JRadioButton("opcion 1", true);
		radioBoton1.setBounds(600, 150, 100, 40);
		panel.add(radioBoton1);
		
		JRadioButton radioBoton2 = new JRadioButton("opcion 2", false);
		radioBoton2.setBounds(600, 250, 100, 40);
		panel.add(radioBoton2);
		
		JRadioButton radioBoton3 = new JRadioButton("opcion 3", false);
		radioBoton3.setBounds(600, 350, 100, 40);
		panel.add(radioBoton3);
		
		ButtonGroup grupoRadioBotones = new ButtonGroup();
		grupoRadioBotones.add(radioBoton1);
		grupoRadioBotones.add(radioBoton2);
		grupoRadioBotones.add(radioBoton3);
	}

	private void colocarCajasDeTexto(){
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBounds(100, 100, 200, 50);
		cajaTexto.setText("Hola mundo");
		System.out.println("la caja dice: " + cajaTexto.getText());
		panel.add(cajaTexto);
	}

	private void colocarAreasDeTexto() {
		
		JTextArea areaTexto = new JTextArea("Escriba aqui su opinion...", 100, 200);
		areaTexto.setBounds(20, 20, 300, 200);
		areaTexto.append("\n mas texto"); //añade mas texto al area
		panel.add(areaTexto);
		
	}
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
	
	public static void recursivo(File directorio, String leftIndent) {
	    if (directorio.isDirectory()) {
	        System.out.println(leftIndent + directorio.getName());

	        leftIndent += "     ";

	        File subDirectorios[] = directorio.listFiles();
	        for (File subDirectorio : subDirectorios) {
	            recursivo(subDirectorio, leftIndent);
	        }
	    } else {

	        System.out.println(leftIndent +"|   --> "+ directorio.getName());

	    }
	}
}