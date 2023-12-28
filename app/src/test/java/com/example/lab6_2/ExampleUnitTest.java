package com.example.lab6_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleUnitTest
{
    @Test
    public void testGetCharsCount()
    {
        String input = "Hello, world";
        int result = WordCounter.getSymbolsCount(input);
        assertEquals(12, result);
    }
    @Test
    public void testGetWordsCount()
    {
        String input = "Sentence for test";
        int result = WordCounter.getWordsCount(input);
        assertEquals(3, result);
    }
}
