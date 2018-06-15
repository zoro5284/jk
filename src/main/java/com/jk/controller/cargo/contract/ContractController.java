package com.jk.controller.cargo.contract;

import com.jk.pojo.Contract;
import com.jk.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.List;

@Controller
public class ContractController {
    @Autowired
    private ContractService service;

    @RequestMapping("/cargo/contract/list")
    public String list(Model model){
        List<Contract> dataList = service.find(null);
        model.addAttribute("dataList",dataList);
        return "/cargo/contract/jContractList.jsp";
    }

    @RequestMapping("/cargo/contract/tocreate")
    public String toCreat(){
        return "/cargo/contract/jContractCreate.jsp";
    }

   @RequestMapping("/cargo/contract/insert")
    public String insert(Contract contract){
       System.out.println("CustomName="+contract.getCustomName());
        service.insert(contract);
        return  "redirect:/cargo/contract/list.action";
   }

   @RequestMapping("/cargo/contract/toupdate")
    public String toUpdate(Model model,String id){
        Contract contract = service.get(id);
        model.addAttribute("obj",contract);
        return "/cargo/contract/jContractUpdate.jsp";
   }

   @RequestMapping("/cargo/contract/update")
    public String update(Contract contract){
        service.update(contract);
        return "redirect:/cargo/contract/list.action";
   }

   @RequestMapping("/cargo/contract/delete")
    public String delete(@RequestParam("id") String[] ids){
        service.delete(ids);
        return "redirect:/cargo/contract/list.action";
   }

   @RequestMapping("/cargo/contract/deleteById")
    public String deleteById(String id){
        service.deleteById(id);
        return "redirect:/cargo/contract/list.action";
   }

   @RequestMapping("/cargo/contract/submit")
    public String submit(@RequestParam("id")String[] ids){
        service.submit(ids);
        return "redirect:/cargo/contract/list.action";
   }
   @RequestMapping("/cargo/contract/cancel")
    public String cancel(@RequestParam("id")Serializable[] ids){
        service.cancel(ids);
       return "redirect:/cargo/contract/list.action";
   }

   @RequestMapping("cargo/contract/toview")
    public String toView(Model model,String id){
        Contract contract = service.get(id);
        model.addAttribute("obj",contract);
        return "/cargo/contract/jContractView.jsp";


   }


}
