package com.henushang.pa.email;

import java.util.Properties;

import javax.mail.Authenticator;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.apache.log4j.Logger;

import com.henushang.pa.util.PropertiesUtil;

public class MailUtil {

    private static Logger logger = Logger.getLogger(MailUtil.class);
    private static Email simpltEmail = new SimpleEmail();
    
    static {
        initMail(simpltEmail);
    }
    
    public static boolean sendTextMail(String toAddress, String subject, String msg) {
        try {
            simpltEmail.setSubject(subject);
            simpltEmail.setMsg(msg);
            simpltEmail.addTo(toAddress);
            simpltEmail.send();
        } catch (Exception e) {
            logger.error("send msg error!", e);
            return true;
        }
        return true;
    }
    
    private static void initMail(Email email) {
        Properties properties  = PropertiesUtil.getProperties("mail.properties");
        email.setHostName(properties.get("smtp.host.name").toString());
        String smtpPort = properties.getProperty("smtp.port").toString();
        email.setSmtpPort(Integer.parseInt(smtpPort));
        Authenticator authen = new DefaultAuthenticator(
                properties.get("authen.username").toString(), 
                properties.get("authen.pwd").toString());
        email.setAuthenticator(authen);
        email.setSSLOnConnect(true);
        try {
            email.setFrom(properties.get("mail.from").toString());
        } catch (EmailException e) {
            logger.error("init email error!", e);
        }
    }
    
    public static void main(String[] args) {
        sendTextMail("henushang@qq.com", "生日提醒", "您的好友明天生日，快点去送去祝福吧！");
    }
}
