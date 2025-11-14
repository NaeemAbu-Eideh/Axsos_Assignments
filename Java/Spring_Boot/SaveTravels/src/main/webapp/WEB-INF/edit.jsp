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
        <div class="flex justify-between items-center w-300 mx-auto mt-15 mb-7">
            <h2 class="text-[#3D7923] text-2xl font-bold">Edit Expense</h2>
            <a class="text-blue-400 underline text-[1.2em]" href= <c:out value="/expenses"/>> Go Back</a>
        </div>
        <form:form action="/expenses/edit/${travel.id}/save-edit" method="post" modelAttribute = "travel" cssClass="w-300 mx-auto">
            <p class="mt-4 flex items-center justify-between w-100">
                <form:label path="expense" cssClass="font-bold">Expense Name</form:label>
                <form:input path="expense" cssClass="border pl-2"/>
                <form:errors path="expense" cssClass="text-red-400"/>
            </p>
            <p class="mt-4 flex items-center justify-between w-100">
                <form:label path="vendor" cssClass="font-bold">Vendor</form:label>
                <form:input path="vendor" cssClass="border pl-2"/>
                <form:errors path="vendor" cssClass="text-red-400"/>
            </p>
            <p class="mt-4 items-center w-200">
                <form:label path="amount" cssClass="font-bold mr-45">Amount</form:label>
                <form:input path="amount" cssClass="border pl-2 mr-10"/>
                <form:errors path="amount" cssClass="text-red-400"/>
            </p>
            <p class="mt-4 flex items-center justify-between w-100">
                <form:label path="description" cssClass="font-bold">Description</form:label>
                <form:textarea path="description" cssClass="border pl-2 "/>
                <form:errors path="description" cssClass="text-red-400"/>
            </p>

            <input type="submit" class="px-4 py-2 bg-blue-600 text-white text-[1.2em] ml-77 mt-5">
        </form:form>
    </body>
</html>
