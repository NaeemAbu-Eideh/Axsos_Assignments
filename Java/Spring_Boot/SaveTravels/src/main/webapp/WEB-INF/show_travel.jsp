<%--
  Created by IntelliJ IDEA.
  User: Naeem Abu-Eideh
  Date: 11/12/2025
  Time: 1:49 PM
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
        <title>hhhhhh</title>
        <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    </head>
    <body>
        <div class="flex w-300 mx-auto items-center justify-between mt-7 mb-13">
            <h1 class="font-bold text-3xl text-[#175D9A] ">Expense Details:</h1>
            <a class="text-[1.2em] text-blue-600 underline" href=<c:out value="/expenses"/>> Go Back</a>
        </div>
        <div class="w-300 mx-auto">
            <div class="flex items-center justify-between w-100 mb-5">
                <p class="font-bold">Expense Name:</p>
                <p> <c:out value="${travel.expense}"/></p>
            </div>

            <div class="flex items-center justify-between w-100 mb-5">
                <p class="font-bold">Expense Name:</p>
                <p> <c:out value="${travel.expense}"/></p>
            </div>

            <div class="flex items-center justify-between w-100 mb-5">
                <p class="font-bold">Vendor:</p>
                <p> <c:out value="${travel.vendor}"/></p>
            </div>

            <div class="flex items-center justify-between w-100 mb-5">
                <p class="font-bold">Amount Spent:</p>
                <p> $<c:out value="${travel.amount}"/></p>
            </div>
        </div>
    </body>
</html>
