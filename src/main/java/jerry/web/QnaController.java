package jerry.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jerry.model.Question;

@Controller
public class QuestionController {

	@PostMapping("/qna/questions")
	public String questions(Question question){
		System.out.println("writer : " + question);
		return "";
	}
}
