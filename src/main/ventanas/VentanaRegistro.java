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

		btnAceptar.addActionListener(new ActionListener() {
			//Aqui añadiremos los datos a la base de datos
		
		});

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(341, 247, 117, 29);
		getContentPane().add(btnCancelar);

		// Esto se lanza cuando alguien pulsa el boton de Cancelar
		btnCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(72, 168, 86, 14);
		getContentPane().add(lblGenero);

		textField_nombre = new JTextField();
		textField_nombre.setBounds(156, 29, 106, 20);
		getContentPane().add(textField_nombre);
		textField_nombre.setColumns(10);

		List<Integer> lstDia = new ArrayList<>();
		int dia = (31);
		for (int i = 1; i <= dia; i++) {
			lstDia.add(i);
		}

		cbDia = new JComboBox<Object>();
		cbDia.setModel(
				(ComboBoxModel<Object>) new DefaultComboBoxModel<Object>(lstDia.toArray(new Integer[lstDia.size()])));
		cbDia.setBounds(72, 138, 78, 20);
		getContentPane().add(cbDia);

		comboBox_mes = new JComboBox<String>();
		comboBox_mes.setBounds(174, 137, 159, 20);
		getContentPane().add(comboBox_mes);
		comboBox_mes.addItem(meses[0]);
		comboBox_mes.addItem(meses[1]);
		comboBox_mes.addItem(meses[2]);
		comboBox_mes.addItem(meses[3]);
		comboBox_mes.addItem(meses[4]);
		comboBox_mes.addItem(meses[5]);
		comboBox_mes.addItem(meses[6]);
		comboBox_mes.addItem(meses[7]);
		comboBox_mes.addItem(meses[8]);
		comboBox_mes.addItem(meses[9]);
		comboBox_mes.addItem(meses[10]);
		comboBox_mes.addItem(meses[11]);

		List<Integer> lstAnyos = new ArrayList<>();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		for (int i = 1900; i <= year; i++) {
			lstAnyos.add(i);
		}

		cbAnyo = new JComboBox<Object>();
		cbAnyo.setModel((ComboBoxModel<Object>) new DefaultComboBoxModel<Object>(
				lstAnyos.toArray(new Integer[lstAnyos.size()])));
		cbAnyo.setBounds(361, 137, 128, 20);
		getContentPane().add(cbAnyo);

	}

	public static void main(String[] args) {
		VentanaRegistro v = new VentanaRegistro();
		v.setVisible(true);

	}
}

