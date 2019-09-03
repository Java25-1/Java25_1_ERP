package com.accp.erp.yangtao.action;

import java.io.File;
import java.util.HashMap;
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

import com.accp.erp.yangtao.biz.EmpolyeeBiz;
import com.accp.erp.yangtao.biz.StorageBiz;
import com.accp.erp.yangtao.pojo.Empolyee;
import com.accp.erp.yangtao.pojo.Storage;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Empolyee") // 命名空间
public class EmpolyeeAction {

	@Autowired
	private EmpolyeeBiz biz;
	
	
	@GetMapping("{p}/{s}")
	public PageInfo<Empolyee> queryPage(@PathVariable Integer p, @PathVariable Integer s)throws Exception {
		
		return biz.findEmpolyeeListByPage(p, s);
	}
	
	@GetMapping("{p}/{s}/Empname")
	public PageInfo<Empolyee> queryPage(@PathVariable Integer p, @PathVariable Integer s,@PathVariable String Empname)throws Exception {
		
		return biz.findEmpolyeeListWithNameByPage(Empname,p, s);
	}
	
	/*
	 * 
	 */
	@PutMapping("update")
	public Map<String, Object> updateEmpolyee(@RequestBody Empolyee pojo) {
		//System.out.println(pojo);
		biz.modifyEmpolyee(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("insert")
	public Map<String, Object> addEmpolyee(@RequestBody Empolyee pojo) {
		//System.out.println(pojo+"123");
			biz.addEmpolyee(pojo);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	@DeleteMapping("{stoid}")
	public Map<String, Object> deleteEmpolyee(@PathVariable("Empid")String Empid) {
		   System.out.println(Empid);
			biz.deleteEmpolyee(Empid);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	
}
