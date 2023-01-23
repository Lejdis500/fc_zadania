package Lesson7Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumberCheckerTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 15})
    public void shouldVerifyNumberIsOdd(int number) {
        Assertions.assertFalse(NumberChecker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void shouldVerifyNumberIsEven(int number) {
        Assertions.assertTrue(NumberChecker.isEven(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"123:6", "345:12", "456:15", "567:18"}, delimiter = ':')
    public void shouldCalculateSumOfDigitsOfGivenNumber(int number, int expected) {
        int actualInt = NumberChecker.sumOfDigitsOfGivenNumber(number);
        Assertions.assertEquals(expected, actualInt);
    }
}