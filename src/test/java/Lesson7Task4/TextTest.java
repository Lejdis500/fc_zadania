package Lesson7Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TextTest {

    @ParameterizedTest
    @MethodSource("provideLengthStringOfText")
    void shouldVerifyLengthStringOfText(String input, int expected) {
        int actualValue = Text.getLength(input);
        Assertions.assertEquals(expected, actualValue);
    }
    public static Stream<Arguments> provideLengthStringOfText() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("a", 1),
                Arguments.of("ala ma kota", 11)
        );
    }
}