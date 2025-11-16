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
        <div class="flex justify-between items-center w-300 mx-auto my-10">
            <h1 class="text-3xl font-bold">New Dojo</h1>
        </div>
        <form:form action="/dojos/new/add-dojo" method="post" modelAttribute="dojos" cssClass="w-300 mx-auto">
            <p class="flex w-100">
                <form:label path="name">Name: </form:label>
                <form:input path="name" cssClass="border ml-10"/>
                <form:errors path="name" cssClass="ml-10"/>
            </p>
            <input type="submit" value="Create" class="ml-40 mt-10 border px-4 py-2">
        </form:form>
    </body>
</html>
