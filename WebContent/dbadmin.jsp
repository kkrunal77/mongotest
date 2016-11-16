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
 <head>
        <title>User-SignUp</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body bgcolor="#F0F8FE">
        <form action="dbadmin">
        
         <center>
                <h1>Admin Form</h1>
                <table class="table table-striped table-bordered"  style="width:50%">
                    <tr>
                        <td>
                            <b>Hospital Name:</b>
                        </td
                        >
                        <td>
                            <input class="form-control" type="text" name="hname" required>
                        </td>
                    </tr>
                    
                     <tr>
                        <td>
                            <b>User Name:</b>
                        </td>
                        <td>
                            <input class="form-control" type="text" name="uname" required>
                        </td>
                   
                                      
                    
                         
                   <tr>
                        <td>
                         <b>User Password: </b>
                        </td> 
                        <td>
                         <input class="form-control" type="text" name="upass" required>
                        </td>
                   </tr> 
                   
                      
                   <tr>
                        <td>
                         <b> Port: </b>
                        </td> 
                        <td>
                         <input class="form-control" type="text" name="port" required>
                        </td>
                   </tr> 
                   
                     
                </table>
                
                            <input class="btn btn-sm btn-info" type="submit" value="Register">
                            
                             <input class="btn btn-sm btn-info" type="reset" value="Reset">
                        
                </center>
                
    </form>
    </body>    

</body>
</html>