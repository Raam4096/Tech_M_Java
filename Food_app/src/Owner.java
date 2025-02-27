import java.util.*;


import java.sql.*;

public class Owner {
	
	static int addMenu(String item,int price) throws Exception  {
		Connection con= Connect.con();	
		String s= "insert into Menu(item,price) values(?,?)";
		PreparedStatement p= con.prepareStatement(s);
		p.setString(1,item);
		p.setInt(2, price);
		int res=p.executeUpdate();
		return res;
	}
public static void main(String arg[]) throws Exception {
	Scanner s=new Scanner(System.in);
	System.out.println("Welocme Owner");
	String item;
	int price;
	System.out.println("How many items you want to add into menu");
	int count = s.nextInt();
	s.nextLine();
    
    System.out.println("Enter items");
    
    for(int i=0;i<count;i++){
    	System.out.println("enter item"+i+1+" name: ");
    	item=s.nextLine();
    	System.out.println("enter item "+item+" price: ");
    	price=s.nextInt();
    	int res=0;
    	res+=addMenu(item,price);
    	if(res>0) {
    		System.out.println("Inserted "+res+" Records");
    	}
    	
    }

}
}
