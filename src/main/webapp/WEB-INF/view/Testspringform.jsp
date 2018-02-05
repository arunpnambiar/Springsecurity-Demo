<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">		
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>		
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>User Entry</title>

</head>
<body>
		<div style="width:100%;margin-top:50px">
			<form:form action="logout" style="text-align:right;margin-right: 10px;"><button type="submit">Logout</button>
			</form:form>
		</div>
		
<div id="build-wrap" style="width: 75%;padding-left: 120px; align-content: center;">
	<form:form modelAttribute="student" action="testspringform1">		
		<div class="rendered-form" style="padding-left:5%;">
			<div class="fb-text form-group field-firstname">
				<form:label path="Firstname" class="fb-text-label">Firstname</form:label>
				<form:input path="firstname" class="form-control" />
			</div>
			<div class="fb-text form-group field-middlename">
				<form:label path="Middlename" class="fb-text-label">Middlename</form:label>
				<form:input class="form-control" path="middlename" />
			</div>
			<div class="fb-text form-group field-lastname">
				<form:label path="lastname" class="fb-text-label">Lastname</form:label>
				<form:input class="form-control" path="lastname" />
			</div>
			<div class="fb-text form-group field-email">
				<form:label path="email" class="fb-text-label">Email</form:label>
				<form:input class="form-control" path="email" />
			</div>
			<div class="fb-text form-group field-phonenumber">
				<form:label path="phoneno" class="fb-text-label"/>
				<form:input class="form-control" path="phoneno" />
			</div>
			
			<div class="fb-button form-group field-submit">
				<button type="submit" class="btn btn-success" name="submit" id="RegisterSubmit" style=""
					id="submit">Submit</button> &nbsp;&nbsp;&nbsp;
				
			</div>
		</div>
	</form:form>
</div>
</body>
</html>