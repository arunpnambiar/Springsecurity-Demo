<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!doctype html>
<html lang="en">

<head>
	
	<title>Login Page</title>
	<meta charset="utf-8">
	 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

</head>
<body>
	<div>
		<div style="width:100%;margin-top:50px">
			<form:form action="logout" style="text-align:right;margin-right: 10px;"><button type="submit">Logout</button>
			</form:form>
		</div>
		 <div id="loginbox" style="margin-top:110px;margin-left:490px;"
			class="mainbox col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Home</div>
				</div>
					<div style="padding-top: 30px" class="panel-body">
						<h3><a href="/DataManagementSystem/userPage">User Page</a></h3><b>
						<h3><a href="/DataManagementSystem/qaPage">QA Page</a></h3><b>
						<h3><a href="/DataManagementSystem/adminPage">Admin Page</a></h3><b>
						
					</div>	
				</div>
			</div>
		</div>

</b></b></b>

</body>
</html>
