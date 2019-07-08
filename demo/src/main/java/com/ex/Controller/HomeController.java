package com.ex.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {


	@ResponseBody
    @RequestMapping("/")
    public Map<String,String> home(){

		Map<String,String>  map = new HashMap<>();
        map.put("name","1111");
        map.put("age","31");
        
		System.out.println("home coming");

        

        return map;

    }

}
