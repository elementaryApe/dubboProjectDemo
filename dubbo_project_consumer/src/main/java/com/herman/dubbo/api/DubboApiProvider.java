package com.herman.dubbo.api;

import com.herman.dubbo.application.ApplicationContext;
import com.herman.dubbo.service.UserInfoService;

/**
 * 服务提供者api
 *
 * @author hsh
 * @create 2018-06-28 14:05
 **/
public class DubboApiProvider {

    public final static UserInfoService userinfoService;


    static {
        userinfoService= ApplicationContext.getBean(UserInfoService.class);
    }
}
