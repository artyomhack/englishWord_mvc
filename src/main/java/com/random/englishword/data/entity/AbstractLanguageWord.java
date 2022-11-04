package com.random.englishword.data.entity;

import com.random.englishword.data.entity.interf.Word;

import java.util.List;
import java.util.Random;

public class AbstractLanguageWord<T> implements Word<T> {

    private final List<T> words;

    public AbstractLanguageWord(List<T> list) {
        this.words = list;
    }


    @Override
    public void addWord(T word) {
        words.add(word);
    }

    @Override
    public T getRandomFromWords() {
        int random = new Random().nextInt(words.size());
        return words.get(random);
    }

    @Override
    public T getWord(int position) {
        return words.get(position);
    }

    @Override
    public T getLastWord() {
        return words.get(words.size()-1);
    }
}
