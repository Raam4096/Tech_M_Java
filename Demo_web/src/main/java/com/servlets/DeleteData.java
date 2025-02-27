package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class DeleteData
 */
@WebServlet("/DeleteData")
public class DeleteData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=
		// TODO Auto-generated method stub
		try {
			Connection cons=Dbconnection.connect();
			String id=request.getParameter("username");
			String query="delete from demo where name=?";
			PreparedStatement ps=cons.prepareStatement(query);
			ps.setString(1, id);
			
			int rs=ps.executeUpdate();
		    if(rs>0) {
		    	pw.write();
		    }
		    else {
		    	response.setContentType("text/html");
		    	pw.print("invalid credentials");
		    	RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		    	rd.include(request, response);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
