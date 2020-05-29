package com.example.springboothelloworld.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter
public class HelloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Executing doFilter method");

        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("Done Executing doFilter method");
    }
}
