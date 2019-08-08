package app;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import dao.CadastroDaoImpl;

public class Relatorio {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relatorio window = new Relatorio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Relatorio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(42, 227, 89, 23);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(297, 227, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		JLabel lblConsultaDeCadastro = new JLabel("Consulta de Cadastro");
		lblConsultaDeCadastro.setBounds(159, 0, 119, 14);
		frame.getContentPane().add(lblConsultaDeCadastro);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(42, 25, 340, 191);
		frame.getContentPane().add(textArea);
		
		
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Cadastro cadastro = new Cadastro();
				   CadastroDaoImpl c = new CadastroDaoImpl();
				 
				
			}
		});
	}
	}
