package model.bo;

import DAO.BaseDao;
import DAO.LivroDAO;
import Exceptions.SemRuaException;
import model.entity.Livro;


public class LivroBO {
	public void criar(Livro liv) {
	
		BaseDao livDao = new LivroDAO();

		livDao.inserir(liv);
		
		
	}
}
