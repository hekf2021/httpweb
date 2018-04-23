package com.controller;

import com.model.InstallMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/and")
public class AndroidController {

    @ResponseBody
    @RequestMapping("/tt")
    public Map<String,List<Map<String,String>>> tt(int pageNo){
        Map<String,List<Map<String,String>>> result = new HashMap<String,List<Map<String,String>>>();
        String[] img={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t"};
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        int pageSize=20;
        for(int i=0;i<pageSize;i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("id", "id"+((pageNo-1)*pageSize+i));
            map.put("name", "jack"+((pageNo-1)*pageSize+i));
            map.put("address", "成都"+((pageNo-1)*pageSize+i));
            map.put("price", "20"+((pageNo-1)*pageSize+i));
            map.put("img", img[i]+".png");
            list.add(map);
        }
        result.put("products",list);
        return result;
    }

    @ResponseBody
    @RequestMapping("/getVersion")
    public Map<String,Object> getVersion(){
        Map<String,Object> map = new HashMap<String,Object>();
        InstallMessage message = new InstallMessage();
        message.setVersionCode(2);
        message.setApkUrl("http://192.168.1.110:8080/apk/myapk.apk");
        map.put("message",message);
        return map;
    }

}
