package com.random.englishword.data.entity;

import com.random.englishword.data.entity.interf.Translator;

public class TranslatorImpl<MainLanguage, DifferentLanguage> implements Translator<MainLanguage, DifferentLanguage> {

    private final MainLanguage idKey;
    private DifferentLanguage value;


    public TranslatorImpl(MainLanguage idKey) {
        this.idKey = idKey;
        value = null;
    }

    public TranslatorImpl(MainLanguage idKey, DifferentLanguage value) {
        this.idKey = idKey;
        this.value = value;
    }

    public MainLanguage getIdKey() {
        return idKey;
    }

    public DifferentLanguage getValue() {
        return value;
    }

    @Override
    public DifferentLanguage translateToDifferentLanguage(MainLanguage mainLanguage) {
        return null;
    }

    @Override
    public MainLanguage translateToMainLanguage(DifferentLanguage differentLanguage) {
        return null;
    }
}
