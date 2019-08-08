package app;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.UIManager;

import dao.CadastroDaoImpl;
import javax.swing.Box;


public class Janela extends Cadastro {

	
	
	private JFrame frmLsport;
	private JTextField textModelo;
	private JTextField textNomeC;
	private JTextField textNumero;
	private JTextField textRua;
	private JTextField textApt;
	private JTextField textCompl;
	private JTextField textCep;
	private JTextField textTel;
	private JTextField textEmail;
	private JTextField textNome;
	private JTextField textTamanho;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Janela window = new Janela();
					window.frmLsport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() throws SQLException {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLsport = new JFrame();
		frmLsport.setTitle("LSPORTS19");
		frmLsport.setBounds(100, 100, 494, 409);
		frmLsport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLsport.getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(26, 78, 67, 22);
		frmLsport.getContentPane().add(lblModelo);
		
		textModelo = new JTextField();
		textModelo.setBounds(78, 79, 222, 20);
		frmLsport.getContentPane().add(textModelo);
		textModelo.setColumns(10);
		
		JLabel lblTamanho = new JLabel("Tamanho");
		lblTamanho.setBounds(26, 106, 48, 14);
		frmLsport.getContentPane().add(lblTamanho);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(26, 136, 48, 14);
		frmLsport.getContentPane().add(lblNewLabel);
		
		textNomeC = new JTextField();
		textNomeC.setBounds(78, 133, 96, 20);
		frmLsport.getContentPane().add(textNomeC);
		textNomeC.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero ");
		lblNumero.setBounds(196, 136, 57, 14);
		frmLsport.getContentPane().add(lblNumero);
		
		textNumero = new JTextField();
		textNumero.setBounds(251, 133, 37, 20);
		frmLsport.getContentPane().add(textNumero);
		textNumero.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(227, 157, 73, 14);
		frmLsport.getContentPane().add(lblEndereo);
		
		textRua = new JTextField();
		textRua.setBounds(78, 213, 190, 20);
		frmLsport.getContentPane().add(textRua);
		textRua.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(26, 216, 30, 14);
		frmLsport.getContentPane().add(lblRua);
		
		JLabel lblNewLabel_1 = new JLabel("Apt");
		lblNewLabel_1.setBounds(277, 216, 23, 14);
		frmLsport.getContentPane().add(lblNewLabel_1);
		
		textApt = new JTextField();
		textApt.setBounds(304, 213, 47, 20);
		frmLsport.getContentPane().add(textApt);
		textApt.setColumns(10);
		
		JLabel lblCompl = new JLabel("Compl.");
		lblCompl.setBounds(361, 216, 48, 14);
		frmLsport.getContentPane().add(lblCompl);
		
		textCompl = new JTextField();
		textCompl.setBounds(405, 213, 47, 20);
		frmLsport.getContentPane().add(textCompl);
		textCompl.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(26, 191, 30, 14);
		frmLsport.getContentPane().add(lblCep);
		
		textCep = new JTextField();
		textCep.setBounds(78, 182, 154, 20);
		frmLsport.getContentPane().add(textCep);
		textCep.setColumns(10);
		
		JLabel lblContato = new JLabel("Contato");
		lblContato.setBounds(227, 235, 48, 14);
		frmLsport.getContentPane().add(lblContato);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(26, 260, 48, 14);
		frmLsport.getContentPane().add(lblTelefone);
		
		textTel = new JTextField();
		textTel.setBounds(78, 257, 105, 20);
		frmLsport.getContentPane().add(textTel);
		textTel.setColumns(10);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(0, 0, 1, 1);
		frmLsport.getContentPane().add(horizontalBox);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(216, 260, 37, 14);
		frmLsport.getContentPane().add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(259, 257, 105, 20);
		frmLsport.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblCadastroDeCamisa = new JLabel("Cadastro de Camisa");
		lblCadastroDeCamisa.setBounds(196, 21, 160, 14);
		frmLsport.getContentPane().add(lblCadastroDeCamisa);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(26, 53, 48, 14);
		frmLsport.getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(78, 50, 222, 20);
		frmLsport.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(277, 302, 89, 23);
		frmLsport.getContentPane().add(btnLimpar);
		
		JButton btnCadastar = new JButton("Cadastar");
		btnCadastar.setBounds(89, 302, 89, 23);
		frmLsport.getContentPane().add(btnCadastar);
		
		textTamanho = new JTextField();
		textTamanho.setBounds(78, 103, 48, 20);
		frmLsport.getContentPane().add(textTamanho);
		textTamanho.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		frmLsport.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JButton btnRelatorio = new JButton("Relatorio");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorio r = new Relatorio();
				r.frame.setVisible(true);
				
			}
		});
		mnNewMenu.add(btnRelatorio);
		
		btnLimpar.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		textNome.setText(null);
		textModelo.setText(null);
		textTamanho.setText(null);
		textNomeC.setText(null);
		textNumero.setText(null);
		textCep.setText(null);
		textRua.setText(null);
		textApt.setText(null);
		textCompl.setText(null);
		textTel.setText(null);
		textEmail.setText(null);
		
			
		}
		});
		
		btnCadastar.addActionListener(new ActionListener()
		   {
		   public void actionPerformed( ActionEvent e )
		    {
			   
			   
			   Cadastro cadastro = new Cadastro();
			   CadastroDaoImpl c = new CadastroDaoImpl();
			   
			   cadastro.setNome(textNome.getText());
			   
			   	 	System.out.println("------------Cadastro------------");	
			   	  Nome = textNome.getText();
			  	  System.out.println("Nome: "+ Nome);
				  Modelo = textModelo.getText();
				  System.out.println("Modelo: "+ Modelo);
			      Tamanho = textTamanho.getText();
			      System.out.println("Tamanho: "+ Tamanho);
				  NomeC = textNomeC.getText();
				  System.out.println("Nome na Camisa: "+ NomeC);
				  Numero = Integer.parseInt(textNumero.getText());
				  System.out.println("Numero da Camisa: "+ Numero);
				  Cep = Integer.parseInt(textCep.getText());
				  System.out.println("Cep: "+ Cep);
				  Rua = textRua.getText();
				  System.out.println("Rua: "+ Rua);
				  Apt = Integer.parseInt(textApt.getText());
				  System.out.println("Apt: "+ Apt);
				  Compl = Integer.parseInt(textCompl.getText());
				  System.out.println("Complemento: "+ Compl);
				  Telefone = Integer.parseInt(textTel.getText());
				  System.out.println("Telefone: "+ Telefone);
				  Email = textEmail.getText();
				  System.out.println("Email: "+ Email);
				   System.out.println("--------------------------------");
				  clearFields();
				  
				  
				  
			   
		    
		    }

		private void clearFields() {
			textNome.setText("");
			textModelo.setText("");
			textTamanho.setText("");
			textNomeC.setText("");
			textNumero.setText("");
			textCep.setText("");
			textRua.setText("");
			textApt.setText("");
			textCompl.setText("");
			textTel.setText("");
			textEmail.setText("");
		
			
		}
		  
		 });
		
	}
}
