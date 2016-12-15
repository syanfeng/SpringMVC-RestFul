package test.SpringMVC.integrate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.SpringMVC.model.User;

@Controller
@RequestMapping("/integrate")
public class UserController {

	@Autowired
    private UserService userService;
	
	@ResponseBody
	@RequestMapping("/user")
    public User saveUser(@RequestBody @ModelAttribute User u){
        System.out.println(u);
        userService.save();
        return u;
    }
}
