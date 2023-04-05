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
		return "main"; //открываем шаблон main
	}

    @GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "Страница про нас");
		return "about"; //открываем шаблон about
	}

}
