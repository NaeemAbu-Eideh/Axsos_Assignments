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
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    </head>
    <body class="overflow-y-hidden">
        <div class="flex w-400 justify-between mx-auto mt-10 mb-5">
            <h1 class="text-3xl font-bold">Welcome, <c:out value="${author.name}"/></h1>
            <a class="underline text-[1.3em] text-blue-700" href=<c:out value="/flush"/>> Logout </a>
        </div>

        <div class="flex w-400 justify-between mx-auto mb-10">
            <p class="text-[1.3em]">Books from everyone's shelves: </p>
            <a class="underline text-[1.3em] text-blue-700" href=<c:out value="/books/new"/>> + Add a Book to my Shelf</a>
        </div>

        <table class="border w-400 mx-auto">
            <tr class="border bg-gray-300">
                <th class="border w-20 px-3 py-3">ID</th>
                <th class="border w-100 py-3"> Book Title </th>
                <th class="border w-100 py-3">Author Name</th>
                <th class="border w-100 py-3">Posted by</th>
            </tr>

            <c:forEach var="book" items="${books}">
                <tr class="border odd:bg-gray-300">
                    <td class="border w-20 px-3 py-3"><c:out value="${book.id}"/></td>
                    <td class="border w-100 pl-3 py-3"> <a class="text-[1.3em] text-blue-700 underline" href= <c:out value="/books/${book.id}"/>> <c:out value="${book.title}"/> </a> </td>
                    <td class="border w-100 pl-3 py-3"><c:out value="${book.authorName}"/></td>
                    <td class="border w-100 pl-3 py-3"><c:out value="${author.name}"/></td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>