package com.random.englishword.mvc.controller;

import com.random.englishword.data.entity.EnglishWord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/language")
public class FirstController {



    @GetMapping("/")
    public String languagePage() {
        return "language";
    }

    @GetMapping("/randomWordEN")
    public String getRandomWordEN(Model model) {

        model.addAttribute("wordEN");

        return "en_randomWord";
    }
}
