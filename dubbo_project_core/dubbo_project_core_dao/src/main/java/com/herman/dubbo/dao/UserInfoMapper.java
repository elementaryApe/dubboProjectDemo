package com.herman.dubbo.dao;

import com.herman.dubbo.model.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by hsh on 2018/6/27.
 */
public interface UserInfoMapper {

    UserInfo selectByPrimaryKey(String userId) ;
}
