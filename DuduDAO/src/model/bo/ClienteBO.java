package model.bo;

import DAO.BaseDao;
import DAO.ClienteDAO;
import Exceptions.SemRuaException;
import model.entity.Cliente;


public class ClienteBO {
	public void criar(Cliente cli) {
	
		BaseDao cliDao = new ClienteDAO();

		cliDao.inserir(cli);
		
		
	}
}
