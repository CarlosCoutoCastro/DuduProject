package model.bo;

import java.util.List;

import DAO.BaseDao;
import DAO.LivroDAO;
import model.entity.Livro;



public class LivroBO {
	LivroDAO conexaoLivro = new LivroDAO();

	public LivroBO() {
		try {
			conexaoLivro.getConnection();
		} catch (Exception e) {
			System.out.println("Falha na conexão");
		}
	}

	public long criar(Livro liv) {

		Livro Livro = conexaoLivro.pesquisaTitulo(liv);
		if (Livro == null) {
			return conexaoLivro.inserir(liv);
		} else {
			System.out.println("POP-UP LIVRO JA EXISTENTE");
			return (Long) null;
		}
	}

	public void Deletar(Livro liv) {

		Livro LivroPorID = conexaoLivro.buscar(liv);
		if (LivroPorID != null) {
			conexaoLivro.deletar(liv);
		} else {
			Livro Livro = conexaoLivro.pesquisaTitulo(liv);
			if (Livro != null) {
				conexaoLivro.deletar(Livro);
			} else {
				System.out.println("POP-UP LIVRO NAO EXISTENTE");
			}
		}
	}

	public Livro buscar(Livro liv){

		Livro LivroPorID = conexaoLivro.buscar(liv);
		if (LivroPorID != null) {
			return LivroPorID;
		} else {
			Livro livro = conexaoLivro.pesquisaTitulo(liv);
			if (livro != null) {
				return livro;
			} else {
				System.out.println("POP-UP LIVRO NAO EXISTENTE");
				return null;
			}
		}
	}

	public List<Livro> listar(){
		return conexaoLivro.listar();
	}
}
