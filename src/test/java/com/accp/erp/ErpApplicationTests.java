package com.accp.erp;

import com.accp.erp.xiangyueheng.biz.UserBiz;
import com.accp.erp.xiangyueheng.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErpApplicationTests {
@Autowired
private UserBiz userBiz;
    @Test
    public void contextLoads() {
        User admin = userBiz.selectByPwdByAccount("admin", "202cb962ac59075b964b07152d234b70");
        System.out.println(admin);
    }

}
