package com.controller;

import com.domain.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //主页
    @RequestMapping("/login")
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("accountList", accountList);
        modelAndView.setViewName("login");
        return modelAndView;
    }

    //选择操作
    @RequestMapping("/choice")
    public  String choice(){
        return "choice";
    }

    //选择  保存操作
    @RequestMapping("/saveuser")
    public  String saveuser(){
        return "save";
    }
    //选择   单个查询操作
    @RequestMapping("/findByIduser")
    public  String findByIduser(){
        return "findById";
    }
   // 选择   更新所选操作
    @RequestMapping("/updateByIduser")
    public ModelAndView updateByIduser(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("accountList", accountList);
        modelAndView.setViewName("updateuserList");
        return modelAndView;
    }

    @RequestMapping("/deleteByIduser")
    public ModelAndView deleteByIduser(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("accountList", accountList);
        modelAndView.setViewName("deleteuserList");
        return modelAndView;
    }

    //保存
    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
//    @ResponseBody//表示字符串直接进行展示
    public String save(Account account){

        if(account.getName()==null || account.getMoney()==null){
            return "save";
        }else{
            accountService.save(account);
        }
        return "success";
    }

    //查询单个
    @RequestMapping("/findById")
    public ModelAndView findById(Account account){
        List<Account> accountList = accountService.findById(account.getId());
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("accountList", accountList);
        modelAndView.setViewName("login");
        return modelAndView;
    }


    //更新数据
    @RequestMapping("/updateById")
    public String updateById(Account account){
        accountService.updateById(account);
        return "success";
    }

    //删除数据
    @RequestMapping("/deleteById")
    public String deleteById(Account account){
        accountService.deleteById(account.getId());
        return "success";
    }
}
