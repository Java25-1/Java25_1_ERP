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

import com.accp.erp.yangtao.biz.DepttabBiz;
import com.accp.erp.yangtao.biz.StorageBiz;
import com.accp.erp.yangtao.pojo.Depttab;
import com.accp.erp.yangtao.pojo.Providetype;
import com.accp.erp.yangtao.pojo.Storage;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Depttab") // 命名空间
public class DepttabAction {

	@Autowired
	private DepttabBiz biz;
	
	
	@GetMapping("query")
	public List<Depttab> queryPage()throws Exception {
		
		return biz.findDepttab();
	}
	
	/*
	 * 
	 */
	@PutMapping("update")
	public Map<String, Object> updateDepttab(@RequestBody Depttab pojo) {
		//System.out.println(pojo);
		biz.modifyDepttab(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("insert")
	public Map<String, Object> addDepttab(@RequestBody Depttab pojo) {
		//System.out.println(pojo+"123");
			biz.addDepttab(pojo);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	@DeleteMapping("{Depid}")
	public Map<String, Object> deleteDepttab(@PathVariable("Depid")String Depid) {
		   System.out.println(Depid);
			biz.deleteDepttab(Depid);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	
}
