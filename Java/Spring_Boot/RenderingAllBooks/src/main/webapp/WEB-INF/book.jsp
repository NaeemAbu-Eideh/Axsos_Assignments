<%--
  Created by IntelliJ IDEA.
  User: Naeem Abu-Eideh
  Date: 11/14/2025
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    </head>
    <body>
        <a class="text-[1.2em] text-blue-600 block ml-auto mr-20 mt-10 w-30" href=<c:out value="/books"/>> Show Books</a>
        <div class="ml-25 mt-10">
            <h1 class="text-3xl font-bold mb-8"><c:out value="${title}"/></h1>
            <p class="text-[1.2em] mb-4">Description: <c:out value="${desc}"/></p>
            <p class="text-[1.2em] mb-4">Language: <c:out value="${lang}"/></p>
            <p class="text-[1.2em] mb-4">Number of Pages: <c:out value="${pages}"/></p>
        </div>
    </body>
</html>