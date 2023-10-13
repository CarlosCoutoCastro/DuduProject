package model.bo;

import java.util.List;

import DAO.BaseDao;
import DAO.FuncionarioDAO;
import model.entity.Funcionario;

public class FuncionarioBO {
	private FuncionarioDAO conexaoFuncionario = new FuncionarioDAO();

	public FuncionarioBO() {
		try {
			conexaoFuncionario.getConnection();
		} catch (Exception e) {
			System.out.println("Falha na conexão");
		}
	}

	public long criar(Funcionario fun) {

		Funcionario autenticarFuncionario = conexaoFuncionario.VerificarLogin(fun);
		if (autenticarFuncionario == null) {
			return conexaoFuncionario.inserir(fun);
		} else {
			System.out.println("POP-UP , Login já existente");
			return (Long) null;
		}
	}

	public void deletar(Funcionario fun) {

		Funcionario autenticarFuncionario = conexaoFuncionario.VerificarLogin(fun);
		if (autenticarFuncionario == null) {
			System.out.println("POP-UP , Login não existente");
		} else {
			conexaoFuncionario.deletar(fun);
		}
	}

	public Funcionario buscar(Funcionario fun) {

		Funcionario funcionarioPorID = conexaoFuncionario.buscar(fun);
		if (funcionarioPorID == null) {
			Funcionario funcionarioPorAutenticacao = conexaoFuncionario.autenticar(fun);
			if (funcionarioPorAutenticacao == null) {
				Funcionario funcionarioPorLogin = conexaoFuncionario.VerificarLogin(fun);
				if(funcionarioPorLogin == null){
					System.out.println("POP UP - Funcionario Inexistente ");
					return null;
				}else
					return funcionarioPorLogin;
			} else
				return funcionarioPorAutenticacao;

		} else
			return funcionarioPorID;

	}

	public List<Funcionario> listar(){
		List<Funcionario> funcionarios = conexaoFuncionario.listar();
		return funcionarios;
	}

}
