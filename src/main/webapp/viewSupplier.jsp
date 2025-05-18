<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.onlinemedicalstore.Classes.Supplier" %>
<%@ page import="java.util.List" %>
<%
    List<Supplier> suppliers = (List<Supplier>) request.getAttribute("suppliers");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script src="https://cdn.tailwindcss.com"></script>
    <script type="module">
        import {openEditModel} from "./js/editPopup.js";
        import {closeEditModel} from "./js/editPopup.js";
        window.openEditModel= openEditModel;
        window.closeEditModel= closeEditModel;
    </script>
</head>
<body class="bg-gray-100 p-6">

<div class="container mx-auto">
    <h1 class="text-3xl font-bold mb-6 text-center text-blue-700">Supplier Management</h1>
    <a  href="./admin.jsp" class="text-blue-500 mb-4 font-semibold"> <- Go to dashboard</a>

    <!-- Add Supplier Form -->
    <div class="bg-white p-6 rounded shadow-md mb-8">
        <h2 class="text-xl font-semibold mb-4 text-gray-700">Add New Supplier</h2>
        <form action="./supplier" method="post" class="grid grid-cols-1 md:grid-cols-2 gap-4">
            <input type="text" name="name" placeholder="Full Name" required
                   class="border p-2 rounded w-full" />
            <input type="text" name="username" placeholder="Username" required
                   class="border p-2 rounded w-full" />
            <input type="email" name="email" placeholder="Email" required
                   class="border p-2 rounded w-full" />
            <input type="password" name="password" placeholder="Password" required
                   class="border p-2 rounded w-full" />
            <input type="text" name="companyName" placeholder="Company Name" required
                   class="border p-2 rounded w-full" />
            <input type="text" name="address" placeholder="Address" required
                   class="border p-2 rounded w-full" />
            <div class="md:col-span-2">
                <button type="submit"
                        class="bg-blue-600 text-white px-6 py-2 rounded hover:bg-blue-700 transition duration-200 w-full">
                    Add Supplier
                </button>
            </div>
        </form>
    </div>


</body>
</html>   