package com.hzy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo3 implements Filter {

    // 在服务器启动后，会创建Filter对象，然后调用init方法，只执行一个，用于加载资源
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init...");
    }

    // 每一次请求被拦截资源时会执行，执行多次
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter...");
        chain.doFilter(request,response);
    }

    // 在服务器正常关闭后，Filter对象被销毁，会执行destroy方法，只执行一次，用于释放资源
    public void destroy() {
        System.out.println("destroy...");
    }
}
