package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.mit.dao.TwoVO;
import lombok.extern.log4j.Log4j;


@Controller
@Log4j
public class QuizController {
	
	@GetMapping("/quiz/quiz1")
	public void quiz(Model model) {
		model.addAttribute("today", "오늘은 금요일");		
	}
	
	@GetMapping("/quiz/quiz2")
	public void quiz2() {
		
	}
	
	@PostMapping("/quiz/quiz2")
	public void quiz2(TwoVO vo) {
		log.info("수집된 내용:"+vo);
	}

}
