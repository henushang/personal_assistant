package com.henushang.pa.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.henushang.pa.common.Constants;
import com.henushang.pa.common.WebConf;

//import com.henushang.pa.common.Constants;
//import com.henushang.pa.common.WebConf;

public class BaseInterceptor implements HandlerInterceptor {

    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub
        
    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub
        
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
        request.setAttribute(Constants.DOMAIN_NAME, WebConf.DOMAIN_NAME);
        request.setAttribute(Constants.BASE_STATIC, WebConf.BASE_STATIC);
        request.setAttribute("cur_id", "1");
        return true;
    }
    
    
}
