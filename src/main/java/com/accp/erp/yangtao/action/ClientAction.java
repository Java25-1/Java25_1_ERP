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

import com.accp.erp.yangtao.biz.ClientBiz;
import com.accp.erp.yangtao.biz.StorageBiz;
import com.accp.erp.yangtao.pojo.Client;
import com.accp.erp.yangtao.pojo.Storage;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Client") // 命名空间
public class ClientAction {

	@Autowired
	private ClientBiz biz;
	
	
	@GetMapping("{p}/{s}")
	public PageInfo<Client> queryPage(@PathVariable Integer p, @PathVariable Integer s)throws Exception {
		
		return biz.findClientListByPage(p, s);
	}
	
	@GetMapping("{p}/{s}/Cliname")
	public PageInfo<Client> queryPage(@PathVariable Integer p, @PathVariable Integer s,@PathVariable String Cliname)throws Exception {
		
		return biz.findClientListWithNameByPage(Cliname,p, s);
	}
	
	/*
	 * 
	 */
	@PutMapping("update")
	public Map<String, Object> updateClient(@RequestBody Client pojo) {
		//System.out.println(pojo);
		biz.modifyClient(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("insert")
	public Map<String, Object> addClient(@RequestBody Client pojo) {
		//System.out.println(pojo+"123");
			biz.addClient(pojo);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	@DeleteMapping("{cliid}")
	public Map<String, Object> deleteStorage(@PathVariable("cliid")String cliid) {
		   System.out.println(cliid);
			biz.deleteClient(cliid);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	
}
