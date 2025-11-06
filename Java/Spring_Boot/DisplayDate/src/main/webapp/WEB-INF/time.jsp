<%--
  Created by IntelliJ IDEA.
  User: Naeem Abu-Eideh
  Date: 11/5/2025
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->

<html>
<head>
    <title>Title</title>
    <style>
        p {
            font-size: 24px;
            color: #333;
            display: block;
            text-align: center;
            padding: 25px;
        }
    </style>
</head>
<body>
<p><c:out value="${time}"/></p>
</body>
</html>
