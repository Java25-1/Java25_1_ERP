package com.accp.erp;

import com.accp.erp.sunlueming.biz.AdvancegatherBiz;
import com.accp.erp.sunlueming.biz.AdvancegatherdetailsBiz;
import com.accp.erp.sunlueming.pojo.Advancegather;
import com.accp.erp.sunlueming.pojo.Advancegatherdetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErpApplicationTests {
    @Resource
    private AdvancegatherBiz biz;
    @Resource
    private AdvancegatherdetailsBiz aBiz;

    @Test
    public void contextLoads() {
        Advancegather a = new Advancegather();
        //a.setBillid("1234");
        List<Advancegatherdetails> list = aBiz.SelSomeById("2");
        System.out.println(list.size());
    }

}
