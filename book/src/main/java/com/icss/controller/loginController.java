package com.icss.controller;

import com.icss.service.ShopService;
import com.icss.service.UserService;
import com.icss.util.ResResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

    @Autowired
    private UserService userService;

    @Autowired
    private ShopService shopService;

    @RequestMapping("/login")
    public ResResult login(String name, String pwd, Integer type) {
        Object obj = new Object();
        if (type == 1) {
            obj = userService.loginUser(name, pwd);
        } else {
            obj = shopService.loginShop(name, pwd);
        }
        ResResult rr = null;
        if (obj != null) {
            rr = new ResResult(1, "ok", obj);
        } else {
            rr = new ResResult(0, "erro");
        }
        return rr;
    }

}
