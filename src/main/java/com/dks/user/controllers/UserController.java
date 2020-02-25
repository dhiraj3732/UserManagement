package com.dks.user.controllers;

import com.dks.user.business.UserBusiness;
import com.dks.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserBusiness userBusiness;

    @GetMapping(path = "/getUser", produces = "application/json")
    public UserVo getUser(@RequestParam(value = "empId", defaultValue = "1") int empId){
        return userBusiness.getUser(empId);
    }

}
