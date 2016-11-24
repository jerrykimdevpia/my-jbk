package jerry.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jerry.model.User;

@Controller
public class UserController {
	
	private ArrayList<User> users = new ArrayList<>();
	
	@GetMapping("/user")
	public String list(Model model){
		model.addAttribute("users",users);
		return "/user/list";
		//.html은 mustache라는 templete engine이 자동으로 붙여준다
	}
	
	@PostMapping("/user/create")
	public String create(User user) {
		System.out.println("userId : " + user);
		users.add(user);
		return "redirect:/user";
	}
}
