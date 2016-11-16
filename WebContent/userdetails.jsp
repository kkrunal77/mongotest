<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
   
        <title>User-SignUp</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" type="text/css" href="/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.css">
<script type='text/javascript' src='js/jquery.js'></script>
<script type='text/javascript' src='js/jquery-ui.js'></script>
<script type="text/javascript" src="WebContent/bootstrap.js"></script>

    
<script>
$(document).ready(function() {
   $( "#datepicker" ).datepicker({
	changeMonth: true,
      changeYear: true,
	yearRange: '1900:2020'
});
});

</script>
    </head>
    
    
    
    <body style="font-family: 'Montserrat', sans-serif;">
    
    
        <form action="userdetails">
        <input type='hidden' name='uname' value='<%= request.getParameter("uname") %>' />
        <input type='hidden' name='upass' value='<%= request.getParameter("upass") %>' />
        <input type='hidden' name='dbport' value='<%= request.getParameter("dbport") %>' />
        <input type='hidden' name='dbname' value='<%= request.getParameter("dbname") %>' />
     
                <h1 style="text-align:center">User Registration Form</h1>
                <table class="table table-striped table-bordered" style="width:60%;margin-left:20%">
                    <tr>
                        <td>
                            <b>First Name:</b>
                        </td
                        >
                        <td>
                            <input class="form-control" type="text" name="fname">
                        </td>
                    </tr>
                    
                     <tr>
                        <td>
                            <b>Middle Name:</b>
                        </td>
                        <td>
                            <input class="form-control" type="text" name="mname">
                        </td>
                    </tr>
                    
                     <tr>
                        <td>
                            <b>Last Name:</b>
                        </td>
                        <td>
                            <input class="form-control" type="text" name="lname">
                        </td>
                    </tr>
                    
                     <tr>
                        <td>
                            <b>Gurdian/paerent Name:</b>
                        </td>
                        <td>
                            <input class="form-control" type="text" name="gname">
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            <b>Gender:</b>                       
                        </td>
                                        
                        <td>
                           <select class="form-control" name="gender">
                              <option value="Male">Male</option>
                              <option value="Female">Female</option>
                              <option value="Others">Others</option>
                             
                            </select>
                        </td>
                    </tr>
                     
                    <tr>
                        <td>
                            <b>D.O.B</b>
                        </td>
                        <td>
                        <input class="form-control" type='text' name='datepicker' id='datepicker'>
                           
                                                   
                        </td>
                    </tr>
                    <tr>
                         <td>
                            <b>ID Proof:</b>                       
                        </td>
                                    
                        <td>
                        
                           <select class="form-control" name="id">
                              <option value="voterid">voter_id</option>
                              <option value="aadharcard">Aadharcard</option>
                              <option value="Pancard">Pancard</option>
                              <option value="Passport">Passport</option>                                          
                            </select>
                            
                             <input class="form-control" type="text" name="idno">
                            
                        </td>
                   <tr>   
                                     
                   <tr>
                        <td>
                         <b> Disease: </b>
                        </td> 
                        <td>
                         <input class="form-control" type="text" name="disease">
                        </td>
                   </tr>  
                   
                    <tr>
                        <td>
                         <b> Treatment: </b>
                        </td> 
                        <td>
                         <input class="form-control" type="text" name="treatment">
                        </td>
                   </tr>  
                   
                   <tr>
                        <td>
                         <b> Address: </b>
                        </td> 
                        <td>
                         <input class="form-control" type="text" name="address">
                        </td>
                   </tr> 
                                                          
                   <tr>
                        <td>
                         <b> City: </b>
                        </td> 
                        <td>
                         <input class="form-control" type="text" name="city">
                        </td>
                   </tr> 
                   
                      
                   <tr>
                        <td>
                         <b> State: </b>
                        </td> 
                        <td>
                         <input class="form-control" type="text" name="state">
                        </td>
                   </tr> 
                   
                      
                   <tr>
                        <td>
                         <b> Country: </b>
                        </td> 
                        <td>
                         <input class="form-control" type="text" name="country">
                        </td>
                   </tr> 
                   
                      
                   <tr>
                        <td>
                         <b> Pincode: </b>
                        </td> 
                        <td>
                         <input class="form-control" type="text" name="pincode">
                        </td>
                   </tr> 
                   
                  
                    <tr>
                        <td>
                            <b>Email-ID:</b>
                        </td>
                        <td>
                            <input class="form-control" type="text" name="uemail">
                        </td> 
                    </tr>
                   
                    
                    <tr>
                        <td>
                            <b>Phone No:</b>
                        </td>
                        <td>
                            <input class="form-control" type="text" name="uphone">
                        </td>
                    </tr>
                   
                    
                            
                 
     </table> 
     <center><input class="btn btn-sm btn-info" type="submit" value="SignUp">
                             <input class="btn btn-sm btn-info" type="reset" value="Reset"></center>
                       
      
  
   </form> 
</body>

</html>