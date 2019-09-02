package com.accp.erp;

import com.accp.erp.xiangyueheng.biz.UserBiz;
import com.accp.erp.xiangyueheng.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accp.erp.yangtao.biz.ClientBiz;
import com.accp.erp.yangtao.biz.ClienttypeBiz;
import com.accp.erp.yangtao.biz.DepttabBiz;
import com.accp.erp.yangtao.biz.EmpolyeeBiz;
import com.accp.erp.yangtao.biz.GeneralledgerBiz;
import com.accp.erp.yangtao.biz.MaterielBiz;
import com.accp.erp.yangtao.biz.MaterieltypeBiz;
import com.accp.erp.yangtao.biz.ProvideinfoBiz;
import com.accp.erp.yangtao.biz.ProvidetypeBiz;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErpApplicationTests {
	@Autowired
	private EmpolyeeBiz ebiz;
	@Autowired
	private ClienttypeBiz biz;
	@Autowired
	private ClientBiz Cbiz;
	@Autowired
	private DepttabBiz Abiz;
	@Autowired
	private ProvidetypeBiz Ebiz;
	
@Autowired
private UserBiz userBiz;
    @Test
    public void contextLoads() {
    	Ebiz.findStorage();
        User admin = userBiz.selectByPwdByAccount("admin", "202cb962ac59075b964b07152d234b70");
        System.out.println(admin);
    }

}
