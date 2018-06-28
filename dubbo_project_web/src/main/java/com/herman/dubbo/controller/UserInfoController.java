package com.herman.dubbo.controller;

import com.herman.dubbo.api.DubboApiProvider;
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


    @RequestMapping(value = "{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Result getUserInfoById(@PathVariable("userId") String userId,
                                  @RequestParam(value = "status", required = false) String status) {
        Result<UserInfo> result = new Result<>();
        try {
            UserInfo userInfo = DubboApiProvider.userinfoService.getUserInfoByUserId(userId);
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

    @RequestMapping(value = "/exist/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Result userExits(@PathVariable("userId") String userId) {
        Result<Boolean> result = new Result<>();
        try {
            result.setResult( DubboApiProvider.userinfoService.userExits(userId));
            result.isSuccess(Boolean.TRUE);
            result.setMessage("成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("出错了！");
            return result;
        }
        return result;
    }

    @RequestMapping(value = "name", method = RequestMethod.GET)
    @ResponseBody
    public Result getUserName(@RequestParam("userId") String userId) {
        Result<String> result = new Result<>();
        try {
            result.setResult( DubboApiProvider.userinfoService.getUserName(userId));
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
