package com.sx.intercept;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shengx
 * @date 2020/4/2 20:38
 */
@Component
public class LoginIntercept implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getSession().getAttribute("username") == null){
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }
}
