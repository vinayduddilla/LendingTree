<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Lending tree Registration</h1>
	<form action="/processRegistration">
	<p>
		Bank Name : <input type="text" name="bankName" />
	</p>
	<p>
		Bank ID : <input type="text"  name="bankIDname" id="bankID"/>
	</p>
	<p>
		Bank Branch : <input type="text"  name="bankBranch"/>
	</p>

	<div>
		<p>
			Bank Address : <br>
			<input type="text" name="street"  /> <br>
			<input type="text" name="city" /> <br>
			<input type="text" name="state"/> <br>
			<input type="text" name="zip" />]
		</p>
	</div>
	<input type=submit value="submit"/>
	</form>

</body>
</html>