package br.edu.up.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConnection() throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercadinho", "root", "12345A");

		return con;
	}
}
