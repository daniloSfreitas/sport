package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	public Connection getConexao(){
		Connection conexao = null;
		
		try {		
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@LOCALHOST:1521:LOCAL", "PRJ_CADASTRO", "PRJ");
			System.out.println("Conectou!!");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conexao;
	}
	
	public static void main(String args[]) {
		DAO dao = new DAO();
		dao.getConexao();
	}
}


