package com.henushang.pa.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henushang.pa.dao.BirthdayInfoDao;
import com.henushang.pa.domain.birth_alert.BirthdayInfo;
import com.henushang.pa.email.MailUtil;
import com.henushang.pa.service.BirthdayInfoService;
import com.henushang.pa.util.DateUtil;

@Service("birthdayInfoService")
public class BirthdayInfoServiceImpl implements BirthdayInfoService {

    @Autowired
    private BirthdayInfoDao dao;

    public boolean add(BirthdayInfo t) {
        return dao.insert(t);
    }

    public boolean delete(String id) {
        return dao.delete(id);
    }

    public BirthdayInfo getOne(String id) {
        return dao.getOne(id);
    }

    public List<BirthdayInfo> getList(String userId, int day) {
        String date = DateUtil.after(day);
        String monthDay = date.substring(5);
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId", userId);
        queryMap.put("monthDay", monthDay);
        
        return dao.getListByQueryMap(queryMap);
    }

    public void sendMail(List<BirthdayInfo> list) {
        for (BirthdayInfo birthdayInfo : list) {
            String msg = "您的好友"+ birthdayInfo.getName() + "明天生日，快去送去你的祝福吧！";
            boolean result = MailUtil.sendTextMail(birthdayInfo.getToEmail(), "好友生日提醒", msg);
            System.out.println(result);
        }
    }
    
    private class SendMailThread implements Runnable {
        private List<BirthdayInfo> list = null;
        public SendMailThread(List<BirthdayInfo> list) {
            this.list = list;
        }
        
        public void run() {
            for (BirthdayInfo birthdayInfo : list) {
                String msg = "您的好友"+ birthdayInfo.getName() + "明天生日，快去送去你的祝福吧！";
                boolean result = MailUtil.sendTextMail(birthdayInfo.getToEmail(), "好友生日提醒", msg);
                System.out.println(result);
            }
        }
    }
}
