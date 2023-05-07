package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class InterfazGeneral extends JFrame implements ActionListener{
	
	private static final String USUARIO = "USUARIO";
	
	private JComboBox<String> usuario;

	public InterfazGeneral()
	{
		
		getContentPane().setBackground(new Color (134, 197, 210));
		setLayout(new BorderLayout());
		
		
		setTitle("Hotel Casanova 🏨");
		setSize(700, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel selusu = new JLabel("Seleccione un usuario: ");
		add(selusu, BorderLayout.CENTER);
		
		String[] opcionesUsuario = {"Administrador", "Empleado", "Huesped"};
		usuario = new JComboBox<String>(opcionesUsuario); 
		usuario.addActionListener(this);
		usuario.setActionCommand(USUARIO);
		
		add(usuario, BorderLayout.CENTER);
		
	}
	
	

	
public static void main(String[] args)
	{
		new InterfazGeneral();
	}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String comando = e.getActionCommand();
	
	Object usuarioSeleccionado = null;
	if (comando.equals(USUARIO))
		usuarioSeleccionado = usuario.getSelectedItem();
		String seleccionado = usuarioSeleccionado.toString();
		if (seleccionado == "Huesped") {
			new InterfazHuesped();
		
		}
		if (seleccionado == "Administrador") {
			new InterfazAdministrador();
		}
		
		if (seleccionado == "Empleado") {
			new InterfazEmpleado();
		}
		
		
	
	
	
}


	

}
