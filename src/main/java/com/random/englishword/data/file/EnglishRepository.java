package com.random.englishword.data.file;

import com.random.englishword.data.entity.EnglishWord;

import java.util.List;

public class EnglishRepository extends AbstractLanguageRepository<EnglishWord> {

    private final EnglishWord englishWord;

    protected EnglishRepository(EnglishWord englishWord) {
        super(englishWord);
        this.englishWord = englishWord;
    }

    @Override
    public List<String> fetchAll() {
        return super.fetchAll();
    }

    @Override
    EnglishWord mapToWord(String cell) {
        return null;
    }
}
