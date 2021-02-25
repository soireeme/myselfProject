package com.example.demo.UseDemo;

import cn.hutool.json.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author soiree
 * @version 1.0
 * @date 2021/2/24 11:14
 * @desp
 */
@RestController
@RequestMapping("api")
public class UserApi {



    @PostMapping("/login")
    public Object login(@RequestBody User userForBase) {
        JSONObject jsonObject = new JSONObject();

        if (userForBase == null) {
            jsonObject.put("message", "登录失败,用户不存在");
            return jsonObject;
        } else {
            if (!userForBase.getPwd().equals(userForBase.getPwd())) {
                jsonObject.put("message", "登录失败,密码错误");
                return jsonObject;
            } else {

                String token = ToeknUtils.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }

    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage() {
        return "你已通过验证";
    }
}