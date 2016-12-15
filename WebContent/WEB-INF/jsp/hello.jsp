<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello World!

	<form action="/SpringMVCRestful/mvc/upload" method="post"
		enctype="multipart/form-data">
		<input type="file" name="file"><br> <input type="submit"
			value="submit">
	</form>

	<form action="/SpringMVCRestful/rest/user/1" method="post">
		<input type="hidden" name="_method" value="PUT"> <input
			type="submit" value="put">
	</form>

	<form action="/SpringMVCRestful/rest/user/1" method="post">
		<input type="submit" value="post">
	</form>

	<form action="/SpringMVCRestful/rest/user/1" method="get">
		<input type="submit" value="get">
	</form>

	<form action="/SpringMVCRestful/rest/user/1" method="post">
		<input type="hidden" name="_method" value="DELETE"> <input
			type="submit" value="delete">
	</form>
	
	<form action="/SpringMVCRestful/form/add" method="post" modelAttribute="user">
        id:<input path="id"/><errors path="id"/><br>
        name:<input path="name"/><errors path="name"/><br>
        birth:<input path="birth"/><errors path="birth"/>
        <input type="submit" value="submit">
    </form> 
</body>
</html>