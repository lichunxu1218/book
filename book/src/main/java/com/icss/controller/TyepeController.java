package com.icss.controller;

import com.icss.bean.Type;
import com.icss.service.TypeService;
import com.icss.util.ResResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TyepeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("/getType")
    public ResResult getType() {
        List<Type> list =typeService.getType();
        ResResult rr = null;
        if (list != null) {
            rr = new ResResult(1, "ok", list);
        } else {
            rr = new ResResult(0, "erro");
        }
        return rr;
    }
}