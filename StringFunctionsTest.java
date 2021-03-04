package Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
    @Test
    public void test_task1_DifferentWordsLength_lengthOfSmallestWord() {
        int actual = StringFunctions.lengthOfSmallestWord("Что делать хз");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_EqualWordsLength_lengthOfSmallestWord() {
        int actual = StringFunctions.lengthOfSmallestWord("Пишу тест");
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_NoWords_lengthOfSmallestWord() {
        int actual = StringFunctions.lengthOfSmallestWord("");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_OneWordLengthNeeded_changeLastSymbols() {
        String actual = StringFunctions.changeLastSymbols("Тестировщик, квадрат", 11);
        String expected = "Тестиров$$$, квадрат";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_TwoWordsLengthNeeded_changeLastSymbols() {
        String actual = StringFunctions.changeLastSymbols("Машина, карета, дом", 6);
        String expected = "Маш$$$, кар$$$, дом";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_NoWordsLengthNeeded_changeLastSymbols() {
        String actual = StringFunctions.changeLastSymbols("Машина, карета, дом", 7);
        String expected = "Машина, карета, дом";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_OnePunctuationMark_addSpace() {
        String actual = StringFunctions.addSpace("Нужно проверить,что все работает");
        String expected = "Нужно проверить, что все работает";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_ThreePunctuationMarks_addSpace() {
        String actual = StringFunctions.addSpace("Нужно:проверить,что все!работает");
        String expected = "Нужно: проверить, что все! работает";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_PunctuationMarkWithSpaces_addSpace() {
        String actual = StringFunctions.addSpace("Нужно проверить, что все работает");
        String expected = "Нужно проверить, что все работает";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_NoPunctuationMarks_addSpace() {
        String actual = StringFunctions.addSpace("Нужно проверить что все работает");
        String expected = "Нужно проверить что все работает";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_AllSymbolsUnique_uniqueSymbol() {
        String actual = StringFunctions.uniqueSymbol("Четкий дом");
        String expected = "Четкий дом";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_OneSymbolNotUnique_uniqueSymbol() {
        String actual = StringFunctions.uniqueSymbol("Хороший дом");
        String expected = "Хорший дм";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_SpaceSymbolNotUnique_uniqueSymbol() {
        String actual = StringFunctions.uniqueSymbol("Я и ты");
        String expected = "Я иты";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_NoWords_amountOfWords() {
        int actual = StringFunctions.amountOfWords("  ");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_OneWord_amountOfWords() {
        int actual = StringFunctions.amountOfWords("Работа");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_SixWords_amountOfWords() {
        int actual = StringFunctions.amountOfWords("Нужно провести собрание, чтоб обсудить вопрос");
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task6_TwoWordsAndSpace_deletePart() {
        String actual = StringFunctions.deletePart ("Провести тестирование", 6, 8);
        String expected = "Провесрование";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task6_OneWord_deletePart() {
        String actual = StringFunctions.deletePart ("Тестирование", 1, 11);
        String expected = "Т";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task6_WordWithPunctuationMarks_deletePart() {
        String actual = StringFunctions.deletePart ("Я!,ты", 3, 2);
        String expected = "Я!,";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task7_TwoSymbols_reverse() {
        String actual = StringFunctions.reverse ("Ым");
        String expected = "мЫ";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task7_OneSymbol_reverse() {
        String actual = StringFunctions.reverse ("Я");
        String expected = "Я";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task7_Null_reverse() {
        String actual = StringFunctions.reverse ("");
        String expected = "";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task7_FiveSymbols_reverse() {
        String actual = StringFunctions.reverse ("карта");
        String expected = "атрак";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task8_TheSentence_deleteLastWord() {
        String actual = StringFunctions.deleteLastWord ("Я иду гулять");
        String expected = "Я иду";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task8_WordAfterMarkSymbol_deleteLastWord() {
        String actual = StringFunctions.deleteLastWord ("Я иду, гулять");
        String expected = "Я иду,";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task8_LastWordWithHyphen_deleteLastWord() {
        String actual = StringFunctions.deleteLastWord ("Я иду тусить-гулять");
        String expected = "Я иду";
        Assertions.assertEquals(expected, actual);
    }
}
