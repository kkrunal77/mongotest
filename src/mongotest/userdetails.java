package mongotest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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

public class userdetails extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
        String mname = request.getParameter("mname");
        String lname = request.getParameter("lname");
        String gname = request.getParameter("gname");
        String gender = request.getParameter("gender");
       
        String bod = request.getParameter("datepicker");
        String id = request.getParameter("id");
       
        String idno = request.getParameter("idno");
        String disease = request.getParameter("disease");
        String treatment = request.getParameter("treatment");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String pincode = request.getParameter("pincode");
        String uemail = request.getParameter("uemail");
        String uphone = request.getParameter("uphone");   
        
        String uname = request.getParameter("uname");  
        String upass = request.getParameter("upass");  
        String dbport = request.getParameter("dbport");  
        String dbname = request.getParameter("dbname");  
        PrintWriter out = response.getWriter();
        //java.util.Date date= new java.util.Date();
        //String str timestamp= new Timestamp(date.getTime());
        
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
        String timestamp  = dateFormat.format(new Date());
        
        
       // PrintWriter out = response.getWriter();
        String userD = "{'fname' : '"+fname+"','mname' : '"+mname+"','lname' : '"+lname+"', 'gname' : '"+gname+"', 'gender' : '"+gender+"','BOD':'"+bod+"','id':'"+id+"',"
        		+ " 'idno':'"+idno+"', 'Disease' : '"+disease+"', 'Treatment' : '"+treatment+"', "
        		+ " 'address':'"+address+"', 'city':'"+city+"', 'state':'"+state+"', 'country':'"+country+"', "
        				+ "'pincode':'"+pincode+"', 'uemail':'"+uemail+"', 'uphone':'"+uphone+"', 'timestamp':'"+timestamp+"'}";
        
        try{
        	 //String test1 = "mongodb://h1_db:h1_db@ds064628.mlab.com:64628/h1_db";
        	 //mongodb://h1_db:h1_db@ds064628.mlab.com:64628/h1_db
			 // connect to mongoDB, IP and port number 
        	 String url ="mongodb://"+uname+":"+upass+"@ds0"+dbport+".mlab.com:"+dbport+"/"+dbname;
        	 out.println(url + "<br>");
        	 
			// MongoClientURI uri = new MongoClientURI("mongodb://krunal:krunal@ds040898.mlab.com:40898/h1_db"); 
			 // MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/h1_db"); 
        	 MongoClientURI uri = new MongoClientURI(url);
             out.println("3<br>");
  		     MongoClient client = new MongoClient(uri);
  		     out.println("4<br>");
  	         DB db = client.getDB(uri.getDatabase());	
  	         out.println("5<br>");
  		  // get a single collection  
						 
		     		
			  // get a single collection  
			DBCollection collection = db.getCollection("test1");  
			DBObject dbObject = (DBObject)JSON.parse(userD);
			 collection.insert(dbObject); 
			 out.println("DB Connected "+ "<br>");
      
        	//String test2 = "mongodb://shareddb:shareddb@ds064188.mlab.com:64188/shareddb";
			 // connect to mongoDB, IP and port number  
        	//MongoClientURI uri1 = new MongoClientURI("mongodb://localhost:27017/db1"); 
        	//MongoClientURI uri1  = new MongoClientURI(test2);
			 String userD1 = "{'id':'"+id+"', 'idno':'"+idno+"', 'Hospital Name' : '"+dbname+"',  'Disease' : '"+disease+"', 'Treatment' : '"+treatment+"', 'address':'"+address+"', 'timestamp':'"+timestamp+"'}";
			
			 MongoClientURI uri1 = new MongoClientURI("mongodb://krunal:krunal@ds062818.mlab.com:62818/shared_db"); 			

			// MongoClientURI uri1 = new MongoClientURI("mongodb://shared_db:FPFukjXjApNtHd3h_JSUkzLibFnfWzmDRhnG6lzQXwQ-@ds062818.mlab.com:62818/shared_db"); 			
			//MongoClientURI uri1 = new MongoClientURI("mongodb://localhost:27017/shared"); 			
 
			 MongoClient client1 = new MongoClient(uri1);
			 
			 out.println("DB Connected to Shared DB <br>");
			 /*
			   MongoClient client = new MongoClient(uri);
		     DB db = client.getDB(uri.getDatabase());		
			  // get a single collection  
			DBCollection collection = db.getCollection("test1");  
			DBObject dbObject = (DBObject)JSON.parse(userD);
			 collection.insert(dbObject);
			  */

		     DB db1 = client1.getDB(uri1.getDatabase());	
		     out.println("1<br>");
			  // get a single collection  
			DBCollection collection1 = db1.getCollection("test2");
		     out.println("2<br>");

			DBObject dbObject1 = (DBObject)JSON.parse(userD1);
		     out.println("3<br>");

			 collection1.insert(dbObject1); 
		     out.println("4<br>");

			 out.println("DB Record inserted to Shared DB");
			 request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        catch (MongoException e) {  
			   e.printStackTrace();  
			}  
       
        
	}

}
