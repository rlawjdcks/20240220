<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${param.num == 1}">
num은 1입니다.<br>
</c:when>
<c:when test="${param.num == 2}">
num은 2입니다.<br>
</c:when>
<c:otherwise>
num은 다른값입니다<br>
</c:otherwise>
</c:choose>



<c:if test="true">
무조건실행<br>
</c:if>
${bbb = 90; '' }
<c:if test="${bbb < 100}">
bbb는 100보다 작음<br>
</c:if>


${sum=0;'' }
<c:forEach var="i" begin="2" end="10" varStatus="st">
${sum=sum+i;'' }
${st.index }<br>
${st.count }<br>
</c:forEach>
결과:${sum }<br>
</body>
</html>