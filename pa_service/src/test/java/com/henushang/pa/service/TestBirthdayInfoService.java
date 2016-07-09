package com.henushang.pa.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.henushang.pa.domain.birth_alert.BirthdayInfo;

public class TestBirthdayInfoService {

    private static ApplicationContext context = null;
    private static BirthdayInfoService service;
    static {
        context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        service = (BirthdayInfoService) context.getBean("birthdayInfoService");
    }
    
    @Ignore
    @Test
    public void testT() {
        List<BirthdayInfo> list = service.getList("", 1);
        Assert.assertEquals(1, list.size());
        System.out.println(list.get(0));
        service.sendMail(list);
    }
}
