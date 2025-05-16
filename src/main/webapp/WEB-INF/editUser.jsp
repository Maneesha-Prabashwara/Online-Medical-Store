<%--
  Created by IntelliJ IDEA.
  User: Uthpala
  Date: 16/05/2025
  Time: 12:03 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.example.onlinemedicalstore.Classes.Customer" %>
<%@ page import="org.example.onlinemedicalstore.Classes.Supplier" %>
<%@ page import="org.example.onlinemedicalstore.Classes.User" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Profile</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen">
    <%
    // Get user from session
    User userObj = (User) session.getAttribute("user");
    String role = userObj.getRole();

    if (userObj == null) {
        response.sendRedirect(request.getContextPath() + "/login.jsp");
        return;
    }

    String username = "";
    String name = "";
    String email = "";
    String id = "";
    String companyName = "";
    String address = "";

    if (role.equals("customer")) {
        Customer customer = (Customer) userObj;
        username = customer.getUsername();
        name = customer.getName();
        email = customer.getEmail();
        id = customer.getUserID();
    } else if (role.equals("supplier")) {
        Supplier supplier = (Supplier) userObj;
        username = supplier.getUsername();
        name = supplier.getName();
        email = supplier.getEmail();
        id = supplier.getUserID();
        companyName = supplier.getCompanyName();
        address = supplier.getAddress();
    }
%>
