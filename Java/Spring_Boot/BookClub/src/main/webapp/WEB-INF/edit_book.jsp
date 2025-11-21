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
        <div class="flex justify-between items-center w-400 mx-auto my-10">
            <h1 class="text-3xl font-bold underline">Change your Entry!</h1>
            <a class="underline text-[1.3em] text-blue-700" href= <c:out value="/books"/> > Back to my shelves</a>
        </div>

        <form:form cssClass="mt-4 w-400 mx-auto" action="/books/${book.id}/edit/save-edit" method="post" modelAttribute="books">
            <div class="w-150 mb-6">
                <p class="mb-4 mt-5"><form:errors path="title" cssClass="text-red-700 "/></p>
                <form:label path="title" cssClass="mr-20">Title: </form:label>
                <form:input alt="" path="title" cssClass="border py-2"/>
            </div>
            <div class="w-150 mb-6">
                <p class="mb-4"><form:errors path="authorName" cssClass="text-red-700"/></p>
                <form:label path="authorName" cssClass="mr-20">Author: </form:label>
                <form:input path="authorName" cssClass="border py-2"/>
            </div>
            <div class="w-150 mb-6">
                <p class="mb-4"><form:errors path="thought" cssClass="text-red-700"/></p>
                <form:label path="thought" cssClass="mr-20">Description: </form:label>
                <form:input path="thought" cssClass="border py-2"/>
            </div>
            <input type="submit" class="border px-3 px-5 font-bold block ml-30 mb-6">
        </form:form>
    </body>
</html>