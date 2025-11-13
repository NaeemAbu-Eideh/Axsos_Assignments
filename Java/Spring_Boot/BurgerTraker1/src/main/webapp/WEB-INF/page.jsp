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
        <h1 class="font-bold text-3xl text mx-auto mt-7 w-300 text-[#085394]">Burger Tracker</h1>
        <div class="overflow-y-auto h-100">
            <table class="border mx-auto w-300 mt-7">
                <tr class="border bg-gray-300">
                    <th class="border  py-3">Burger Name</th>

                    <th class="border  py-3">Restaurant Name</th>

                    <th class="border  py-3">Rating (out of 5)</th>
                </tr>
                <c:forEach var="burger" items="${burgers}">
                    <tr class="border">
                        <td class="border  py-3 px-2"><c:out value="${burger.burgerName}"/></td>
                        <td class="border  py-3 px-2"><c:out value="${burger.restName}"/></td>
                        <td class="border  py-3 px-2"><c:out value="${burger.rate}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <h2 class="text-[#085394] text-2xl w-300 mx-auto font-bold mt-15 mb-7">Add a Burger</h2>
        <form:form action="/add-burger" method="post" modelAttribute = "burger" cssClass="w-300 mx-auto">
            <p class="mt-4 flex items-center justify-between w-100">
                <form:label path="burgerName" cssClass="font-bold">Burger Name</form:label>
                <form:input path="burgerName" cssClass="border pl-2"/>
                <form:errors path="burgerName" cssClass="text-red-400"/>
            </p>
            <p class="mt-4 flex items-center justify-between w-100">
                <form:label path="restName" cssClass="font-bold">Resturant Name</form:label>
                <form:input path="restName" cssClass="border pl-2"/>
                <form:errors path="restName" cssClass="text-red-400"/>
            </p>
            <p class="mt-4 items-center w-200">
                <form:label path="rate" cssClass="font-bold mr-45">Rate</form:label>
                <form:input path="rate" cssClass="border pl-2 mr-10"/>
                <form:errors path="rate" cssClass="text-red-400"/>
            </p>
            <p class="mt-4 flex items-center justify-between w-100">
                <form:label path="note" cssClass="font-bold">Notes</form:label>
                <form:textarea path="note" cssClass="border pl-2 "/>
                <form:errors path="note" cssClass="text-red-400"/>
            </p>

            <input type="submit" class="px-4 py-2 bg-blue-600 text-white text-[1.2em] ml-77 mt-5">
        </form:form>
    </body>
</html>
