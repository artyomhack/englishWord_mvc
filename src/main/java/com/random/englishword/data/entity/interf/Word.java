package com.random.englishword.data.entity.interf;

import java.util.List;

public interface Word<T>{

    void addWord(T word);

    T getRandomFromWords();

    T getWord(int position);

    T getLastWord();
}
