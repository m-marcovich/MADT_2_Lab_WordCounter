package com.example.madt_2_lab_wordcounter;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordCounterTest {

    @Test
    public void testGetCharsCount() {
        String input = "Hello, World!";
        int result = CounterWord.getCharsCount(input);
        assertEquals(13, result);
    }

    @Test
    public void testGetWordsCount() {
        String input = "This is a sample sentence.";
        int result = CounterWord.getWordsCount(input);
        assertEquals(5, result);
    }
}
