package com.accp.erp;

import com.accp.erp.xiangyueheng.biz.UserBiz;
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
    userBiz.selByPwdAndAcction("Admin","123");
    }

}
