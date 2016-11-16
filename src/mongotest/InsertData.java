package mongotest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
         String uname,upass,dbname,port ;
		 uname = "kalariya77";
		 upass = "kalariya77";
		 dbname = "shared";
		 port = "56288";
		 try { 
			 
				
			 String test1 = "mongodb://"+uname+":"+upass+"@ds0"+port+".mlab.com:56288/"+dbname;
			 // connect to mongoDB, IP and port number  	 
			// MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/db"); 
			MongoClientURI uri  = new MongoClientURI("mongodb://kalariya77:kalariya77@ds056288.mlab.com:56288/shred");
			 @SuppressWarnings("resource")                
			MongoClient client = new MongoClient(uri);
		     @SuppressWarnings("deprecation")
			DB db = client.getDB(uri.getDatabase());		
			  // get a single collection  
			DBCollection collection = db.getCollection("exp1");  
			  
			  // BasicDBObject example  
			  //System.out.println("BasicDBObject example...");  
			  BasicDBObject document = new BasicDBObject();  
			  document.put("database", "dineshonjavaDB");  
			  document.put("table", "employees");  
			  
			  BasicDBObject documentDetail = new BasicDBObject();  
			  documentDetail.put("empId", "10001");  
			  documentDetail.put("empName", "Dinesh");  
			  documentDetail.put("salary", "70000");  
			  document.put("detail", documentDetail);  
			  
			  collection.insert(document);  
			  
			  DBCursor cursorDoc = collection.find();  
			  while (cursorDoc.hasNext()) {  
			  System.out.println(cursorDoc.next());  
			  }  
			  
			  BasicDBObject document1 = new BasicDBObject();
			  document1.put("empId", "10001");
			  collection.remove(document1);  
			  
			  // BasicDBObjectBuilder example  
			  System.out.println("BasicDBObjectBuilder example...");  
			 BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start()  
			   .add("database", "dineshonjavaDB")  
			                        .add("table", "employees");  
			   
			BasicDBObjectBuilder documentBuilderDetail = BasicDBObjectBuilder.start()  
			                    .add("empId", "10001")  
			                    .add("empName", "Dinesh")  
			           .add("salary", "70000");  
			   
			 documentBuilder.add("detail", documentBuilderDetail.get());  
			   
			 collection.insert(documentBuilder.get());  
			   
			 DBCursor cursorDocBuilder = collection.find();  
			 while (cursorDocBuilder.hasNext()) {  
			  System.out.println(cursorDocBuilder.next());  
			 }  
			   
			 collection.remove(new BasicDBObject());  
			   
			 // Map example  
			 System.out.println("Map example...");  
			 Map<String, Object> documentMap = new HashMap<String, Object>();  
			 documentMap.put("database", "dineshonjavaDB");  
			 documentMap.put("table", "employees");  
			   
			 Map<String, Object> documentMapDetail = new HashMap<String, Object>();  
			 documentMapDetail.put("empId", "10001");  
			 documentMapDetail.put("empName", "Dinesh");  
			 documentMapDetail.put("salary", "70000");  
			   
			 documentMap.put("detail", documentMapDetail);  
			   
			 collection.insert(new BasicDBObject(documentMap));  
			   
			 DBCursor cursorDocMap = collection.find();  
			 while (cursorDocMap.hasNext()) {  
			  System.out.println(cursorDocMap.next());  
			 }  
			   
			 collection.remove(new BasicDBObject());  
			   
			 // JSON parse example  
			 System.out.println("JSON parse example...");  
			   
			 String json = "{'database' : 'dineshonjavaDB','table' : 'employees','empId' : 10001, 'empName' : 'Dinesh', 'salary' : '70000'}}}";  
			   
			 DBObject dbObject = (DBObject)JSON.parse(json);  
			   
			 collection.insert(dbObject);  
			  json = "{'database' : 'Krunal','table' : 'employees','empId' : 10010, 'empName' : 'Dinesh', 'salary' : '70000'}}}";  
					   
			   dbObject = (DBObject)JSON.parse(json);  
					   
			  collection.insert(dbObject); 
			   
	  	      BasicDBObject document2 = new BasicDBObject();
			  document2.put("empId", 10001);
			  collection.remove(document1); 
			 DBCursor cursorDocJSON = collection.find();  
			 while (cursorDocJSON.hasNext()) {  
			  System.out.println(cursorDocJSON.next());  
			 }  
			   
			 
			   
			 System.out.println("Done");  
			   
			} catch (MongoException e) {  
			   e.printStackTrace();  
			}  
			   
			}  
	}
	
		

