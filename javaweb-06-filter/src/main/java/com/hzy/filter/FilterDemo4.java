package com.hzy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// @WebFilter("/*")
// @WebFilter("*.jsp")
// @WebFilter("/user/*")
// @WebFilter("/index.jsp")
public class FilterDemo4 implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行了过滤器");
        chain.doFilter(request,response);
    }
}
