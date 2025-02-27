package com.designPatterns;
import java.sql.*;

public class EmpDaoImp implements EmpDao{
    
		
	
	
	@Override
	public void addEmp(EmpDto e)  {
		// TODO Auto-generated method stub
		try {
		Connection con=Db.con();
		String insertquery="insert into Employee values(?,?)";
		PreparedStatement ps=con.prepareStatement(insertquery);
		ps.setInt(1,e.getId());
		ps.setString(2, e.getName());
		int res=ps.executeUpdate();
		if(res>0) {
			System.out.println(res+" row Inserted");
		}
	}
		catch(Exception f) {
			f.printStackTrace();
		}
	}

	@Override
	public void dispEmp() {
		// TODO Auto-generated method stub
		try {
		Connection con=Db.con();
		String dispquery="select * from Employee";
		PreparedStatement ps=con.prepareStatement(dispquery);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		}
		catch(Exception e) {
			
		}
	}

	
	public static void main(String arg[]) 
	{
	EmpDto e1=new EmpDto("Raama",2);	
	EmpDaoImp m= new EmpDaoImp();
	m.addEmp(e1);
	m.dispEmp();
	}

		
}
