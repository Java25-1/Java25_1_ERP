package com.accp.erp;

import com.accp.erp.sunlueming.biz.AdvancegatherBiz;
import com.accp.erp.sunlueming.pojo.Advancegather;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErpApplicationTests {
    @Resource
    private AdvancegatherBiz biz;

    @Test
    public void contextLoads() {
        Advancegather a = new Advancegather();
        //a.setBillid("1234");
        biz.SelAll();

    }

}
