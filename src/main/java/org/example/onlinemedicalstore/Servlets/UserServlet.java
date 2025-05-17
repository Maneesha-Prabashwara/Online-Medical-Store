package org.example.onlinemedicalstore.Servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.onlinemedicalstore.Classes.Customer;
import org.example.onlinemedicalstore.Classes.Order;
import org.example.onlinemedicalstore.FileConfig.Config;
import org.example.onlinemedicalstore.utils.GenericCRUD;
import org.example.onlinemedicalstore.utils.PasswordHasher;
import org.example.onlinemedicalstore.Classes.User;
import org.example.onlinemedicalstore.FileHandlers.UserFileHandler;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@WebServlet("/signup")
public class    UserServlet extends HttpServlet {
    UserFileHandler userFileHandler= new UserFileHandler();

