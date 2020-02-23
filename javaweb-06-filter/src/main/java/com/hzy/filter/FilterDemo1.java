package com.hzy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*") //这里的意思是执行所有的方法都会通过该过滤器，也就是拦截路径
public class FilterDemo1 implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Hello Filter");

        //放行
        chain.doFilter(request,response);
    }
}
