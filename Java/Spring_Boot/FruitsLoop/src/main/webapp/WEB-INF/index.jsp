<%--
  Created by IntelliJ IDEA.
  User: Naeem Abu-Eideh
  Date: 11/8/2025
  Time: 1:11 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
    <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>
    <!-- For any Bootstrap that uses JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Fruit Store</h1>
<table class="border ml-4 ">
    <c:forEach var="fruit" items="${fruits}">
        <tr class="border">
            <td class="border px-5 py-2">
               <c:out value="${fruit.name}"/>
            </td>
            <td class="border px-5 py-2">
                <c:out value="${fruit.price}"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
