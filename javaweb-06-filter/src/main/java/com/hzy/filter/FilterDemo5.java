package com.hzy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/index.jsp", dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.FORWARD})
// @WebFilter(urlPatterns = "/index.jsp", dispatcherTypes = DispatcherType.FORWARD)
// @WebFilter(urlPatterns = "/index.jsp", dispatcherTypes = DispatcherType.REQUEST)
public class FilterDemo5 implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行了过滤器");
        chain.doFilter(request,response);
    }
}
