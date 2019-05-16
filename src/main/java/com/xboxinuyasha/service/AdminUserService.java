package com.xboxinuyasha.service;

import com.alibaba.fastjson.JSONObject;
import com.xboxinuyasha.dao.AdminUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminUserService")
public class AdminUserService {

    @Autowired
    AdminUserDao adminUserDao;

    /**
     * 查询管理员用户
     * @param name
     * @return 管理员用户数据
     */
    public JSONObject selectAdminUser(String name) {
       return adminUserDao.selectAdminUser(name);
    }

}
