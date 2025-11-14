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
            <h1 class="font-bold text-3xl">Add Book</h1>
            <a class="text-[1.2em] text-blue-600" href=<c:out value="/books"/>> Show Books</a>
        </div>
        <form action="<c:url value="/add-book"/>" method="post" class="w-400 mx-auto">
            <div class="flex items-center justify-between w-100 mb-10">
                <label>Title</label>
                <input type="text" class="border pl-3" name="title">
            </div>

            <div class="flex items-center justify-between w-100 mb-10">
                <label>Language</label>
                <input type="text" class="border pl-3" name="lang">
            </div>

            <div class="flex items-center justify-between w-100 mb-10">
                <label>Number of pages</label>
                <input type="number" class="border pl-3" name="pages" min="50">
            </div>

            <div class="flex items-center justify-between w-100 mb-10">
                <label>Description</label>
                <textarea class="border pl-3 h-14" name="desc"></textarea>
            </div>
            <input type="submit" value="Add Book" class="ml-10 px-5 text-[1.2em] py-3 w-40 border bg-gray-300">
        </form>
    </body>
</html>