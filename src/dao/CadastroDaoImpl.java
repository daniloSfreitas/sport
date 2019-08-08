package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.Cadastro;

public class CadastroDaoImpl implements CadastroDAO{

	@Override
	public void cadastro(Cadastro cadastro) {

		try {

			Connection conexao = DAO.getConexao();

			PreparedStatement pstmt = conexao.prepareStatement(" INSERT INTO Cadastro "
					+ " (Nome, Modelo, Tamanho, NomeC, Numero, Cep, Rua, Apt, Compl, Telefone, Email) VALUES "
					+ " (?,?,?,?,?,?,?,?,?,?,?)");

			pstmt.setString(1, cadastro.getNome());
			pstmt.setString(2, cadastro.getModelo());
			pstmt.setString(3, cadastro.getTamanho());
			pstmt.setString(4, cadastro.getNomeC());
			pstmt.setInt(5, cadastro.getNumero());
			pstmt.setInt(6, cadastro.getCep());
			pstmt.setString(7, cadastro.getRua());
			pstmt.setInt(8, cadastro.getApt());
			pstmt.setInt(9, cadastro.getCompl());
			pstmt.setInt(10, cadastro.getTelefone());
			pstmt.setString(11, cadastro.getEmail());

			pstmt.execute();
			conexao.close();
			pstmt.close();

		} catch (SQLException e) {
			System.out.println(" Ocorreu um erro ao inserir dados ");
			e.printStackTrace();
		}
	}

	public List<Cadastro> cadastros;

	@Override
	public List<Cadastro> findAll() {

		try {
			cadastros = new ArrayList<Cadastro>();
			ResultSet rs;
			Connection conexao = DAO.getConexao();
			PreparedStatement pstmt = conexao.prepareStatement("Select * from Cadastro;");
			rs = pstmt.executeQuery();
			while (rs.next()) {

				Cadastro cadastro = new Cadastro();
				cadastro.setModelo(rs.getString("Modelo"));

				cadastros.add(cadastro);
			}

		} catch (SQLException e) {

			System.out.println("Ocorreu um erro de conexão com o banco!");
			e.printStackTrace();
		}

		return cadastros;
	}

}
