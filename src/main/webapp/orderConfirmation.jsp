<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 5/17/2025
  Time: 8:31 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Confirmation</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 font-sans leading-normal tracking-normal">

<div class="container mx-auto px-4 py-10">
    <h1 class="text-3xl font-bold mb-6 text-center text-indigo-700">Order Confirmation</h1>

        <%
        org.example.onlinemediclestore.Classes.Order order =
                (org.example.onlinemediclestore.Classes.Order) request.getAttribute("order");

        if (order != null) {
    %>

    <div class="max-w-3xl mx-auto bg-white rounded-2xl shadow-lg overflow-hidden p-8">
        <div class="flex justify-between items-center mb-6 pb-4 border-b border-gray-200">
            <div>
                <h2 class="text-2xl font-semibold text-gray-800">Thank You for Your Order!</h2>
                <p class="text-gray-600">Your order has been successfully placed.</p>
            </div>
            <div class="bg-green-100 text-green-800 px-4 py-2 rounded-full font-medium text-sm">
                <%= order.getStatus() %>
            </div>
        </div>

        <div class="mb-6">
            <h3 class="text-lg font-medium text-gray-800 mb-2">Order Details</h3>
            <div class="bg-gray-50 p-4 rounded-lg">
                <div class="grid grid-cols-1 md:grid-cols-2 gap-4">
                    <div>
                        <p class="text-sm text-gray-600">Order ID:</p>
                        <p class="font-medium"><%= order.getId() %></p>
                    </div>
                    <div>
                        <p class="text-sm text-gray-600">Order Date:</p>
                        <p class="font-medium"><%= order.getOrderDate() %></p>
                    </div>
                    <div>
                        <p class="text-sm text-gray-600">Status:</p>
                        <p class="font-medium"><%= order.getStatus() %></p>
                    </div>
                    <div>
                        <p class="text-sm text-gray-600">Total Amount:</p>
                        <p class="font-medium text-indigo-600">$<%= order.getTotalPrice() %></p>
                    </div>
                </div>
            </div>
        </div>

