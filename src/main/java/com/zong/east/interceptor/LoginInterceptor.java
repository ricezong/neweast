
package com.zong.east.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @ClassName LoginInterceptor
 * @Description 配置好拦截器要拦截哪些请求  把这些配置放在MVC容器中(config.AdminWebConfig)
 * @Author 孔明灯
 * @Data 2021/6/9 15:26
 * @Version 1.0
 */

public class LoginInterceptor implements HandlerInterceptor {


/**
     * 目标方法执行之前  登录检查
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //登录检查逻辑
        HttpSession session=request.getSession();
        Object user = session.getAttribute("user");
        if (user!=null){
            //放行
            session.setAttribute("user",user);
            return true;
        }
        //拦截住未登陆 跳转登录页
        request.setAttribute("msg","请先登录");
        request.getRequestDispatcher("/toLogin").forward(request,response);
        return false;
    }



/**
     * 目标方法执行完成以后
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }



/**
     * 页面渲染以后
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

