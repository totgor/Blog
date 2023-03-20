package net.ddns.mvlomonosov.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//контроллер обрабатывающий запрос
@Controller
public class MainController {

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("title", "Главная страница");
		return "main"; //открываем шаблон
	}

    @GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "Про нас");
		return "main"; //открываем шаблон
	}

}
