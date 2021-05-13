package br.anhanguera.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) {
		try {
			Connection conn = ConnectionFactory.getConnection();
			
			if(conn != null) {
				System.out.println("Conexão realizada com sucesso!");
				conn.close();
			}
		} catch (SQLException e) {
			System.err.println("Erro ao estabelecer a connection " + e);
		}
	}
}
