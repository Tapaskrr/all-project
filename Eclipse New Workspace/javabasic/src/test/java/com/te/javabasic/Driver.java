package com.te.javabasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) throws SQLException {

//		Movies movies=new Movies(null, null, null);

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "root", "5679");
		Statement createStatement = connection.createStatement();
		ResultSet executeQuery = createStatement.executeQuery("select * from testyantra");
		while (executeQuery.next()) {
			String string = executeQuery.getString(3);
			System.out.println(string);
		}
		createStatement.close();
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into testyantra values(?,?,?)");
		preparedStatement.setString(1, "raj1");
		preparedStatement.setString(2, "actor1");
		preparedStatement.setString(3, "unknown1");
		preparedStatement.executeUpdate();
		ResultSet newExecuteQuery = preparedStatement.executeQuery("select * from testyantra");
		while (newExecuteQuery.next()) {
			String string = newExecuteQuery.getString(1);
			System.out.println(string);
		}

	}
}
