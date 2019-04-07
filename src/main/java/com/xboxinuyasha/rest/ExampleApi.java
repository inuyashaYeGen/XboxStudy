package com.xboxinuyasha.rest;

import com.alibaba.fastjson.JSONObject;
import com.xboxinuyasha.bean.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("exampleApi")
@RequestMapping("/api/example")
public class ExampleApi {

    @RequestMapping(method = RequestMethod.GET, value = "/user/test")
    public JsonResult<JSONObject> selectUserTest() {
        JSONObject user = new JSONObject();
        user.put("username", "yegen");
        user.put("password", "521100");
        if (user.isEmpty()) {
            return JsonResult.error(0, "网络错误");
        }
        return JsonResult.success(user);
    }
}
