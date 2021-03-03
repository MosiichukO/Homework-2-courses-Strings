package Strings;

import Operators.Operators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConversionFunctionsTest {
    @Test
    public void test_task1_Zero_integerToString() {
        String actual = ConversionFunctions.integerToString(0);
        String expected = "0";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_PositiveNumber_integerToString() {
        String actual = ConversionFunctions.integerToString(125);
        String expected = "125";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_NegativeNumber_integerToString() {
        String actual = ConversionFunctions.integerToString(-10);
        String expected = "-10";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_PositiveNumber_doubleToString() {
        String actual = ConversionFunctions.doubleToString(5.34);
        String expected = "5.34";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_NegativeNumber_doubleToString() {
        String actual = ConversionFunctions.doubleToString(-5.34);
        String expected = "-5.34";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_PositiveScenario_stringToInteger() {
        int actual = ConversionFunctions.stringToInteger("12");
        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_throwException_stringToInteger() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConversionFunctions.stringToInteger("Восемь"),
                "Incorrect format");
    }

    @Test
    public void test_task4_PositiveScenario_stringToDouble() {
        double actual = ConversionFunctions.stringToDouble("12.81");
        double expected = 12.81;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_throwException_stringToDouble() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConversionFunctions.stringToDouble ("1.Саша"),
                "Incorrect format");
    }
}
