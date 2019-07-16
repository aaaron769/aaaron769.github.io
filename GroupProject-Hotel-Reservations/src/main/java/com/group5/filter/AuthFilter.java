package com.group5.filter;

import com.group5.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String path = request.getServletPath();

        if (path.equals("/login")) {
            filterChain.doFilter(request, response);
            return;
        }

        User user = (User) request.getSession().getAttribute("username");
        if (user != null) {
            filterChain.doFilter(request, response);
        } else {
            String message = "Please login first!";
            request.getSession().setAttribute("msg", message);
            response.sendRedirect("/login");

            return;
        }
    }

    @Override
    public void destroy() {

    }
}
