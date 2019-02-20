package vista;

//Java program to create a blank text  
//field of definite number of columns. 
import java.awt.event.*;
import javax.swing.*;

class Vista extends JFrame implements ActionListener {
	// JTextField
	static JTextField t;

	// JFrame
	static JFrame f;

	// JButton Crear Temporada
	static JButton b1;
	
	// JButton Temporada creada
	static JButton b2;

	// label to diaplay text
	static JLabel l;

	// default constructor
	Vista() {
	}

	// main class
	public static void main(String[] args) {
		// create a new frame to stor text field and button
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

	// if the vutton is pressed
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		Integer aux;
		if (s.equals("Crear Temporada")) {
			// set the text of the label to the text of the field
			aux = Integer.parseInt(t.getText()) * 2;
			l.setText(Integer.toString(aux));

			// set the text of field to blank
			t.setText("  ");
		} else if (s.equals("Temporada Creada")) {
			l.setText("Quiero ir a la temporada creada");

			// set the text of field to blank
			t.setText("  ");
		}
	}
}