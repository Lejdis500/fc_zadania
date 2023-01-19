package Lesson7Task1;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 15})
    public void checkIfOdd(int number) {
        boolean result = Calculator.isOdd(number);
        assertEquals(number % 2 == 0, result);

    }

    @ParameterizedTest
    @CsvSource({"123, 6", "456, 15", "789, 24"})
    public void checkSum(String strNumber, int expected) {
        int sum = Calculator.sum(strNumber);
        assertEquals(expected, sum);
    }
}



