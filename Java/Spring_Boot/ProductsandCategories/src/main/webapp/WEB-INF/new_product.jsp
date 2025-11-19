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
        <h1 class="text-3xl font-bold mt-10 mb-15 text-center "> New Product </h1>
        <p class="block underline text-[1.4em] text-blue-500 pb-7 border-b-2 border-black w-400 mx-auto mb-15"><a href=<c:out value="/"/>>Home</a></p>

        <form:form cssClass="" action= "/products/new/add-product" method="post" modelAttribute="product">
            <table class="border-2 w-400 mx-auto">
                <tr class="border-2">
                    <td class="border-2 px-3 py-5 w-200 font-bold text-2xl"> <form:label path="name">Name: </form:label></td>
                    <td class="border-2 px-3 py-5 w-200">
                        <form:input cssClass="mr-10 border pl-2" path="name"/>
                        <form:errors cssClass="text-red-500 text-[1.2em]" path="name"/>
                    </td>
                </tr>
                <tr class="border-2">
                    <td class="border-2 px-3 py-5 w-200 font-bold text-2xl"> <form:label path="description">Description: </form:label></td>
                    <td class="border-2 px-3 py-5 w-200">
                        <form:input cssClass="mr-10 border pl-2" path="description"/>
                        <form:errors cssClass="text-red-500 text-[1.2em]" path="description"/>
                    </td>
                </tr>
                <tr class="border-2">
                    <td class="border-2 px-3 py-5 w-200 font-bold text-2xl"> <form:label path="price">Price: </form:label></td>
                    <td class="border-2 px-3 py-5 w-200">
                        <form:input cssClass="mr-10 border pl-2" path="price"/>
                        <form:errors cssClass="text-red-500 text-[1.2em]" path="price"/>
                    </td>
                </tr>
                <tr class="border-2">
                    <th class="border-2 px-5 py-5" colspan="2">
                        <input type="submit" class="w-360 border py-5 text-2xl">
                    </th>
                </tr>
            </table>
        </form:form>
    </body>
</html>