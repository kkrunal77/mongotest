<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

<script type=text/javascript>
/*
$(document).ready(function(){
	$('h2').hide();	
})

function alert(){
	$('h2').show();	
}
*/
</script>
</head>
<body>
<script type="text/javascript">
$(document).ready(function(){
	$('div').children().eq('2').style({'color':'red'});
	
});
	
</script>
<h3 align="center">Ubiquitous Data Accessing Method for Hospitals</h3>

<div style="margin-top: 100px;" align="center">
   <form  name='loginpage'  action="loginpage" method="get" >
   <table class="table table-boredered" style="width:50%">
   <tr><td>DB Name * </td><td>:</td><td><input class="form-control" type="text" name="dbname" id='dbname' value="" required/></td></tr>
   <tr><td>Username * </td><td>:</td><td><input class="form-control" type="text" name="uname" id='uname' value="" required/></td></tr>
   <tr><td>Password * </td><td>:</td><td><input class="form-control" type="password" name="upass" id='upass' value="" required/></td></tr>
   <tr><td>DB Port * </td><td>:</td><td><input class="form-control" type="text" name="dbport" id='dbport' value="" required/></td></tr>
   
  
   </table>
   <center><input type="submit" class="btn btn-sm btn-info" value="Login"/></center>
    </form>
        <p id="demo"></p>
    <div style="color:red;font-size:x-large;">
                   <%if(request.getAttribute("errorMessage")==null)
                	   {
                	   out.println("");
                	   }
                	  else
                	  {
                 	  out.println(request.getAttribute("errorMessage"));                         
                	  }%>
                  <%--  <h2 style="color:red;"> <%=request.getAttribute("errorMessage")%>
                   </h2> --%>
    </div> 
    </div>
</body>
</html>