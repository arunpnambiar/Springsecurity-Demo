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
<title>Final Analysys and Verification</title>

</head>
<body>
<div>
		<div style="width:100%;margin-top:50px">
			<form:form action="logout" style="text-align:right;margin-right: 10px;"><button type="submit">Logout</button>
			</form:form>
		</div>
		<% if(session.getAttribute("success") != null){%>
			<div class="alert alert-danger col-xs-offset-1 col-xs-10" 
			style=" width: 654px;  margin-left: 348px; text-align:center; ">
			Saved details successfully.</div>
		<%}%>
		 <div id="loginbox" style="margin-left: 335px;"
			class="mainbox col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">
			<div class="panel panel-info" style="width: 650px;">
				<div class="panel-heading">
					<div class="panel-title">Final Analysys and Verification</div>
				</div>
<div id="build-wrap" style="width: 75%;padding-left: 120px; align-content: center;">
	<form:form id="myForm" action="adminregister">
		<div class="rendered-form" style="padding-left:5%;">
			<div class="fb-text form-group field-firstname">
				<label for="firstname" class="fb-text-label">First Name</label><input
					type="text" class="form-control" name="firstname" id="firstname">
			</div>
			<div class="fb-text form-group field-middlename">
				<label for="middlename" class="fb-text-label">Middle Name</label><input
					type="text" class="form-control" name="middlename" id="middlename">
			</div>
			<div class="fb-text form-group field-lastname">
				<label for="lastname" class="fb-text-label">Last Name</label><input
					type="text" class="form-control" name="lastname" id="lastname">
			</div>
			<div class="fb-text form-group field-email">
				<label for="email" class="fb-text-label">Email</label><input
					type="text" class="form-control" name="email" id="email">
			</div>
			<div class="fb-text form-group field-phonenumber">
				<label for="phonenumber" class="fb-text-label">Phone Number</label><input
					type="text" class="form-control" name="phonenumber"
					id="phonenumber">
			</div>
			<!-- <div class="fb-text form-group field-amount">
				<label for="amount" class="fb-text-label">Amount</label><input
					type="text" class="form-control" name="amount" id="amount">
			</div> -->
			<div class="fb-button form-group field-submit">
				<button type="submit" class="btn btn-success" name="submit" id="RegisterSubmit" style=""
					id="submit">Submit</button> &nbsp;&nbsp;&nbsp;
				<input type="button" name="Next" value="Back" tabindex="18"
					class="btn btn-success" onclick="location.href='/DataManagementSystem/'" />
			</div>
			</div>
			</div>
		</div>
		</div>
	</form:form>
	</div>
</body>
</html>
<%session.removeAttribute("success");%>