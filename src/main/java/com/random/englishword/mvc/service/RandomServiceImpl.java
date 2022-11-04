package com.random.englishword.mvc.service;

import com.random.englishword.data.entity.AbstractLanguageWord;
import org.springframework.stereotype.Service;

@Service
public abstract class RandomServiceImpl<T extends AbstractLanguageWord> implements RandomService<T> {

    private final T entity;

    protected RandomServiceImpl(T entity) {
        this.entity = entity;
    }

    @Override
    public String getRandomWord() {
        return (String) entity.getRandomFromWords();
    }
}
