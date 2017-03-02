package com.srk.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MsgReader msgReader;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setIntHeader("Refresh", 1);
		PrintWriter out = response.getWriter();
		String result;
		try {
			msgReader =  MsgReader.getInstance();	
			double temp_val = msgReader.omsg.get_tempval()/100.0;
			double temp_val1 = msgReader.omsg.get_R1_tempval()/100.0;
			int nodeId = msgReader.omsg.get_node_id();
			int nodeId_R1 = msgReader.omsg.getElement_Des_id(0);
			int nodeId_R2 = msgReader.omsg.getElement_Des_id(1);
			
			//int i = 1;
			if(temp_val>0 && nodeId == 1 ){
				out.println(" <table style=width:100%>");
				out.println("  <tr>");
				out.println("<td>"+ nodeId +"</td>");
			    out.print("<td>" + temp_val + "</td>");
			    out.print("<td>" + nodeId_R1 + "</td>");
			    out.print("<td>" + nodeId_R2 + "</td>");
			 //   out.print("<td>" + msgReader.omsg.get_R1_node_id() + "</td>");
			    out.print("<td>" + temp_val1 + "</td>");
			    out.println("</tr>"); 
			    out.println("</table>");
	
			/* try { 
				 //	String url = "http://192.168.112.153:8081/MyServlet/?Temp=3";
				 	String url = "http://localhost:8085/Web2210_2/MyServlet1?Temp=3"; // yaha se value toh ja rahi ahi 3
		            URL siteURL = new URL(url);
		            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
		            connection.setRequestMethod("GET");
		            connection.connect();
		            		 
		            int code = connection.getResponseCode();
		            if (code == 200) {
		                result = "Green";
		            }
		        } catch (Exception e) {
		            result = "->Red<-";
		        } */
			}
					
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			out.close();/* Close the output stream */
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
