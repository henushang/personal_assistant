package com.henushang.pa.controller.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.henushang.pa.controller.BaseController;
import com.henushang.pa.domain.birth_alert.BirthdayInfo;
import com.henushang.pa.service.BirthdayInfoService;
import com.henushang.pa.util.UUIDUtil;

@Controller
@RequestMapping("birth_alert")
public class BirthdayInfoController extends BaseController {

    @Autowired
    private BirthdayInfoService service;
    
    @RequestMapping(value = {"/*", "/index"}, method = RequestMethod.GET)
    public String index() {
        return PREFIX_B_A + "index";
    }
    
    @RequestMapping(value = "birth_list/{id}", method = RequestMethod.GET)
    public String birthList(@PathVariable String id, Model model, HttpServletRequest request) {
        List<BirthdayInfo> list = service.getList(id, 1);
        model.addAttribute("birth_list", list);
        return PREFIX_B_A + "birth_list";
    }
    
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model, HttpServletRequest request) {
        return PREFIX_B_A + "add";
    }
    
    
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST,
            headers = "Accept=*/*", produces = "application/json")
    public Map<String, Object> addPost(Model model, BirthdayInfo birthdayInfo, HttpServletRequest request) {
        birthdayInfo.setUserId("1");
        birthdayInfo.set_id(UUIDUtil.getId());
        boolean result = service.add(birthdayInfo);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success", result);
        return map;
    }
    
    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET,
        headers = "Accept=*/*",produces = "application/json")
    public boolean delete(@PathVariable String id, HttpServletRequest request) {
        boolean result = service.delete(id);
        return result;
    }
}
