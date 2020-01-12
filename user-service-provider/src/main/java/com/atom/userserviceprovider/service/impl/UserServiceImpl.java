package com.atom.userserviceprovider.service.impl;


import com.atom.commoninterface.bean.UserAddress;
import com.atom.commoninterface.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Atom
 */

@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "平西府", "1", "atom", "18518179392", "Yes");
        UserAddress address2 = new UserAddress(2, "白各庄", "1", "sarming", "18518179393", "No");
        return Arrays.asList(address1, address2);
    }
}
