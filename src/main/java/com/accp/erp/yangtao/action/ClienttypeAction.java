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

import com.accp.erp.yangtao.biz.ClienttypeBiz;
import com.accp.erp.yangtao.biz.StorageBiz;
import com.accp.erp.yangtao.pojo.Clienttype;
import com.accp.erp.yangtao.pojo.Providetype;
import com.accp.erp.yangtao.pojo.Storage;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Clienttype") // 命名空间
public class ClienttypeAction {

	@Autowired
	private ClienttypeBiz biz;
	
	
	@GetMapping("/query")
	public List<Clienttype> queryPage()throws Exception {
		
		return biz.findClienttype();
	}
	
	/*
	 * 
	 */
	@PutMapping("update")
	public Map<String, Object> updateClienttype(@RequestBody Clienttype pojo) {
		//System.out.println(pojo);
		biz.modifyClienttype(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("insert")
	public Map<String, Object> addClienttype(@RequestBody Clienttype pojo) {
		//System.out.println(pojo+"123");
			biz.addClienttype(pojo);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	@DeleteMapping("{clitypeid}")
	public Map<String, Object> deleteClienttype(@PathVariable("clitypeid")String clitypeid) {
		   System.out.println(clitypeid);
			biz.deleteClienttype(clitypeid);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	
}
