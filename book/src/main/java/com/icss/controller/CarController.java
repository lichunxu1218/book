package com.icss.controller;

import com.icss.bean.Car;
import com.icss.service.CarService;
import com.icss.util.ResResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/shopcar")
public class CarController {
    @Autowired
    private CarService carService;
    //加入购物车
    @RequestMapping("/addCar")
    public ResResult addCar(Integer uid,Integer bid){
        Car car = new Car();
        car.setUid(uid);
        car.setBid(bid);
        car.setAddtime(new Date());
        int i =carService.insert(car);
        ResResult rr=null;
        if (i > 0) {
             rr= new ResResult(1, "ok");
        } else {
            rr = new ResResult(0, "error");
        }
        return rr;
    }
}
