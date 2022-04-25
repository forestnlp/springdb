package com.springdb.acount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
@Service("AccountServiceError")
public class AccountServiceImpl2 implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    @Transactional
    public int transMoney(int from, int to, int money) {
        int rows=0;
        rows+=accountDao.transMoney(from, 0 - money);
        if(money>100) throw new RuntimeException("转账金额过大");
        rows+=accountDao.transMoney(to, money);        
        return rows;
    }
}
