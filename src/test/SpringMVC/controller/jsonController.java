package test.SpringMVC.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.SpringMVC.model.User;

/**
 * ����json��ʽ���ַ���
 * @author pactera
 *
 */

@Controller
@RequestMapping("/json")
public class jsonController {

	// ����json��ʽ���ַ���
	@ResponseBody
    @RequestMapping("/user")
    public User getUser(){
        User u = new User();
        u.setId(1);
        u.setName("jayjay");
        u.setBirth(new Date());
        return u;
    }
	
	// �쳣����ʵ��
	@RequestMapping("/error")
    public String error(){
        int i = 5/0;
        return "hello";
    }
}
