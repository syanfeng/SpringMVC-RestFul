package test.SpringMVC.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.SpringMVC.model.User;

@Controller
@RequestMapping("/form")
public class formController {
	@RequestMapping(value="/add",method=RequestMethod.POST)    
    public String add(@Valid User u,BindingResult br){
        if(br.getErrorCount()>0){            
            return "addUser";
        }
        return "showUser";
    }
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
    public String add(Map<String,Object> map){
        map.put("user",new User());
        return "addUser";
    }
}
