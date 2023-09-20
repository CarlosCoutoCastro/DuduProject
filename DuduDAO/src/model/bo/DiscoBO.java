package model.bo;

import DAO.BaseDao;
import DAO.DiscoDAO;
import Exceptions.SemRuaException;
import model.entity.Disco;


public class DiscoBO {
	public void criar(Disco dis) {
	
		BaseDao disDao = new DiscoDAO();

		disDao.inserir(dis);
		
		
	}
}
