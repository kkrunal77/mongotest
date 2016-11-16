package mongotest;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.util.JSON;



public class patientdetails extends HttpServlet {
	
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		// reading the user input
        String id = request.getParameter("id");
        String idno = request.getParameter("idno");
        
         MongoClientURI uri = new MongoClientURI("mongodb://krunal:krunal@ds062818.mlab.com:62818/shared_db"); 
		   MongoClient client = new MongoClient(uri);
	       DB db = client.getDB(uri.getDatabase());		
		  // get a single collection  
		   DBCollection collection = db.getCollection("test2"); 
		   
		   BasicDBObject searchQuery = new BasicDBObject();
			 
			 searchQuery.put("id", id);
			 searchQuery.put("idno", idno);
			 
			 DBCursor cursor = collection.find(searchQuery);
			 
			 if (cursor.hasNext()) {
				 int i=0;
				 out.print("<h1> PATIENT DETAILS </h1> <br/>");
				 while(cursor.hasNext())
		         {
					    i = i+1;
					    DBObject theObj = cursor.next();
					    //out.print("<span class=\"myspan\">This is a sample string</span>"+i+" ,<br/>");
					    //out.print("<font color='blue'> PATIENT :"+i+" ,<br/>");
					   
					    out.print("<font color='blue'> Detail :" +i+" ,<br/>");
					    out.print("<font color='black'>_id : "+theObj.get("_id")+" ,<br/>");
					    out.print("id : "+theObj.get("id")+" ,<br/>");					    
					    out.print("IDNO : "+theObj.get("idno")+" ,<br/>");
					    out.print("Hospital Name : "+theObj.get("Hospital Name")+" ,<br/>");
					    out.print("Disease : "+theObj.get("Disease")+" ,<br/>");
					    out.print("Treatment : "+theObj.get("Treatment")+" ,<br/>");
					    out.print("address : "+theObj.get("address")+" ,<br/>");
					    out.print("timestamp : "+theObj.get("timestamp")+"<br/><br/>");
					    
					    
					    
					    				 
			      }			 
			 }
			 
			 else { 		 
			      //out.println("username an password invalid");
			      request.setAttribute("errorMessage", "ID invalid");
			      request.getRequestDispatcher("/patientdetails.jsp").forward(request, response);
		         //out.println("Record not found");
		         
		         
		      }
		   
			 
		 
	}

	private static void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		
	}
}