<%--
  Created by IntelliJ IDEA.
  User: Naeem Abu-Eideh
  Date: 11/10/2025
  Time: 12:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <!-- For any Bootstrap that uses JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<p class="pt-5 p-lg-4 ">You have visitor <a href="/your_server" class="text-primary">http://your_server</a> <c:out value="${count}"/> times <br><a href="/your_server" class="text-primary">Test another visit</a></p>
<form></form>
</body>
</html>
