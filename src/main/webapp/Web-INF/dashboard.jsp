<%--
  Created by IntelliJ IDEA.
  User: Maneesha Prabashwara
  Date: 5/14/2025
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="org.example.onlinemediclestore.Classes.User" %>
<%@ page import="org.example.onlinemediclestore.Classes.Medicine" %>
<%@ page import="java.util.List" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("dashboard.jsp");
        return;
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Medicare | Dashboard</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 font-sans leading-normal tracking-normal">

<!-- Navbar -->
<nav class="bg-white shadow-md px-6 py-4 flex justify-between items-center">
    <a href="./index.jsp" class="text-xl font-bold text-blue-600">Medicare Dashboard</a>

    <div class="justify-between items-center">

        <a href="${pageContext.request.contextPath}//viewCustomerOrder" class="text-md cursor-pointer  font-semibold  text-blue-600 px-2 ">View Orders</a>
        <span class="text-gray-700">Hi, <%= user.getUsername() %> 👋</span>
    </div>
</nav>
