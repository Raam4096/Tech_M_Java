package Dao_Dto;
import java.util.Scanner;
import java.sql.*;
class Owner_imp implements Owner_dao
{

	@Override
	public int addItem(Owner_dto od) {
		// TODO Auto-generated method stub
			String Insert="insert into Menu(name,price) values(?,?)";
			int i=0;
			try 
			{
				Connection con= Db.connect();
				PreparedStatement ps=con.prepareStatement(Insert);
				ps.setString(1,od.getItem());
				ps.setInt(2, od.getPrice());
				i=ps.executeUpdate();
				
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			return i;
	}

	@Override
	public void removeitem(String item) {
		// TODO Auto-generated method stub
		String Delete="delete from Menu where name=?";
		 try {
			    Connection con=Db.connect();
			    PreparedStatement ps= con.prepareStatement(Delete);
			    ps.setString(1, item);
			    int i=ps.executeUpdate();
			    if(i>0) {
			    	System.out.println("Item Deleted");
			    }
			    }
			    catch(Exception e) {
			    	e.printStackTrace();
			    }
		
		
	}

	@Override
	public void displaymenu() {
		// TODO Auto-generated method stub
	    String Query="Select * from Menu";
	    try {
	    Connection con=Db.connect();
	    PreparedStatement ps= con.prepareStatement(Query);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()) {
	    	System.out.println(rs.getString(2)+" "+rs.getInt(3));
	    }
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
	
}

class Customer_imp implements Customer_dao{

	@Override
	public int addOrder(Customer_dto cd) {
		// TODO Auto-generated method stub
		String Insert ="Insert into orders values(?,?)";
		int count=0;
		try 
		{
			Connection con=Db.connect();
			PreparedStatement ps= con.prepareStatement(Insert);
			ps.setString(1, cd.getItem());
			ps.setInt(2, cd.getQuant());
			int i=ps.executeUpdate();
			count+=i;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}

	
	@Override
	public void editOrder() {
	// TODO Auto-generated method stub
		String Remove="delete from orders where item=?";
		try {
			Connection con=Db.connect();
			PreparedStatement ps= con.prepareStatement(Remove);
			ps.setString(1,"");
			int i=ps.executeUpdate();
			if(i>0)
				System.out.println("Item deleted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void bill() {
		// TODO Auto-generated method stub
		String query="select sum(price*quant) as bill from Menu inner join orders on Menu.item=orders.item";
		try {
			Connection con=Db.connect();
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println("Total amount to be paid "+rs.getInt(1));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}






public class Main_dao_imp   {

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("First wife Anusha Hotel");
		System.out.println("Welcome Owner");
		
		//Insertion of Menu
		System.out.println("Enter how many items you want to add:");
		int n=s.nextInt();
		String item;
		int price;
		int count=0;
		Owner_imp oi = new Owner_imp();
		for(int i=0;i<n;i++) {
			s.nextLine();
			System.out.println("Enter item :");
			item=s.nextLine();
			System.out.println("Enter price");
			price=s.nextInt();
			s.nextLine();
			Owner_dto od1=new Owner_dto(item,price);
			count+=oi.addItem(od1);
		}
		System.out.println("Inserted record "+count);
		
		
		//displaying Menu
		oi.displaymenu();
	    
		//removing Data from Menu
//		System.out.println("Enter the item you want to remove :");
//		item=s.nextLine();
//		oi.removeitem(item);
	  
		Customer_dto cd=new Customer_dto("poori",2);
		Customer_imp ci=new Customer_imp();
		ci.addOrder(cd);
	  
	}

	
}
