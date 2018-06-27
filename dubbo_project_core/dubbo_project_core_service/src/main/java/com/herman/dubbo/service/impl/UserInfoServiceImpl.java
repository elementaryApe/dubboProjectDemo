package com.herman.dubbo.service.impl;

import com.herman.dubbo.dao.UserInfoMapper;
import com.herman.dubbo.model.UserInfo;
import com.herman.dubbo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hsh
 * @create 2018-06-27 17:47
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo getUserInfoByUserId(String userInfoId) throws Exception {
        return userInfoMapper.selectByPrimaryKey(userInfoId);
    }
}
