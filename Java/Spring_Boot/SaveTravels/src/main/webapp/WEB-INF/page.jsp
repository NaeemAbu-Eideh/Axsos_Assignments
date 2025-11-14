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
        <h1 class="font-bold text-3xl text mx-auto mt-7 w-300 text-[#175D9A] ">Save Travels</h1>
        <div class="overflow-y-auto h-100">
            <table class="border mx-auto w-300 mt-7">
                <tr class="border bg-gray-300">
                    <th class="border  py-3">Expense</th>

                    <th class="border  py-3">Vendor</th>

                    <th class="border  py-3">Amount</th>

                    <th class="border  py-3">Action</th>

                    <th class="border  py-3">Remove</th>
                </tr>
                <c:forEach var="travle" items="${travels}">
                    <tr class="border">
                        <td class="border  py-3 px-2"> <a class="text-blue-600" href= <c:out value="/expenses/${travle.id}"/> > <c:out value="${travle.expense}"/> </a> </td>
                        <td class="border  py-3 px-2"><c:out value="${travle.vendor}"/></td>
                        <td class="border  py-3 px-2">$<c:out value="${travle.amount}"/></td>
                        <td class="border  py-3 px-2"><a class="underline text-blue-600" href=<c:out value="/expenses/edit/${travle.id}"/>>Edit</a></td>
                        <td class="border py-3 px-2">
                        <form action="/expenses/delete" method="post">
                            <input type="hidden" name="id" value=<c:out value="${travle.id}"/>>
                            <input type="submit" value="delete" class="text-[1.2em] px-3 by-2 border bg-red-500">
                        </form>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <h2 class="text-[#085394] text-2xl w-300 mx-auto font-bold mt-15 mb-7">Add a expense</h2>
        <form:form action="/expenses/add-travel" method="post" modelAttribute = "travel" cssClass="w-300 mx-auto">
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
