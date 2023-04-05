package net.ddns.mvlomonosov.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import net.ddns.mvlomonosov.blog.models.Post;
import net.ddns.mvlomonosov.blog.repo.PostRepository;

import org.springframework.ui.Model;

@Controller
public class BlogController {
    
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blog(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog"; //открываем шаблон blog
    }
}
