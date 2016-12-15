<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${p.name}<br>
	${p.age }
	
	<script src="/SpringMVCRestful/static/js/jquery/jquery-1.11.3.min.js"></script>
	<script>
		$(function(){
            $.post("/SpringMVCRestful/mvc/getPerson",{name:"test"},function(data){
                alert(data);
            });
	    });
	</script>
</body>
</html>