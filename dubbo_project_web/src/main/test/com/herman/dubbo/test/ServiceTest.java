package com.herman.dubbo.test;

import com.herman.dubbo.model.UserInfo;
import com.herman.dubbo.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author hsh
 * @create 2018-06-27 18:43
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class ServiceTest {
    @Resource
    private UserInfoService userInfoService;

    @Test
    public void getUserInfoTest()throws Exception{
        UserInfo userInfo = userInfoService.getUserInfoByUserId("86CFA7ECA24C4C8198A964F21043BF89");
        if(userInfo==null)
            System.out.println("不存在该用户");
        else
            System.out.println("手机号："+userInfo.getPhone());
    }
}
