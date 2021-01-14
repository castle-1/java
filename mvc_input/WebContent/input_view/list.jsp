<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <jsp:useBean id="dto" class="emp.input.dao.EmpDAO"/>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<h1>EMP TABLE 직원 목록</h1>
	<table border="1">
		<tr>
			<td align="center">사원번호 </td>
			<td align="center">사원이름 </td>
			<td align="center">직급(업무) </td>
			<td align="center">상사(이름) </td>
			<td align="center">입사일 </td>
			<td align="center">급여 </td>
			<td align="center">커미션 </td>
			<td align="center">부서번호 </td>
			<td align="center">부서이름 </td>
			<td align="center">부서위치 </td>
			<td align="center">관리 </td>
		</tr>
		<c:forEach items= "${dto.empJoindept() }" var="dtos">
		<tr>
			<td> ${dtos.empno }</td>
			<td> ${dtos.ename }</td>
			<td> ${dtos.job }</td>
			<td> ${dtos.mgr }</td>
			<td> ${dtos.hiredate }</td>
			<td> ${dtos.sal }</td>
			<td> ${dtos.comm }</td>
			<td> ${dtos.deptno }</td>
			<td> ${dtos.dname }</td>
			<td> ${dtos.loc }</td>
			<td> <a href="#">수정</a></td>
		</tr>
		</c:forEach>
	</table>
	<a href="inputInform.do">돌아가기</a>
	
	
	
</body>
</html>