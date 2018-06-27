package com.herman.dubbo.service;

import com.herman.dubbo.model.UserInfo;

/**
 * @author hsh
 * @create 2018-06-27 17:46
 **/
public interface UserInfoService {

    /**
     * 根据用户ID获取用户
     */
    UserInfo getUserInfoByUserId(String userInfoId) throws Exception;
}
