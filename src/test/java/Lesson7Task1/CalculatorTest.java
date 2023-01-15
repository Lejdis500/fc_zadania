package Lesson7Task1;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 6, 18, 66, 100})
    void shouldVerifyNumberIsEven(int input) {
        Assertions.assertTrue(Calculator.isEven(input));
    }
    @ParameterizedTest
    @ValueSource(ints = {4,3,2})
void shouldReturnSum (int input) {
        Assertions.assertTrue
    }
}


