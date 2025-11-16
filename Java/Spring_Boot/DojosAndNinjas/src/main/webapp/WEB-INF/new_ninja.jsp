<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
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
        <form:form action="/ninjas/new/add-ninja" method="post" modelAttribute="ninjas" cssClass="w-300 mx-auto">

            <p class="flex w-100 mb-5 w-150 justify-between">
                <form:label path="dojo">Dojo: </form:label>
                <form:select path="dojo" cssClass="border">
                    <form:options items="${dojos}" itemLabel="name" itemValue="id" />
                </form:select>
            </p>

            <p class="flex w-100 mb-5 w-150 justify-between">
                <form:label path="first_name">First Name: </form:label>
                <form:input path="first_name" cssClass="border ml-10 pl-3"/>
                <form:errors path="first_name" cssClass="ml-10"/>
            </p>
            <p class="flex w-100 mb-5 w-150 justify-between">
                <form:label path="last_name">Last Name: </form:label>
                <form:input path="last_name" cssClass="border ml-10 pl-3"/>
                <form:errors path="last_name" cssClass="ml-10"/>
            </p>
            <p class="flex w-100 mb-5 w-150 justify-between">
                <form:label path="age">Age: </form:label>
                <form:input path="age" cssClass="border ml-10 pl-3"/>
                <form:errors path="age" cssClass="ml-10"/>
            </p>
            <input type="submit" value="Create" class="ml-40 mt-10 border px-4 py-2">
        </form:form>
    </body>
</html>
