package com.springdb.acount;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestTx {
    @Test()
    public void testTransaction(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
//        AccountService accountService = (AccountService) context.getBean("AccountServiceError");
        AccountService accountService = (AccountService) context.getBean("AccountService");
        accountService.transMoney(1,2,111);
    }
}