package dao;

import java.util.List;

import app.Cadastro;

public interface CadastroDAO{
	
	public void cadastro (Cadastro cadastro);
	
	public List<Cadastro> findAll();

}
