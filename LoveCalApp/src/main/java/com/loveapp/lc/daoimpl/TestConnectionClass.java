package com.loveapp.lc.daoimpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestConnectionClass {
	
	

	public TestConnectionClass() {
		System.out.println("Default constructor::::");
	}

	@Autowired(required = true)
	private DataSource dataSource;
	
	static Connection conn = null;

	public void testConnection() {
		try {
			conn = dataSource.getConnection();
			System.out.println("Connection Obj::::"+conn);
			
			String query = "CREATE TABLE TABLE1"
					+ "(COLUMN1 VARCHAR2(20))";
			
			System.out.println(query);
			Statement st = conn.createStatement();
			//st.execute(query);
			st.close();
			conn.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
