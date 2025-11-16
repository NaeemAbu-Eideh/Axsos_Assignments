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
        <h1 class="text-3xl mx-auto w-300 font-bold my-15">Burbank Location Ninjas</h1>
        <table class="w-300 mx-auto">
            <tr class="border bg-gray-300">
                <th class="border font-bold">First Name</th>
                <th class="border font-bold">Last Name</th>
                <th class="border font-bold">Age</th>
            </tr>

            <c:forEach var="ninja" items="${ninjas}">

                <tr class="border odd:bg-gray-200">
                    <th class="border font-bold px-5"><c:out value="${ninja.first_name}"/></th>
                    <th class="border font-bold px-5"><c:out value="${ninja.last_name}"/></th>
                    <th class="border font-bold px-5"><c:out value="${ninja.age}"/></th>
                </tr>

            </c:forEach>
        </table>
    </body>
</html>
