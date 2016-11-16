package mongotest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    /**
     * Default constructor. 
     */
    public login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// reading the user input
		    String dbname = request.getParameter("dbname");
		    String uname = request.getParameter("uname");
		    String upass = request.getParameter("upass");
		    String dbport = request.getParameter("dbport");
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		   
		    // var url = 'mongodb://kalariya77:kalariya77@ds056288.mongolab.com:56288/shred';
		   
		  
		    // destroy(request, response, uname, upass, dbport,dbname );
		    String url ="mongodb://krunal:krunal@ds062178.mlab.com:62178/user_admin";
		    out.println("DB connected");
		   // MongoClientURI uri  = new MongoClientURI(url);
		    
		    out.println("1...");
		   // String userD = "{'id':'"+uname+"', 'idno':'"+upass+"', 'dbname':'"+dbname+"', 'port':'"+dbport+"'}";
		    out.println("2...");
		    
		       //MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/db");
		       MongoClientURI uri = new MongoClientURI(url);
		       out.println("3...");
			   MongoClient client = new MongoClient(uri);
			   out.println("4...");
		       DB db = client.getDB(uri.getDatabase());	
		       out.println("5...");
			  // get a single collection  
			   DBCollection collection = db.getCollection("userdetails");  
			  // DBObject dbObject = (DBObject)JSON.parse(userD);
			  // collection.insert(dbObject);  
		   
		/*
		    
			// out.println("krunal");
		    // destroy(request, response, uname, upass, dbport,dbname );
			// get a single collection  
			 DBCollection collection = db.getCollection("userDetails"); 
			 DBCollection collection = db.getCollectionDBObject dbObject1 = (DBObject)JSON.parse(userD1);
			 DBObject dbObject1 = (DBObject)JSON.parse(userD1);
		*/
			

			
			 
			 
			BasicDBObject searchQuery = new BasicDBObject();
			 
			     searchQuery.put("Hospital Name", dbname);
			     searchQuery.put("uname", uname);
			     searchQuery.put("upass", upass);
			     searchQuery.put("dbport", dbport);
			 
			     out.println("Serching Record in DB");
			 //DBCursor cursor = collection.find(searchQuery);
			     DBCursor cursor = collection.find(searchQuery);
			   out.println("6...");
			   
				RequestDispatcher rd = null;

			  
				
			  
			  if (cursor.hasNext()) {
				 
				     RequestDispatcher requestDispatcher = request.getRequestDispatcher("/userdetails.jsp?uname="+uname+"&upass="+upass+"&dbport="+dbport+"&dbname="+dbname);
			        try {
						requestDispatcher.forward(request, response);
					    } catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					    } catch (IOException e) {   
						// TODO Auto-generated catch block
						e.printStackTrace();
					    }
			            out.println("8<br>");
				  		
			          }
			 else { 	
				      //out.println("username an password invalid");
				 
				      //request.setAttribute("class", "class='error'");
				 
				 request.setAttribute("errorMessage", "Login Information is invalid");
				 request.getRequestDispatcher("/login.jsp").forward(request, response);
				 
				   // rd = request.getRequestDispatcher("/login.jsp");
				    //out.println("<b>Invalid Login Info.</b><br>");
					//rd.include(request, response);
			     
				      //out.println("<script type=\"text/javascript\">");  
						// out.println("alert('the session did time out, please reconnect');");  
						 //out.println("alert();");
						 //out.println("</script>");
			         //out.println("Record not found");
				// PrintWriter out1 = response.getWriter();
				// out1.println("<script>alert();</script>");
			        		         
				// out.println("<b>Invalid Login Info.</b><br>"); 
				// rd = request.getRequestDispatcher("/LoginInfo.jsp"); 
				 //rd.include(request, response);

				
			      }
			  
			  
		}
		
 //doPost(request, response);
	     
		  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub

  
};



}

