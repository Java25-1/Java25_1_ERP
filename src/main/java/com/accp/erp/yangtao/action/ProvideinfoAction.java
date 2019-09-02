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

import com.accp.erp.yangtao.biz.ProvideinfoBiz;
import com.accp.erp.yangtao.biz.StorageBiz;
import com.accp.erp.yangtao.pojo.Provideinfo;
import com.accp.erp.yangtao.pojo.Storage;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Provideinfo") // 命名空间
public class ProvideinfoAction {

	@Autowired
	private ProvideinfoBiz biz;
	
	
	@GetMapping("{p}/{s}")
	public PageInfo<Provideinfo> queryPage(@PathVariable Integer p, @PathVariable Integer s)throws Exception {
		
		return biz.findProvideinfoListByPage(p, s);
	}
	
	@GetMapping("{p}/{s}/peoname")
	public PageInfo<Provideinfo> queryPage(@PathVariable Integer p, @PathVariable Integer s,@PathVariable String peoname)throws Exception {
		
		return biz.findProvideinfoListWithNameByPage(peoname,p, s);
	}
	
	/*
	 * 
	 */
	@PutMapping("update")
	public Map<String, Object> updateProvideinfo(@RequestBody Provideinfo pojo) {
		System.out.println(pojo);
		biz.modifyProvideinfo(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("insert")
	public Map<String, Object> addProvideinfo(@RequestBody Provideinfo pojo) {
		//System.out.println(pojo+"123");
			biz.addProvideinfo(pojo);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	@DeleteMapping("{stoid}")
	public Map<String, Object> deleteProvideinfo(@PathVariable("peoid")String peoid) {
		   System.out.println(peoid);
			biz.deleteProvideinfo(peoid);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	
}
