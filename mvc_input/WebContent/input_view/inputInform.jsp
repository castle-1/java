<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="dto" class="emp.input.dao.EmpDAO"/>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="success.do" method="post">
	<h1 align="center"> 사원 정보 입력</h1>
	<hr/>
	사원번호 : <input type="text" name="empno"> <br>
	사원이름 : <input type="text" name="ename"> <br>
	사원직급 : <input type="text" name="job"> <br>
	
	매니저 : <select name="mgr">
	<c:forEach items="${dto.managerSelect() }" var="dtos">
			<option value="${dtos.empno }">(${dtos.empno })${dtos.ename } </option>
			</c:forEach>				
			</select> <br>
	입사일 : <input type="date" name="hiredate"> <br>
	급여 : <input type="text" name="sal"> <br>
	커미션 : <input type="text" name="comm"> <br>
	부서 : <select name="deptno">
	<c:forEach items="${dto.deptSelect() }" var="dtos">
			<option value="${dtos.ddeptno }">(${dtos.ddeptno })${dtos.dname } </option>
			</c:forEach>
			
		</select><br>
		
	<input  type="submit" value="입력">
	
	</form>

</body>
</html>