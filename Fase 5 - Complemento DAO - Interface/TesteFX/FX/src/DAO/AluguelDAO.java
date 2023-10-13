package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.entity.Aluguel;
import model.entity.Venda;

public class AluguelDAO extends BaseDaoImpl<Aluguel> {

	public Long inserir(Aluguel alu) {
		Connection con = getConnection();
		String sql = "INSERT INTO tb_Alugueis (cpf_cliente,codigo_objeto,data_aquisicao,data_devolucao) "
				+ "values (?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, alu.getCpfCliente());
			ps.setInt(2, alu.getCodigoObjeto());
			ps.setDate(3, alu.getDataAquisicao());
			ps.setDate(3, alu.getDataDevolucao());
			ps.execute();
			ps.close();

			sql = "SELECT MAX(codigo_Alugueis) AS max_codigo FROM tb_Alugueis";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				return rs.getLong("max_codigo");
			else
				return null;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			closeConnection();
		}

	}

	@Override
	public void deletar(Aluguel alu) {
		Connection con = getConnection();
		String sql = "DELETE FROM tb_Alugueis WHERE codigo_Aluguel = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1, alu.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	@Override
	public void alterar(Aluguel alu) {
		Connection con = getConnection();
		String sql = "UPDATE tb_Alugueis SET cpf_cliente = ?, codigo_objeto = ?, data_aquisicao = ? , data_devolucao WHERE codigo_Aluguel = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, alu.getCpfCliente());
			ps.setInt(2, alu.getCodigoObjeto());
			ps.setDate(3, alu.getDataAquisicao());
			ps.setDate(4, alu.getDataDevolucao());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	@Override
	public Aluguel buscar(Aluguel alu) {
		Connection con = getConnection();
		String sql = "SELECT * FROM tb_Alugueis WHERE codigo_Aluguel = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1, alu.getId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Aluguel AluguelEncontrado = new Aluguel();
				AluguelEncontrado.setId(rs.getLong("codigo_Aluguel"));
				AluguelEncontrado.setCpfCliente(rs.getString("cpf_cliente"));
				AluguelEncontrado.setCodigoObjeto(rs.getInt("codigo_objeto"));
				AluguelEncontrado.setDataAquisicao(rs.getDate("data_aquisicao"));
				AluguelEncontrado.setDataDevolucao(rs.getDate("data_devolucao"));
				return AluguelEncontrado;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return null;
	}

	@Override
	public List<Aluguel> listar() {
		Connection con = getConnection();
		String tb_Aluguel = "SELECT * FROM tb_Alugueis";
		List<Aluguel> Alugueis = new ArrayList<Aluguel>();
		try {
			PreparedStatement ps = con.prepareStatement(tb_Aluguel);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Aluguel alu = new Aluguel();

				try {
					alu.setCpfCliente(rs.getString("cpf_cliente"));
					alu.setCodigoObjeto(rs.getInt("codigo_objeto"));
					alu.setDataAquisicao(rs.getDate("data_aquisicao"));
					alu.setDataDevolucao(rs.getDate("data_devolucao"));
					alu.setId(rs.getLong("codigo_Aluguel"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				Alugueis.add(alu);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return Alugueis;
	}

	public List<Aluguel> pesquisaCliente(Aluguel alu) {
		Connection con = getConnection();
		String sql = "SELECT * FROM tb_Alugueis WHERE cpf_cliente = ?";
		List<Aluguel> alugueis = new ArrayList<Aluguel>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, alu.getCpfCliente());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Aluguel AluguelEncontrado = new Aluguel();

				try {
					AluguelEncontrado.setId(rs.getLong("codigo_Aluguel"));
					AluguelEncontrado.setCpfCliente(rs.getString("cpf_cliente"));
					AluguelEncontrado.setCodigoObjeto(rs.getInt("codigo_objeto"));
					AluguelEncontrado.setDataAquisicao(rs.getDate("data_aquisicao"));
					AluguelEncontrado.setDataDevolucao(rs.getDate("data_devolucao"));
				} catch (SQLException e) {
					e.printStackTrace();
				} 
				alugueis.add(AluguelEncontrado);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return alugueis;
	}

	public List<Venda> listarVendas() {
		Connection con = getConnection();
		String tb_vendas = "SELECT * FROM view_vendas";

		List<Venda> vendas = new ArrayList<Venda>();
		try {
			PreparedStatement ps = con.prepareStatement(tb_vendas);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Venda ven = new Venda();

				try {
					ven.setTitulo(rs.getString("titulo"));
					ven.setQuantidadeExemplares(rs.getInt("quantidade_exemplares"));
					ven.setValorAluguel(rs.getFloat("valor_aluguel"));	
				} catch (Exception e) {
					e.printStackTrace();
				}
				vendas.add(ven);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return vendas;
	}

}