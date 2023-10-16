package com.example.madt_2_lab_wordcounter;

import android.content.Context;
import android.widget.Toast;

public class CounterWord {
    public static int getCharsCount(String phrase)
    {

        return phrase.length();
    }
    public static int getWordsCount(String phrase)
    {
        if (phrase == null) return 0;
        int WordCount = 0;
        boolean inWord = false;
        for(int i=0; i< phrase.length(); i++){
            if(phrase.charAt(i)==' ' || phrase.charAt(i)==',' || phrase.charAt(i)=='.'  ){
                inWord = false;
            }
            else if (!inWord) {
                WordCount++;
                inWord = true;
            }

        }
        return WordCount;
    }
}
