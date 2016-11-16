package mongotest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

public class hospitalregistration  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hname = request.getParameter("hname");
        String hadd = request.getParameter("hadd");
      
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String pincode = request.getParameter("pincode");
        String hemail = request.getParameter("hemail");
        String hphone = request.getParameter("hphone"); 
        PrintWriter out = response.getWriter();
		   
       // PrintWriter out = response.getWriter();
        String userD = "{'Hospital Name' : '"+hname+"','Address of Hospital' : '"+hadd+"', 'city':'"+city+"', 'state':'"+state+"', 'country':'"+country+"', 'pincode':'"+pincode+"', 'uemail':'"+hemail+"', 'uphone':'"+hphone+"'}";
        try{
        	//tring test1 = "mongodb://admin:admin@ds028679.mlab.com:28679/admin1";
        	//String test1 = "mongodb://localhost:27017/db";
        	String test1 = "mongodb://krunal:krunal@ds062178.mlab.com:62178/user_admin";
			 // connect to mongoDB, IP and port number  	 
			MongoClientURI uri  = new MongoClientURI(test1);
			//MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/db"); 
			 MongoClient client = new MongoClient(uri);
		     DB db = client.getDB(uri.getDatabase());		
			  // get a single collection  
			DBCollection collection = db.getCollection("ADMIN");  
			DBObject dbObject = (DBObject)JSON.parse(userD);
			 collection.insert(dbObject);  
			 
			request.getRequestDispatcher("/index.jsp").forward(request, response);
           
        }
        catch (MongoException e) {  
			   e.printStackTrace();  
			}  
       
        
	}

}
