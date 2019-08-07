package dao;

import  java.sql.Connection ;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import app.Cadastro;

public class CadastroDaoImpl implements CadastroDAO {

	@Override
	public void cadastro(Cadastro cadastro) {
		
		
	
	try {
		
		Connection conexao = getConexao();	
				
		PreparedStatement pstmt = conexao
		          .prepareStatement( " INSERT INTO Cadastro "
				+  " (Nome, Modelo, Tamanho, NomeC, Numero, Cep, Rua, Apt, Compl, Telefone, Email) VALORES "
				+  " (?,?,?,?,?,?,?,?,?,?,?) " );
		
		pstmt.setString ( 1 , cadastro.getNome ());
		pstmt.setString ( 2 , cadastro.getModelo());
		pstmt.setString ( 3 , cadastro.getTamanho());
		pstmt.setString ( 4 , cadastro.getNomeC());
		pstmt.setInt    ( 5 , cadastro.getNumero());
		pstmt.setInt     ( 6 , cadastro.getCep());
		pstmt.setString ( 7 , cadastro.getRua());
		pstmt.setInt ( 7 , cadastro.getApt());
		pstmt.setInt ( 9 , cadastro.getCompl());
		pstmt.setInt ( 10 , cadastro.getTelefone());
		pstmt.setString ( 11 , cadastro.getEmail());
		
		
		pstmt.execute();
		conexao.close();
		pstmt.close();
		
	} catch ( SQLException e) {
		System.out.println( " Ocorreu um erro ao inserir dados " );
		e . printStackTrace ();
	 }	
	}

	private Connection getConexao() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
