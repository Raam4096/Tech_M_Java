package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
@WebServlet("/Udisplaydata")

public class Udisplaydata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Udisplaydata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		try {
			Connection cons=Dbconnection.connect();
			String query="select * from demo";
			PreparedStatement ps=cons.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			pw.print("<table border=4 width=70px>");
			pw.print("<tr>");
			pw.print("<th>User name</th>");
			pw.print("<th>email</th>");
			pw.print("<th>mobile</th>");
			pw.print("<th>gender</th>");
			pw.print("<th>Edit</th>");
			pw.print("<th>Delete</th>");
			pw.print("</tr>");
			while(rs.next()) {
				pw.print("<tr>");
				pw.print("<td>"+rs.getString(1)+"</td>");
				pw.print("<td>"+rs.getString(3)+"</td>");
				pw.print("<td>"+rs.getString(4)+"</td>");
				pw.print("<td>"+rs.getString(5)+"</td>");
				pw.print("<td>"+"<a href='editData'>Edit</a>"+"</td>");
				pw.print("<td><a href='DeleteData?username=" + rs.getString(1) + "'>Delete</a></td>");

				pw.print("</tr>");
			}
			pw.print("</table>");
			pw.print("<a href='index.html'>home</a>");
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}