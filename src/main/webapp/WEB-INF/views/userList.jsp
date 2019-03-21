<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户列表</title>
	</head>
	<body>
			用户列表：
			<table width="100%" border=1>
				<tr>
					<td>用户名称</td>
					<td>用户性别</td>
					<td>用户生日</td>
					<td>用户地址</td>
				</tr>
				<c:forEach items="${userList}" var="user">
					<tr>
						<td>${user.username}</td>
						<td>${user.sex}</td>
						<td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<td>${user.address}</td>
					</tr>
				</c:forEach>
			</table>
	</body>

</html>