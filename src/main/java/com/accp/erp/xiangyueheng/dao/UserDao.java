package com.accp.erp.xiangyueheng.dao;

import com.accp.erp.xiangyueheng.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiangyueheng
 * @create 2019-09-02 11:08
 */
public interface UserDao extends BaseMapper<User> {
    public User getuser(@Param("ac")String account, @Param("pws")String pwd);
}
