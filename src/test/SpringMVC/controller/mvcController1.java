package test.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class mvcController1 {

	// 使用@RequestParam注解指定参数的name
	@RequestMapping(value="/param")
    public String testRequestParam(@RequestParam(value="id") Integer id,
            @RequestParam(value="name")String name){
        System.out.println(id+" "+name);
        return "/hello";
    }
}
