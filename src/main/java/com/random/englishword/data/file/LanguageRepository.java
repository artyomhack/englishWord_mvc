package com.random.englishword.data.file;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository {

    List<String> fetchAll();

}
