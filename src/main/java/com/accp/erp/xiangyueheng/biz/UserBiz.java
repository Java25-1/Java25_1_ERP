package com.accp.erp.xiangyueheng.biz;

import com.accp.erp.xiangyueheng.dao.UserDao;
import com.accp.erp.xiangyueheng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xiangyueheng
 * @create 2019-09-02 11:12
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, isolation = Isolation.READ_COMMITTED)
public class UserBiz {
    @Autowired
    private UserDao dao;
    public User selectByPwdByAccount(String account, String pwd){
        return dao.getuser(account, pwd);
    }
}
