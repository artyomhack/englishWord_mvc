package com.random.englishword.data.entity;

import java.util.List;

public class EnglishWord extends AbstractLanguageWord<String>{

    private final List<String> englishWords;

    public EnglishWord(List<String> list) {
        super(list);
        this.englishWords = list;
    }


    @Override
    public void addWord(String word) {
        super.addWord(word);
    }

    @Override
    public String getRandomFromWords() {
        return super.getRandomFromWords();
    }

    @Override
    public String getWord(int position) {
        return super.getWord(position);
    }

    @Override
    public String getLastWord() {
        return super.getLastWord();
    }

    public List<String> getEnglishWords() {
        return englishWords;
    }
}
