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



    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try{
            String username = request.getParameter("username");
            String name = request.getParameter("name");
            String password = PasswordHasher.hashPassword(request.getParameter("password"));
            String confirmPassword = request.getParameter("confirmPassword");
            String email = request.getParameter("email");
            String userID = UUID.randomUUID().toString();

            String role = "customer";
            if( !request.getParameter("password").equals(confirmPassword)){
                request.setAttribute("error","Passwords do not match ");
                request.getRequestDispatcher("signup.jsp").forward(request,response);
                return;
            }


            System.out.println("this  line executed");




            GenericCRUD<Customer> userGenericCRUD= new GenericCRUD<>(Customer.class, Config.USERS.getPath());

            Optional<Customer> customerOptional=  userGenericCRUD.findOne(username);



            if( customerOptional.isPresent()){
                request.setAttribute("error","username already exists");
                request.getRequestDispatcher("signup.jsp").forward(request , response);

            }else{
                // setting attributes in the session
                HttpSession session = request.getSession();
                session.setAttribute("id", userID);
                session.setAttribute("username",username);
                session.setAttribute("name", name);
                session.setAttribute("password", password);
                session.setAttribute("role", role);


                User user = new User(userID,name, username,password, role,email);
                Customer customer = new Customer(user.getUserID(),user.getName(), user.getUsername(), user.getPassword(),
                        "customer", user.getEmail());
                session.setAttribute("user", customer);
                userFileHandler.saveUser(user);


                //redirect to the dashboard if the signup is successful
                response.sendRedirect(request.getContextPath() + "/showProducts");

            }




        }catch(Exception e ){
            e.printStackTrace();
        }

    }

    public void doGet(HttpServletRequest request , HttpServletResponse response){



    }

}
