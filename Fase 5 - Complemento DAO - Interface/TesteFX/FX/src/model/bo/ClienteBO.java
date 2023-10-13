package model.bo;

import java.util.List;

import DAO.BaseDao;
import DAO.ClienteDAO;
import model.entity.Cliente;

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
			System.out.println("POP - UP - CPF já existente");
			return null;
		}
	}

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
			if(clientePorCPF == null){
				System.out.println("POP - UP - Cliente não existente");
				return null;
			}else{
				return clientePorCPF;
			}
		} else {
			return clientePorID;
		}

	}

	public List<Cliente> listar(){
		return conexaoCliente.listar();
	}





}
