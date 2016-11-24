package jerry.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jerry.model.Question;

@Controller
public class QuestionController {
	
	private ArrayList<Question> questions = new ArrayList<>();
	
	@GetMapping("/qna")
	public String list(Model model){
		model.addAttribute("questions",questions);
		return "/qna/index";
		//.html은 mustache라는 templete engine이 자동으로 붙여준다
	}
	
	@PostMapping("/qna/questions")
	public String questions(Question question){
		System.out.println("writer : " + question);
		questions.add(question);
		return "redirect:/qna";
	}
}
