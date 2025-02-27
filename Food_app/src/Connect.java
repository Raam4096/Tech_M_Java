import java.sql.*;

public class Connect {

public static Connection con() throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Restuarant","root","");
	if(c!=null) {
    System.out.println("conncected");
	}
	return c;
	}	}

