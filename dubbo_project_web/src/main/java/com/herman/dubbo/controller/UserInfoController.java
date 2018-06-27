package com.herman.dubbo.controller;

import com.herman.dubbo.model.Result;
import com.herman.dubbo.model.UserInfo;
import com.herman.dubbo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author hsh
 * @create 2018-06-27 19:40
 **/
@Controller
@RequestMapping("user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Result getUserInfoById(@PathVariable("userId") String userId,
                                  @RequestParam(value = "status", required = false) String status) {
        Result<UserInfo> result = new Result<>();
        try {
            UserInfo userInfo = userInfoService.getUserInfoByUserId(userId);
            result.setResult(userInfo);
            result.isSuccess(Boolean.TRUE);
            result.setMessage("成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("出错了！");
            return result;
        }
        return result;

    }
}