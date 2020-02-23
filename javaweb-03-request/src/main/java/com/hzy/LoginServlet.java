package com.hzy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取单个信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 获取多个信息
        String[] hobbies = req.getParameterValues("hobbies");
        System.out.println(username);
        System.out.println(password);
        if (hobbies != null) {
            for (String hobby : hobbies) {
                System.out.println(hobby);
            }
            // 请求转发
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        } else {
            // 重定向
            resp.sendRedirect("/error.jsp");
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
