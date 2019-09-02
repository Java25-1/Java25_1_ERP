package com.accp.erp.xiangyueheng.action;

import com.accp.erp.xiangyueheng.biz.UserBiz;
import com.accp.erp.xiangyueheng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiangyueheng
 * @create 2019-09-02 11:28
 */
@RestController
@RequestMapping("/api/user")
public class UserAction {
    @Autowired
    private UserBiz userBiz;
    @RequestMapping("/login")
    public User login(String account,String pwd){
        return userBiz.selectByPwdByAccount(account, pwd);
    };
}
