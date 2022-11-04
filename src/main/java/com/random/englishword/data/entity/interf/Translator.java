package com.random.englishword.data.entity.interf;

import org.apache.poi.ss.formula.functions.T;

public interface Translator<MainLanguage, DifferentLanguage> {

    DifferentLanguage translateToDifferentLanguage(MainLanguage mainLanguage);

    MainLanguage translateToMainLanguage(DifferentLanguage differentLanguage);

}
