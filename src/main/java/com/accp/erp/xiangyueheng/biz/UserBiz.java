package com.accp.erp.xiangyueheng.biz;

import com.accp.erp.xiangyueheng.dao.UserMapper;
import com.accp.erp.xiangyueheng.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiangyueheng
 * @create 2019-08-30 21:25
 */
@Service
public class UserBiz {
    @Autowired
    private UserMapper userMapper;
    public User selByPwdAndAcction(String acction,String pwd){
        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.eq("useracction",acction);
        queryWrapper.eq("userpwd",pwd);
        return userMapper.selectOne(queryWrapper);
    }
}
