<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</head>
<body>

<h3 align="center">Searching Patient Records</h3>

<div style="margin-top: 100px;" align="center">
   <form action="patientdetails">
   <table class="table table-bordered table-striped" style="width:60%">
   <tr><td>
                        
                           <select class="form-control" name="id">
                              <option value="voterid">voter_id</option>
                              <option value="aadharcard">Aadharcard</option>
                              <option value="Pancard">Pancard</option>
                              <option value="Passport">Passport</option>                                          
                            </select>
                            </td>
                          <td>  
                             <input class="form-control" type="text" name="idno" value="" required/>
                            
                        </td>
                          
                            
                        </tr>
   </table>
   <center><input class="btn btn-sm btn-info" type="submit" value="SignUp">
                             <input class="btn btn-sm btn-info" type="reset" value="Reset"></center>
   
   
	
    </form>
    <div style="color:red;font-size:x-large;">
     <%if(request.getAttribute("errorMessage")==null)
                	   {
                	   out.println("");
                	   }
                	  else
                	  {
                 	  out.println(request.getAttribute("errorMessage"));                         
                	  }%>
   <%-- <h2 style="color:red;"> <%=request.getAttribute("errorMessage") %></h2> --%>
    </div>
    </div>


</body>
</html>