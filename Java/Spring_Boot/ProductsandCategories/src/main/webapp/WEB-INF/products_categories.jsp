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
        <h1 class="text-3xl font-bold my-10 text-center"> Home Page </h1>
        <div class="ml-39 mb-15">
            <a class=" block w-40 mb-5 underline text-blue-500 text-[1.4em]" href=<c:out value="/products/new"/>>New Product</a>
            <a class=" block w-40 underline text-blue-500 text-[1.4em]" href=<c:out value="/categories/new"/>>New Category</a>
        </div>

        <div class="h-130 w-400 mx-auto overflow-y-auto overflow-x-hidden">
            <table class="border w-400">
                <tr class="border">
                    <th class="border w-150 font-bold text-3xl py-5">Products</th>
                    <th class="border w-150 font-bold text-3xl py-5">Categories</th>
                </tr>
                <tr class="border">
                    <td class="border px-4 py-5">
                        <ul class="list-disc list-decimal">
                            <c:forEach var="product" items="${products}">
                                <li class="ml-2 mt-5">
                                    <a class="text-blue-500 text-[1.3em] underline" href= <c:out value="/products/${product.id}"/>>
                                        <c:out value="${product.name}"/>
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                    </td>
                    <td class="border px-4 py-5">
                        <ul class="list-disc list-decimal">
                            <c:forEach var="category" items="${categories}">
                                <li class="ml-2 mt-5">
                                    <a class="text-blue-500 text-[1.3em] underline" href= <c:out value="/categories/${category.id}"/>>
                                        <c:out value="${category.name}"/>
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                    </td>
                </tr>
            </table>
        </div>

    </body>
</html>
