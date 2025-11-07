<%--
  Created by IntelliJ IDEA.
  User: Naeem Abu-Eideh
  Date: 11/5/2025
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/index_style.css">
</head>
<body>
<div>
    <a href="<c:out value='/date'/>">Date Template</a>
    <a href="<c:out value='/time'/>">Time Template</a>

</div>
</body>
</html>
