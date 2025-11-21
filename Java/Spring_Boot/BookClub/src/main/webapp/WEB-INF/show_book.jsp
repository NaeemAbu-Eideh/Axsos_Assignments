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
            <h1 class="text-3xl font-bold italic"> <c:out value="${book.authorName}"/> </h1>
            <a class="underline text-[1.3em] text-blue-700" href= <c:out value="/books"/> > Back to my shelves</a>
        </div>

        <p class="mt-10 w-400 mx-auto text-[1.3em] pb-3 border-b-2 border-black mb-10"> <span class="text-red-500">
            <c:if test="${author.email == book.author.email}">
                You
            </c:if>
            <c:if test="${author.email != book.author.email}">
                <c:out value="${book.author.name}"/>
            </c:if>
            </span> read <span class="text-[#A116FE]"><c:out value="${book.title}"/></span> by <span class="text-[#49B954]">
            <c:out value="${book.authorName}"/>.
        </span> Here are <span>
            <c:if test="${author.email == book.author.email}">
                your
            </c:if>
            <c:if test="${author.email != book.author.email}">
                <c:out value="${book.author.name}"/>'s
            </c:if>
            </span> thoughts.
        </p>

        <p class="w-400 mx-auto mb-10 pb-3 border-b-2 border-black text-[1.5em]"> <c:out value="${book.thought}"/> </p>

        <c:if test="${ author.email == book.author.email }">
            <div class="w-400 mx-auto">
                <a class="border ml-10 px-4 py-2" href= <c:out value="/books/${book.id}/edit"/>> Edit </a>
                <a class="border ml-10 px-4 py-2" href= <c:out value="/books/${book.id}/delete"/>> Delete </a>
            </div>
        </c:if>

    </body>
</html>