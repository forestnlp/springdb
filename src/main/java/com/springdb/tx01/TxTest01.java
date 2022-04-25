package com.springdb.tx01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Component("test01")
public class TxTest01 {
    @Autowired
    private JdbcTemplate template;
    @Autowired
    private DataSourceTransactionManager txmanager;

    @Transactional
    public void test(){
        TransactionDefinition tfd = new DefaultTransactionDefinition();
        TransactionStatus ts = txmanager.getTransaction(tfd);
        String message="执行成功！";
        try {
            String sql = "insert into task(id,name) values (?,?)";
            template.update(sql,new Object[]{3,"重复任务"});
            template.update(sql,new Object[]{4,"重复任务"});
        }
        catch (Exception e){
            txmanager.rollback(ts);
            message="重复任务，回滚";
            e.printStackTrace();
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        TxTest01 test01 = (TxTest01)ctx.getBean("test01");
        test01.test();
    }
}
