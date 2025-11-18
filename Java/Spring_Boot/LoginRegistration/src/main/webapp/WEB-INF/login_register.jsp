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
        <div class="my-10 mx-auto w-300">
            <h1 class="text-2xl mb-7">Welcome!</h1>
            <p class="text-[1.3em]">Join our growing community</p>
        </div>

        <form:form action="/register" method="post" modelAttribute="register" cssClass="bg-[#9FC4F8] w-300 mx-auto">
            <table class="border w-300 mx-auto">
                <tr class="border">
                    <th class="border font-bold py-5 text-2xl" colspan="3">Register</th>
                </tr>

                <tr class="border">
                    <td class="border py-5 pl-4"> <form:label path="username"> Username:</form:label></td>
                    <td class="border py-5 pl-4"><form:input cssClass="border bg-white text-black" path="username"/></td>
                    <td class="border py-5 pl-4"> <form:errors path="username"/></td>
                </tr>

                <tr class="border">
                    <td class="border py-5 pl-4"> <form:label path="email">Email:</form:label></td>
                    <td class="border py-5 pl-4"><form:input cssClass="border bg-white text-black" path="email"/></td>
                    <td class="border py-5 pl-4"> <form:errors path="email"/></td>
                </tr

                ><tr class="border">
                    <td class="border py-5 pl-4"> <form:label path="password">Password:</form:label></td>
                    <td class="border py-5 pl-4"><form:input type="password" cssClass="border bg-white text-black" path="password"/></td>
                    <td class="border py-5 pl-4"> <form:errors  path="password"/></td>
                </tr>

                <tr class="border">
                    <td class="border py-5 pl-4"> <form:label path="confirmPassword">Confirm Password:</form:label></td>
                    <td class="border py-5 pl-4"><form:input type="password" cssClass="border bg-white text-black" path="confirmPassword"/></td>
                    <td class="border py-5 pl-4"> <form:errors path="confirmPassword"/></td>
                </tr>

                <tr class="border">
                    <th class="border font-bold py-5 text-2xl" colspan="3">
                        <input type="submit" value="Submit" class="border w-280 mx-auto bg-white">
                    </th>
                </tr>
            </table>
        </form:form>

        <form:form action="/login" method="post" modelAttribute="login" cssClass="bg-[#9FC4F8] w-300 mx-auto mt-10">
            <table class="border w-300 mx-auto">
                <tr class="border">
                    <th class="border font-bold py-5 text-2xl" colspan="3">Register</th>
                </tr>
                <tr class="border">
                    <td class="border py-5 pl-4"> <form:label path="email">Email:</form:label></td>
                    <td class="border py-5 pl-4"><form:input type="email" cssClass="border bg-white text-black" path="email"/></td>
                    <td class="border py-5 pl-4"> <form:errors path="email"/></td>
                </tr>

                <tr class="border">
                    <td class="border py-5 pl-4"> <form:label path="password"> Password:</form:label></td>
                    <td class="border py-5 pl-4"><form:input type="password" cssClass="border bg-white text-black" path="password"/></td>
                    <td class="border py-5 pl-4"> <form:errors path="password"/></td>
                </tr>

                <tr class="border">
                    <th class="border font-bold py-5 text-2xl" colspan="3">
                        <input type="submit" value="Submit" class="border w-280 mx-auto bg-white">
                    </th>
                </tr>
            </table>
        </form:form>
    </body>
</html>