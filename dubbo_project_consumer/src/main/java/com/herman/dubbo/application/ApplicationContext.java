package com.herman.dubbo.application;

import com.herman.dubbo.model.UserInfo;
import com.herman.dubbo.service.UserInfoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 消费者
 *
 * @author hsh
 * @create 2018-06-28 13:55
 **/
public class ApplicationContext {
    private static ApplicationContext applicationContext = new ApplicationContext();
    private static ClassPathXmlApplicationContext classPathXmlApplicationContext = null;

    private ApplicationContext() {
    }

    public static ApplicationContext getInstance() {
        return applicationContext;
    }

    public void start() {
        if (classPathXmlApplicationContext == null) {
            classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:config/dubbo_consumer.xml");
            classPathXmlApplicationContext.start();
        }
    }

    public static <T> T getBean(Class<T> cla) {
        if(classPathXmlApplicationContext==null){
            ApplicationContext.getInstance().start();
        }
        return classPathXmlApplicationContext.getBean(cla);
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext.getInstance().start();
        UserInfoService bean = getBean(UserInfoService.class);
        UserInfo user = bean.getUserInfoByUserId("86CFA7ECA24C4C8198A964F21043BF89");
        if (user != null)
            System.out.println(user.getPhone());
    }


}
