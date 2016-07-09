package com.henushang.pa.controller;

import javax.servlet.http.HttpServletRequest;

import com.henushang.pa.common.Constants;
import com.henushang.pa.domain.User;

public abstract class BaseController {
    
    protected final String PREFIX_W_R = "WorkRecord/";
    protected final String PREFIX_B_A = "BirthAlert/";
    
    protected User getCurUser(HttpServletRequest request) {
        Object object = request.getSession().getAttribute(Constants.CUR_USER);
        return object == null ? null : (User) object;
    }
    
    protected String getCurUserId(HttpServletRequest request) {
        User user = getCurUser(request);
        if (user == null) {
            return null;
        }
        return user.get_id();
    }
}
