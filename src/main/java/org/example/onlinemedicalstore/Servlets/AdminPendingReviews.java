package org.example.onlinemedicalstore.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.onlinemedicalstore.Classes.Review;
import org.example.onlinemedicalstore.Classes.User;
import org.example.onlinemedicalstore.utils.ReviewManager;

import java.io.IOException;
import java.util.List;


@WebServlet("/pendingReviews")
public class AdminPendingReviews  extends HttpServlet {
    private ReviewManager reviewManager;

    @Override
    public void init() throws ServletException {
        super.init();
        reviewManager = ReviewManager.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");



        // Get all pending reviews
        List<Review> pendingReviews = reviewManager.getPendingReviews();
        request.setAttribute("pendingReviews", pendingReviews);

        // Forward to the JSP page
        request.getRequestDispatcher("/admin/pendingReviews.jsp").forward(request, response);
    }

}
