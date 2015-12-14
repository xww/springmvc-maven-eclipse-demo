package com.spring.freemarker;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.vo.User;

@Controller
@RequestMapping("/home")
public class FreeMarkerController {

	@RequestMapping("/index")
	public ModelAndView Add(HttpServletRequest request, HttpServletResponse response) {

		User user = new User();
		user.setUsername("zhangsan1");
		user.setPassword("12341");
		User user2 = new User();
		user2.setUsername("zhangsan2");
		user2.setPassword("12342");
		List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user2);
		return new ModelAndView("index", "users", users);
	}

}
