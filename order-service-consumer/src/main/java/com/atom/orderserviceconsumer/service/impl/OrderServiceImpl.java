package com.atom.orderserviceconsumer.service.impl;


import com.atom.commoninterface.bean.UserAddress;
import com.atom.commoninterface.service.OrderService;
import com.atom.commoninterface.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Atom
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        // 查询用户收货地址
        return userService.getUserAddressList(userId);
    }
}
