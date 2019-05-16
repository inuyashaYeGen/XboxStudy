package com.xboxinuyasha.dao;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminUserDao {

        JSONObject selectAdminUser(@Param("name") String name);

}
