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

import com.accp.erp.yangtao.biz.ProvidetypeBiz;
import com.accp.erp.yangtao.biz.StorageBiz;
import com.accp.erp.yangtao.pojo.Providetype;
import com.accp.erp.yangtao.pojo.Storage;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Providetype") // 命名空间
public class ProvidetypeAction {

	@Autowired
	private ProvidetypeBiz biz;
	
	
	@GetMapping("query")
	public List<Providetype> queryPage()throws Exception {
		
		return biz.findStorage();
	}
	
	/*
	 * 
	 */
	@PutMapping("update")
	public Map<String, Object> updateProvidetype(@RequestBody Providetype pojo) {
		//System.out.println(pojo);
		biz.modifyProvidetype(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("insert")
	public Map<String, Object> addProvidetype(@RequestBody Providetype pojo) {
		//System.out.println(pojo+"123");
			biz.addProvidetype(pojo);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	@DeleteMapping("{peeid}")
	public Map<String, Object> deleteStorage(@PathVariable("stoid")String peeid) {
		   System.out.println(peeid);
			biz.deleteProvidetype(peeid);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	
}
