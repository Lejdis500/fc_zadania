package Lesson7Task4;

import static org.junit.jupiter.api.Assertions.*;
class TextTest {
    @ParameterizedTest
    @MethodSource("provideLenghtStringOfText")
    void shouldVerifyLenghtStringOfText (String input, String expected){
        String actualValue = input.trim().toLenghtText();
        Assertions.assertEquals(expected, actualValue);
    }}