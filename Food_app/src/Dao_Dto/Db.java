package Dao_Dto;
import java.sql.*;
public class Db {
public static Connection connect() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel","root","root");
	return con;
	
}
}
