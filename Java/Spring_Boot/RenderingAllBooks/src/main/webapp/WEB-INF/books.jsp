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
        <div class="flex justify-between items-center mx-auto w-400 my-10">
            <h1 class="font-bold text-3xl">All Book</h1>
            <a class="text-[1.2em] text-blue-600" href=<c:out value="/"/>> Add Books</a>
        </div>
        <table class="ml-20 border w-200">
            <tr class="border bg-gray-300">
                <th class="border w-20 font-bold">Id</th>
                <th class="border w-20 font-bold">Title</th>
                <th class="border w-20 font-bold">Language</th>
                <th class="border w-20 font-bold"># Pages</th>
            </tr>
            <c:forEach var="book" items="${books}">
                <tr class="border even:bg-gray-200">
                    <td class="border pl-4 py-4"><c:out value="${book.id}"/></td>
                    <td class="border pl-4 py-4"><a class="text-blue-700" href= <c:out value="/books/${book.id}"/>> <c:out value="${book.title}"/> </a></td>
                    <td class="border pl-4 py-4"><c:out value="${book.language}"/></td>
                    <td class="border pl-4 py-4"><c:out value="${book.pages}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>