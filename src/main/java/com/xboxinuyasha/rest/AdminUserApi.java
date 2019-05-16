package com.xboxinuyasha.rest;

import com.alibaba.fastjson.JSONObject;
import com.xboxinuyasha.bean.JsonResult;
import com.xboxinuyasha.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminUserApi")
@RequestMapping("/api/admin")
public class AdminUserApi {

    @Autowired
    @Qualifier("adminUserService")
    private AdminUserService adminUserService;

    /**
     * 查询管理员用户
     * @param name
     * @return 管理员用户数据
     */
    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public JsonResult<JSONObject> selectAdminUser(@RequestParam(required = false) String name) {
        return JsonResult.success(adminUserService.selectAdminUser(name));
    }

}
