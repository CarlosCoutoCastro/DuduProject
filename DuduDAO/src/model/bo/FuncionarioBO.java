package model.bo;

import DAO.BaseDao;
import DAO.AluguelDAO;
import Exceptions.SemRuaException;
import model.entity.Aluguel;


public class AluguelBO {
	public void criar(Aluguel alu) {
	
		BaseDao aluDao = new AluguelDAO();

		aluDao.inserir(alu);
		
		
	}
}
