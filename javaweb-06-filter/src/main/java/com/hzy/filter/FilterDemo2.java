package com.hzy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo2 implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 对request对象的请求进行处理
        System.out.println("处理了request请求");

        // 放行
        chain.doFilter(request,response);

        // 对response对象的响应进行处理
        System.out.println("处理了response响应");
    }
}
