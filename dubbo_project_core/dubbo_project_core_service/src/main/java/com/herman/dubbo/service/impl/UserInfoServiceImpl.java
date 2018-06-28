package com.herman.dubbo.service.impl;

import com.herman.dubbo.dao.UserInfoMapper;
import com.herman.dubbo.model.UserInfo;
import com.herman.dubbo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hsh
 * @create 2018-06-27 17:47
 **/
//@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo getUserInfoByUserId(String userInfoId) throws Exception {
        return userInfoMapper.selectByPrimaryKey(userInfoId);
    }

    @Override
    public boolean userExits(String userId) throws Exception {
        return userInfoMapper.selectByPrimaryKey(userId) == null;
    }

    @Override
    public String getUserName(String userId) throws Exception {
        if (userExits(userId)) {
            String name = getUserInfoByUserId(userId).getName();
            return  name== null ? "没有起名字" : name;
        }
        return null;
    }
}
