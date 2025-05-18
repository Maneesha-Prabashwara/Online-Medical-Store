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
