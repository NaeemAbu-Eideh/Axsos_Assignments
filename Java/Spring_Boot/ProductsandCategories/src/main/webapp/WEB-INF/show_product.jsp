<%--
  Created by IntelliJ IDEA.
  User: Naeem Abu-Eideh
  Date: 11/18/2025
  Time: 9:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    </head>
    <body class="overflow-y-hidden">
        <h1 class="text-3xl font-bold mt-10 mb-15 text-center "> <c:out value="${product.name}"/> </h1>
        <p class="block underline text-[1.4em] text-blue-500 pb-7 border-b-2 border-black w-400 mx-auto mb-15"><a href=<c:out value="/"/>>Home</a></p>

        <div class="w-400 mx-auto mb-10 pb-5 border-b-2">
            <p class="text-2xl font-bold">Categories:</p>
            <ul class="list-disc list-decimal mt-7 ml-10">
                <c:forEach var="category" items="${product.categories}">
                    <li class="ml-6"> <c:out value="${category.name}"/> </li>
                </c:forEach>
            </ul>
        </div>

        <form action="/products/${product.id}/add" method="post">
            <select class="border w-400 block mx-auto" name="category_id">
                <c:forEach var="category" items="${categories}">
                    <c:if test="${!product.categories.contains(category)}">
                        <option value= <c:out value="${category.id}"/>> <c:out value="${category.name}"/></option>
                    </c:if>
                </c:forEach>
            </select>

            <input type="submit" value="Add" class="block border py-3 text-center w-400 mx-auto mt-3">
        </form>
    </body>
</html>