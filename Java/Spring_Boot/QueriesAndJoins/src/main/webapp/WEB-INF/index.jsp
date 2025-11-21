
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
        <div class="w-300 mx-auto my-15">
            <p id="q" class="text-[1.4em] text-center">
                <a class="underline text-blue-500" href= <c:out value="#q1"/> >query1</a> | <a class="underline text-blue-500" href=<c:out value="#q2"/>>query2</a>
                | <a class="underline text-blue-500" href=<c:out value="#q3"/>>query3</a> | <a class="underline text-blue-500" href=<c:out value="#q4"/>>query4</a>
                | <a class="underline text-blue-500" href=<c:out value="#q5"/>>query5</a> | <a class="underline text-blue-500" href=<c:out value="#q6"/>>query6</a>
                | <a class="underline text-blue-500" href=<c:out value="#q7"/>>query7</a> | <a class="underline text-blue-500" href=<c:out value="#q8"/>>query8</a>
            </p>
        </div>
        <div class="w-400 mx-auto mt-10 mb-10" id="q1">
            <h1 class="text-3xl mb-5 font-bold">Query 1</h1>
            <a class="underline text-[1.4em] text-blue-500 mb-10" href=<c:out value="#q"/>> Back to tha top</a>
            <table class="border w-400 mx-auto mt-10">
                <tr class="border">
                    <th class="border py-4">Country</th>
                    <th class="border py-4">Language</th>
                    <th class="border py-4">Percentage</th>
                </tr>
                <c:forEach var="country" items="${query1}">
                    <tr class="border">
                        <td class="border pl-3 py-4"> <c:out value="${country[0]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[1]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[2]}"/> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <div class="w-400 mx-auto mt-10 mb-10" id="q2">
            <h1 class="text-3xl mb-5 font-bold">Query 2</h1>
            <a class="underline text-[1.4em] text-blue-500 mb-10" href=<c:out value="#q"/>> Back to tha top</a>
            <table class="border w-400 mx-auto mt-10">
                <tr class="border">
                    <th class="border py-4">Country</th>
                    <th class="border py-4">Cities</th>
                </tr>
                <c:forEach var="country" items="${query2}">
                    <tr class="border">
                        <td class="border pl-3 py-4"> <c:out value="${country[0]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[1]}"/> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <div class="w-400 mx-auto mt-10 mb-10" id="q3">
            <h1 class="text-3xl mb-5 font-bold">Query 3</h1>
            <a class="underline text-[1.4em] text-blue-500 mb-10" href=<c:out value="#q"/>> Back to tha top</a>
            <table class="border w-400 mx-auto mt-10">
                <tr class="border">
                    <th class="border py-4">City</th>
                    <th class="border py-4">Population</th>
                </tr>
                <c:forEach var="city" items="${query3}">
                    <tr class="border">
                        <td class="border pl-3 py-4"> <c:out value="${city[0]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${city[1]}"/> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <div class="w-400 mx-auto mt-10 mb-10" id="q4">
            <h1 class="text-3xl mb-5 font-bold">Query 4</h1>
            <a class="underline text-[1.4em] text-blue-500 mb-10" href=<c:out value="#q"/>> Back to tha top</a>
            <table class="border w-400 mx-auto mt-10">
                <tr class="border">
                    <th class="border py-4">Country</th>
                    <th class="border py-4">Language</th>
                    <th class="border py-4">Percentage</th>
                </tr>
                <c:forEach var="country" items="${query4}">
                    <tr class="border">
                        <td class="border pl-3 py-4"> <c:out value="${country[0]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[1]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[2]}"/> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <div class="w-400 mx-auto mt-10 mb-10" id="q5">
            <h1 class="text-3xl mb-5 font-bold">Query 5</h1>
            <a class="underline text-[1.4em] text-blue-500 mb-10" href=<c:out value="#q"/>> Back to tha top</a>
            <table class="border w-400 mx-auto mt-10">
                <tr class="border">
                    <th class="border py-4">Country</th>
                    <th class="border py-4">Surface Area</th>
                    <th class="border py-4">City</th>
                    <th class="border py-4">Population</th>
                </tr>
                <c:forEach var="country" items="${query5}">
                    <tr class="border">
                        <td class="border pl-3 py-4"> <c:out value="${country[0]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[1]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[2]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[3]}"/> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <div class="w-400 mx-auto mt-10 mb-10" id="q6">
            <h1 class="text-3xl mb-5 font-bold">Query 6</h1>
            <a class="underline text-[1.4em] text-blue-500 mb-10" href=<c:out value="#q"/>> Back to tha top</a>
            <table class="border w-400 mx-auto mt-10">
                <tr class="border">
                    <th class="border py-4">Country</th>
                    <th class="border py-4">Government</th>
                    <th class="border py-4">Surface Area</th>
                    <th class="border py-4">Life Expectancy</th>
                </tr>
                <c:forEach var="country" items="${query6}">
                    <tr class="border">
                        <td class="border pl-3 py-4"> <c:out value="${country[0]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[1]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[2]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[3]}"/> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <div class="w-400 mx-auto mt-10 mb-10" id="q7">
            <h1 class="text-3xl mb-5 font-bold">Query 7</h1>
            <a class="underline text-[1.4em] text-blue-500 mb-10" href=<c:out value="#q"/>> Back to tha top</a>
            <table class="border w-400 mx-auto mt-10">
                <tr class="border">
                    <th class="border py-4">Country</th>
                    <th class="border py-4">City</th>
                    <th class="border py-4">District</th>
                    <th class="border py-4">Population</th>
                </tr>
                <c:forEach var="country" items="${query7}">
                    <tr class="border">
                        <td class="border pl-3 py-4"> <c:out value="${country[0]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[1]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[2]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[3]}"/> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <div class="w-400 mx-auto mt-10 mb-20" id="q8">
            <h1 class="text-3xl mb-5 font-bold">Query 8</h1>
            <a class="underline text-[1.4em] text-blue-500 mb-10" href=<c:out value="#q"/>> Back to tha top</a>
            <table class="border w-400 mx-auto mt-10">
                <tr class="border">
                    <th class="border py-4">Region</th>
                    <th class="border py-4">Countries</th>
                </tr>
                <c:forEach var="country" items="${query8}">
                    <tr class="border">
                        <td class="border pl-3 py-4"> <c:out value="${country[0]}"/> </td>
                        <td class="border pl-3 py-4"> <c:out value="${country[1]}"/> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </body>
</html>
