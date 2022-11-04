package com.random.englishword.mvc.controller;

import com.random.englishword.data.entity.EnglishWord;
import com.random.englishword.mvc.service.RandomServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/language")
public class FirstController {

    private final RandomServiceImpl<EnglishWord> randomServiceEN;

    public FirstController(RandomServiceImpl<EnglishWord> randomServiceEN) {
        this.randomServiceEN = randomServiceEN;
    }

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
