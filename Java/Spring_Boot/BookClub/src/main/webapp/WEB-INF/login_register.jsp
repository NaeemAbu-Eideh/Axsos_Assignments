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
    <body>
        <div class="w-300 mx-auto mt-15">
            <h1 class="text-4xl font-bold text-[#9900FF]">Book Club</h1>
            <p class="mt-5 text-[1.3em]">A place for friends to share thoughts on books</p>
        </div>

        <div class="flex justify-between w-300 mx-auto mt-10">
            <div class="w-150">
                <p class="text-4xl font-bold mb-8">Register</p>
                <form:form cssClass="mt-4" action="/register" method="post" modelAttribute="register">
                    <div class="w-150 mb-6">
                        <p class="mb-4 mt-5"><form:errors path="name" cssClass="text-red-700 "/></p>
                        <form:label path="name" cssClass="mr-20">Name: </form:label>
                        <form:input path="name" cssClass="border py-2"/>
                    </div>
                    <div class="w-150 mb-6">
                        <p class="mb-4"><form:errors path="email" cssClass="text-red-700"/></p>
                        <form:label path="email" cssClass="mr-20">Email: </form:label>
                        <form:input path="email" cssClass="border py-2"/>
                    </div>
                    <div class="w-150 mb-6">
                        <p class="mb-4"><form:errors path="password" cssClass="text-red-700"/></p>
                        <form:label path="password" cssClass="mr-20">Password: </form:label>
                        <form:input type="password" path="password" cssClass="border py-2"/>
                    </div>
                    <div class="w-150 mb-6">
                        <p class="mb-4"><form:errors path="confirmPassword" cssClass="text-red-700"/></p>
                        <form:label path="confirmPassword" cssClass="mr-20">Confirm Password: </form:label>
                        <form:input type="password" path="confirmPassword" cssClass="border py-2"/>
                    </div>
                    <input type="submit" class="border px-3 px-5 font-bold block ml-30 mb-6">
                </form:form>
            </div>

            <div>
                <p class="text-4xl font-bold">Log in</p>
                <form:form cssClass="mt-4" action="/login" method="post" modelAttribute="login">
                    <div class="w-150 mb-6">
                        <p class="mb-4"><form:errors path="email" cssClass="text-red-700"/></p>
                        <form:label path="email" cssClass="mr-20">Email: </form:label>
                        <form:input path="email" cssClass="border py-2"/>
                    </div>
                    <div class="w-150 mb-6">
                        <p class="mb-4"><form:errors path="password" cssClass="text-red-700"/></p>
                        <form:label path="password" cssClass="mr-20">Password: </form:label>
                        <form:input type="password" path="password" cssClass="border py-2"/>
                    </div>
                    <input type="submit" class="border px-3 px-5 font-bold block ml-30 mb-6">
                </form:form>
            </div>
        </div>
    </body>
</html>
