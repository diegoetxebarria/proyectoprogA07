package main.Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import main.baseDatos.BD;
import main.model.Usuario;


public class VentanaRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField_nombre;
	private JComboBox<Object> cbDia;
	private JComboBox<String> comboBox_mes;
	private JComboBox<Object> cbAnyo;
	String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };

	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(600, 330);
		setLocation(400, 150);
		setTitle("Registro");
		getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nick");
		lblNombre.setBounds(72, 31, 61, 16);
		getContentPane().add(lblNombre);

		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(72, 72, 86, 16);
		getContentPane().add(lblContrasea);

		passwordField = new JPasswordField();
		passwordField.setBounds(156, 70, 106, 21);
		getContentPane().add(passwordField);

		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBounds(108, 189, 86, 23);
		getContentPane().add(rdbtnHombre);

		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(235, 189, 78, 23);
		getContentPane().add(rdbtnMujer);

		JRadioButton rdbtnNoBinario = new JRadioButton("No Binario");
		rdbtnNoBinario.setBounds(385, 189, 147, 23);
		getContentPane().add(rdbtnNoBinario);

		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(72, 110, 173, 16);
		getContentPane().add(lblFechaDeNacimiento);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(145, 247, 117, 29);
		getContentPane().add(btnAceptar);

		
}

