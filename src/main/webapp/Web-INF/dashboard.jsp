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