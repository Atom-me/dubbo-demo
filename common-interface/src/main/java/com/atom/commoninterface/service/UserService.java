package com.atom.commoninterface.service;


import com.atom.commoninterface.bean.UserAddress;

import java.util.List;

/**
 * @author Atom
 */
public interface UserService {

    List<UserAddress> getUserAddressList(String userId);
}
