package com.herman.dubbo.test;

import com.herman.dubbo.api.DubboApiProvider;
import com.herman.dubbo.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author hsh
 * @create 2018-06-28 15:15
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class DubboTest {

    @Test
    public void getUserInfo() throws Exception {
        UserInfo userInfo = DubboApiProvider.userinfoService.getUserInfoByUserId("86CFA7ECA24C4C8198A964F21043BF89");
        System.out.println(userInfo.getPhone());
    }
}
