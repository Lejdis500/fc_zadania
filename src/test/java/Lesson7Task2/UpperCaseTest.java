package Lesson7Task2;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"Hello Words"})
    public void checkIfUpperCase(String str) {
        String result = UpperCase.toUpperCase(str);
        assertEquals(str != null ? str.toUpperCase() : null, result);
    }
}
