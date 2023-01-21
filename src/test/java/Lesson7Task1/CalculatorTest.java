package Lesson7Task1;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 15})
    public void shouldVerifyNumberIsEven(int number) {
        Assertions.assertFalse(NumberChecker.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void shouldVerifyNumberIsEven(int number) {
        Assertions.assertTrue(NumberChecker.isEven(number));
    }
    @ParameterizedTest
    @CsvSource({"123 : 6", "345 : 12", "456 : 15", "567 : 18"})
    public void shouldCalculateSumOfDigitsOfGivenNumber(int number, int expected) {
        int actualInt = NumberChecker.sumOfDigitsOfGivenNumber(number);
        Assertions.assertEquals(expected, actualInt);
    }
}