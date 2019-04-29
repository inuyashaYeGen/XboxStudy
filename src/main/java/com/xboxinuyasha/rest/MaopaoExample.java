package com.xboxinuyasha.rest;

import com.alibaba.fastjson.JSONObject;
import com.xboxinuyasha.bean.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("maopaoExample")
@RequestMapping("/api/example")
public class MaopaoExample {
    @RequestMapping(method = RequestMethod.GET, value = "/maopao")
    public JsonResult<JSONObject> selectUserTest() {
        JSONObject user = new JSONObject();
        int[] intList = new int[]{15, 25, 8, 9, 11, 33, 21, 7, 5, 6, 12, 13, 4};
        int temp = 0;
        //从小到大
        for (int i = 0; i < intList.length; i++) {
            for (int k = i + 1; k < intList.length; k++) {
                if (intList[i] > intList[k]) {
                    temp = intList[i];
                    intList[i] = intList[k];
                    intList[k] = temp;
                }
            }
        }
        user.put("intList", intList);
        user.put("maotest", "maotest");
        return JsonResult.success(user);
    }
}
