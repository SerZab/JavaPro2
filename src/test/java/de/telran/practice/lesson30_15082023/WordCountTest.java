package de.telran.practice.lesson30_15082023;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {

    @Test
    public void simpleSentenceWordCount() {
        //given
        String line = "I want to have a lunch";
        //when
        WordCount wordCount = new WordCount();
        Map<String, Integer> result = wordCount.countWords(line);
        //then
        assertEquals(Integer.valueOf(1), result.get("want"));
    }

    @Test
    public void duplicatedWordsCount() {
        //given
        String line = "I cook I many times book book";
        //when
        WordCount wordCount = new WordCount();
        Map<String, Integer> result = wordCount.countWords(line);
        //then
        assertEquals(Integer.valueOf(2), result.get("I"));
        assertEquals(Integer.valueOf(2), result.get("book"));
    }

    @Test
    public void emptyLineCount() {
        //given
        String line = "";
        //when
        WordCount wordCount = new WordCount();
        Map<String, Integer> result = wordCount.countWords(line);
        //then
        assertTrue(result.isEmpty());
    }

    @Test
    public void doubleSpaceWordCount() {
        //given
        String line = "  ";
        //when
        WordCount wordCount = new WordCount();
        Map<String, Integer> result = wordCount.countWords(line);
        //then
        assertTrue(result.isEmpty());
    }

    @Test
    public void lineWithCommasCount() {
        //given
        String line = "I cook, I many, times book, book";
        //when
        WordCount wordCount = new WordCount();
        Map<String, Integer> result = wordCount.countWords(line);
        //then
        assertEquals(Integer.valueOf(2), result.get("book"));
        assertEquals(5,result.size());
    }

    @Test
    public void NullCount() {
        //given

        //when
        WordCount wordCount = new WordCount();
        Map<String, Integer> result = wordCount.countWords(null);
        //then
        assertTrue(result.isEmpty());
    }


}