package Lesson7Task2;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"Hello World"})
    void shoudVerifyCaseUpper(String input) {
        Assertions.assertFalse(Case.isUpper(input));
    }}
