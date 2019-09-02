package com.accp.erp.yangtao.action;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.accp.erp.yangtao.biz.GeneralledgerBiz;
import com.accp.erp.yangtao.biz.StorageBiz;
import com.accp.erp.yangtao.pojo.Generalledger;
import com.accp.erp.yangtao.pojo.Materieltype;
import com.accp.erp.yangtao.pojo.Storage;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Generalledger") // 命名空间
public class GeneralledgerAction {

	@Autowired
	private GeneralledgerBiz biz;
	
	
	@GetMapping("query")
	public List<Generalledger> queryPage()throws Exception {
		
		return biz.findMaterieltype();
	}
	
	/*
	 * 
	 */
	@PutMapping("update")
	public Map<String, Object> updateGeneralledger(@RequestBody Generalledger pojo) {
		//System.out.println(pojo);
		biz.modifyGeneralledger(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("insert")
	public Map<String, Object> addGeneralledger(@RequestBody Generalledger pojo) {
		//System.out.println(pojo+"123");
			biz.addGeneralledger(pojo);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	@DeleteMapping("{Genid}")
	public Map<String, Object> deleteGeneralledger(@PathVariable("Genid")String Genid) {
		   System.out.println(Genid);
			biz.deleteGeneralledger(Genid);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	
}
