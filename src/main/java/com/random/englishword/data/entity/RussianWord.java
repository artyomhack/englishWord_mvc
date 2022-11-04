package com.random.englishword.data.entity;

import java.util.List;

public class RussianWord extends AbstractLanguageWord<String>{

    private final List<String> russianWords;

    public RussianWord(List<String> list) {
        super(list);
        this.russianWords = list;
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

    public List<String> getRussianWords() {
        return russianWords;
    }
}
