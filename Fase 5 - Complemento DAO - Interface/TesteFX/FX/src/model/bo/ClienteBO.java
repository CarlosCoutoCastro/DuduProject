package model.bo;

import java.util.List;

import DAO.BaseDao;
import DAO.ClienteDAO;
import model.entity.Cliente;
<<<<<<< HEAD
import model.entity.Cliente;
=======
>>>>>>> origin/master

public class ClienteBO {
	ClienteDAO conexaoCliente = new ClienteDAO();

	public ClienteBO() {
		try {
			conexaoCliente.getConnection();
		} catch (Exception e) {
			System.out.println("Falha na conexão");
		}
	}

	public Long criar(Cliente cli) {

		Cliente cliente = conexaoCliente.verificarCPF(cli);
		if (cliente == null) {
			return conexaoCliente.inserir(cli);
		} else {
<<<<<<< HEAD
			cli.setId(cliente.getId());
			conexaoCliente.alterar(cli);
=======
>>>>>>> origin/master
			System.out.println("POP - UP - CPF já existente");
			return null;
		}
	}

<<<<<<< HEAD
	public void alterar(Cliente cli) {
			conexaoCliente.alterar(cli);
	}

=======
>>>>>>> origin/master
	public void delete(Cliente cli) {

		Cliente cliente = conexaoCliente.verificarCPF(cli);
		if (cliente == null) {
			System.out.println("POP - UP - Cliente não existente");
		} else {
			conexaoCliente.deletar(cli);
		}
	}

	public Cliente buscar(Cliente cli) {

		Cliente clientePorID = conexaoCliente.buscar(cli);
		if (clientePorID == null) {
			Cliente clientePorCPF = conexaoCliente.verificarCPF(cli);
<<<<<<< HEAD
			if (clientePorCPF == null) {
				System.out.println("POP - UP - Cliente não existente");
				return null;
			} else {
=======
			if(clientePorCPF == null){
				System.out.println("POP - UP - Cliente não existente");
				return null;
			}else{
>>>>>>> origin/master
				return clientePorCPF;
			}
		} else {
			return clientePorID;
		}

	}

<<<<<<< HEAD
	public List<Cliente> listar() {
		return conexaoCliente.listar();
	}

	public Cliente autenticarCPF(Cliente cli) {
		Cliente clientePorCPF = conexaoCliente.verificarCPF(cli);
		if (clientePorCPF != null) {
			return clientePorCPF;
		} else {
			System.out.println("Cliente já existente");
			return null;
		}

	}

	public List<Cliente> pesquisaTotal(Cliente Cliente) {
		if(Cliente != null) {
			return conexaoCliente.pesquisaTotal(Cliente);
		}else{
			return conexaoCliente.listar();
		}
		
	}
=======
	public List<Cliente> listar(){
		return conexaoCliente.listar();
	}





>>>>>>> origin/master
}
