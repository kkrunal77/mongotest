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
import com.mongodb.util.JSON;

public class dbadmin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
        String hname = request.getParameter("hname");
        String uname = request.getParameter("uname");
        String upass = request.getParameter("upass");
        String port = request.getParameter("port");
        
        
        String userD = "{'Hospital Name':'"+hname+"', 'uname':'"+uname+"', 'upass' : '"+upass+"',  'dbport' : '"+port+"'}";

        MongoClientURI uri = new MongoClientURI("mongodb://krunal:krunal@ds062178.mlab.com:62178/user_admin");
            out.println("ADMIN DB Connected");
            
		    MongoClient client = new MongoClient(uri);
		    out.println("1..."); 
		    
	        DB db = client.getDB(uri.getDatabase());
		    out.println("2..."); 

		    // get a single collection
	        
		    DBCollection collection = db.getCollection("userdetails");
		    out.println("3..."); 

		    DBObject dbObject = (DBObject)JSON.parse(userD);  
		    out.println("4..."); 

		    collection.insert(dbObject);
			
			
			out.println("Object Inserted"); 
			request.getRequestDispatcher("/index.jsp").forward(request, response);
   

}
}

