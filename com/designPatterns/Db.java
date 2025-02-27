package com.designPatterns;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {

	public static Connection con() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Testing","root","");
		return cn;
	}
}
