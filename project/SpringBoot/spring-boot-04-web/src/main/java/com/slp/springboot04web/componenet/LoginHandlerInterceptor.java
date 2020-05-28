package com.slp.springboot04web.componenet;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName LoginHandlerInterceptor
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/27 8:20
 * @Version 1.0
 **/

public class LoginHandlerInterceptor implements HandlerInterceptor {
    /**
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object  user = request.getSession().getAttribute("loginUser");
        if(user == null){
            request.setAttribute("msg","请先登录");

            request.getRequestDispatcher("/INDEX.HTML").forward(request,response
            );
            return false;


        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
