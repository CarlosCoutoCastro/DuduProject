package model.bo;

import java.util.List;

import DAO.BaseDao;
import DAO.DiscoDAO;
import model.entity.Cliente;
import model.entity.Disco;

public class DiscoBO {
	DiscoDAO conexaoDisco = new DiscoDAO();

	public DiscoBO() {
		try {
			conexaoDisco.getConnection();
		} catch (Exception e) {
			System.out.println("Falha na conexão");
		}
	}

	public long criar(Disco dis) {

		Disco disco = conexaoDisco.pesquisaTitulo(dis);
		if (disco == null) {
			return conexaoDisco.inserir(dis);
		} else {
			System.out.println("POP-UP LIVRO JA EXISTENTE");
			return (Long) null;
		}
	}

	public void Deletar(Disco dis) {

		Disco discoPorID = conexaoDisco.buscar(dis);
		if (discoPorID != null) {
			conexaoDisco.deletar(dis);
		} else {
			Disco disco = conexaoDisco.pesquisaTitulo(dis);
			if (disco != null) {
				conexaoDisco.deletar(disco);
			} else {
				System.out.println("POP-UP LIVRO NAO EXISTENTE");
			}
		}
	}

	public Disco buscar(Disco dis){

		Disco discoPorID = conexaoDisco.buscar(dis);
		if (discoPorID != null) {
			return conexaoDisco.buscar(dis);
		} else {
			Disco disco = conexaoDisco.pesquisaTitulo(dis);
			if (disco != null) {
				return conexaoDisco.buscar(dis);
			} else {
				System.out.println("POP-UP LIVRO NAO EXISTENTE");
				return null;
			}
		}
	}

	public List<Disco> listar(){
		return conexaoDisco.listar();
	}

}
