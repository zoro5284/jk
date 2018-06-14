package com.jk.controller.basicinfo.factory;

import java.util.List;

import com.jk.service.impl.FactoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jk.pojo.Factory;
import com.jk.service.FactoryService;

@Controller
//@Configuration
public class FactoryController {
	@Autowired
	@Qualifier("factoryservice")
	private FactoryService factoryService;
	
	@RequestMapping("/basicinfo/factory/list")
	public ModelAndView list(){
			List<Factory> dataList = factoryService.find(null);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("dataList", dataList);
			modelAndView.setViewName("/basicinfo/factory/jFactoryList.jsp");
			return modelAndView;
	}
	
	@RequestMapping("/basicinfo/factory/tocreate")
	public String tocreate(){
		return "/basicinfo/factory/jFactoryCreate.jsp";
	}
	
	@RequestMapping("/basicinfo/insert.action")
//	@RequestMapping("/basicinfo/factory/insert.action")

	public String  insert(Factory factory){
		factoryService.insert(factory);
		System.out.println("factoryId="+factory.getId());
		System.out.println("factoryName="+factory.getFactoryName());
		System.out.println(factory.getFullName());
		return "redirect:/basicinfo/factory/list.action";
				
	}
	
	@RequestMapping("/basicinfo/factory/toupdate")
	public ModelAndView toupdate(String id){
		ModelAndView modelAndView = new ModelAndView();
		Factory obj = factoryService.get(id);
		modelAndView.addObject("obj", obj);
		modelAndView.setViewName("/basicinfo/factory/jFactoryUpdate.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/basicinfo/factory/update.action")
	public String update(Factory factory){
		System.out.println("factoryFullName"+factory.getFullName());
		System.out.println("factoryName"+factory.getFactoryName());
		factoryService.update(factory);
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/deleteById")//好像没有用到，能用单个删的都可以使用下面一个传一个ids数组删除
	public String deleteById(String id){
		factoryService.deleteById(id);
		return "redirect:/basicinfo/factory/list.action";
		
	}
	
	@RequestMapping("/basicinfo/factory/delete")
	public String delete(@RequestParam("id")String[] ids ){
		factoryService.delete(ids);
		return "redirect:/basicinfo/factory/list.action";		
	}
	
	@RequestMapping("basicinfo/factory/toview")
	public String view(String id,Model model){
		Factory factory = factoryService.get(id);
		model.addAttribute("obj", factory);
		return "/basicinfo/factory/jFactoryView.jsp";		
	}
	
	@RequestMapping("basicinfo/factory/start")
	public String  start(@RequestParam("id")String[] ids){
		factoryService.start(ids);
		return "redirect:/basicinfo/factory/list.action";		
	}
	@RequestMapping("basicinfo/factory/stop")
	public String  stop(@RequestParam("id")String[] ids){
		factoryService.stop(ids);
		return "redirect:/basicinfo/factory/list.action";		
	}
}
