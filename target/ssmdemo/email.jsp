<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>发送邮件</title>
	</head>
	<body>
		<form action="/ssm/sendEmail" method="get">
			<p>发送到：</p><input type="text" style="width:400px" name="toUser">
			<p>主题：</p><input type="text" style="width:400px" name="title">
			<p>内容：</p>
<%--			<input type="text" style="height:51px;width:449px">--%>
			<textarea rows="10" cols="100" name="sendContent"></textarea>
			</br>
			<input type="submit" value="发送邮件">
		</form>

	</body>
</html>