package model.bo;

import java.util.List;

import DAO.BaseDao;
import DAO.FuncionarioDAO;
<<<<<<< HEAD
import model.entity.Disco;
=======
>>>>>>> origin/master
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

<<<<<<< HEAD
	public void alterar(Funcionario fun) {
			System.out.println(fun.getId());
			conexaoFuncionario.alterar(fun);
	}

	public void criar(Funcionario fun) {

		Funcionario autenticarFuncionario = conexaoFuncionario.VerificarLogin(fun);
		if (autenticarFuncionario == null) {
			conexaoFuncionario.inserir(fun);
		} else {
			fun.setId(autenticarFuncionario.getId());
			conexaoFuncionario.alterar(fun);
			// System.out.println("POP-UP , Login já existente");

=======
	public long criar(Funcionario fun) {

		Funcionario autenticarFuncionario = conexaoFuncionario.VerificarLogin(fun);
		if (autenticarFuncionario == null) {
			return conexaoFuncionario.inserir(fun);
		} else {
			System.out.println("POP-UP , Login já existente");
			return (Long) null;
>>>>>>> origin/master
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
<<<<<<< HEAD
				if (funcionarioPorLogin == null) {
					System.out.println("POP UP - Funcionario Inexistente ");
					return null;
				} else
=======
				if(funcionarioPorLogin == null){
					System.out.println("POP UP - Funcionario Inexistente ");
					return null;
				}else
>>>>>>> origin/master
					return funcionarioPorLogin;
			} else
				return funcionarioPorAutenticacao;

		} else
			return funcionarioPorID;

	}

<<<<<<< HEAD
	public List<Funcionario> listar() {
=======
	public List<Funcionario> listar(){
>>>>>>> origin/master
		List<Funcionario> funcionarios = conexaoFuncionario.listar();
		return funcionarios;
	}

<<<<<<< HEAD
	public List<Funcionario> pesquisaTotal(Funcionario funcionario) {
		if (funcionario != null) {
			return conexaoFuncionario.pesquisaTotal(funcionario);
		} else {
			return conexaoFuncionario.listar();
		}

	}

	public Funcionario VerificarLogin(Funcionario funcionario){
		return conexaoFuncionario.VerificarLogin(funcionario);
	}

	public Funcionario login(Funcionario login) {

		Funcionario autenticarFuncionario = conexaoFuncionario.autenticar(login);
		if (autenticarFuncionario == null) {
			System.out.println("POP-UP, Login não existente");
			return null;
		} else {
			return autenticarFuncionario;
		}

	}

=======
>>>>>>> origin/master
}
