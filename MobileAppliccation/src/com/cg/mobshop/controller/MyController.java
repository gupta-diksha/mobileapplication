package com.cg.mobshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.service.IServiceMobile;

@Controller
public class MyController 
{
	
	@Autowired
	IServiceMobile servObj;
	
	
	@RequestMapping("getmoblist")
	public String showMobileList(Model model)
	{
		List<Mobiles> list = servObj.getAllMobiles();
		model.addAttribute("list",list);
		return "Home";
	}
	
	@RequestMapping("getUpdatePage")
	public String sendUpdatePage(@RequestParam("mobid") int mobid,Model model)
	{
		Mobiles mobile = servObj.getMobileDetails(mobid);
		if(mobile ==null)
		{
			model.addAttribute("errormsg","Mobile id is not valid");
			return "Error";
		}
		else
		{	
			model.addAttribute("mobile", mobile);
			return "Update";
		}
	}
	
	@RequestMapping("updateMobileAction")
	public String updateMobile(@ModelAttribute("mobile")Mobiles mobile,Model model )
	{
		int id;
		id= servObj.updateMobile(mobile);
		
		List<Mobiles> list = servObj.getAllMobiles();
		model.addAttribute("list",list);
		
		return "Home";
	}
	
	
	
	
	@RequestMapping("delete")
	public String deleteMobile(@RequestParam("mobid") int mobid,Model model)
	{
		List<Mobiles> list = servObj.delete(mobid);
		model.addAttribute("list",list);
		return "Home";
	}
	
	

}
