package com.atom.orderserviceconsumer.controller;

import com.atom.commoninterface.bean.UserAddress;
import com.atom.commoninterface.service.OrderService;
import com.atom.commoninterface.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Atom
 */
@Controller
public class OrderController {

    @Resource
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        return orderService.initOrder(userId);
    }
}
