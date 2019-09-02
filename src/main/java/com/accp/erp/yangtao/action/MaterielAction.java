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

import com.accp.erp.yangtao.biz.MaterielBiz;
import com.accp.erp.yangtao.biz.StorageBiz;
import com.accp.erp.yangtao.pojo.Materiel;
import com.accp.erp.yangtao.pojo.Storage;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Materiel") // 命名空间
public class MaterielAction {

	@Autowired
	private MaterielBiz biz;
	
	
	@GetMapping("{p}/{s}")
	public PageInfo<Materiel> queryPage(@PathVariable Integer p, @PathVariable Integer s)throws Exception {
		
		return biz.findMaterielListByPage(p, s);
	}
	
	@GetMapping("{p}/{s}/matname")
	public PageInfo<Materiel> queryPage(@PathVariable Integer p, @PathVariable Integer s,@PathVariable String matname)throws Exception {
		
		return biz.findMaterielListWithNameByPage(matname,p, s);
	}
	
	/*
	 * 
	 */
	@PutMapping("update")
	public Map<String, Object> updateMateriel(@RequestBody Materiel pojo) {
		//System.out.println(pojo);
		biz.modifyMateriel(pojo);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("insert")
	public Map<String, Object> addMateriel(@RequestBody Materiel pojo) {
		//System.out.println(pojo+"123");
			biz.addMateriel(pojo);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	@DeleteMapping("{matid}")
	public Map<String, Object> deleteStorage(@PathVariable("matid")String matid) {
		  // System.out.println(matid);
			biz.deleteMateriel(matid);
			Map<String, Object> message = new HashMap<String, Object>();
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
	}
	
	
}
