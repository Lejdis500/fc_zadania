package Lesson7Task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @ParameterizedTest
    @ValueSource(strings = {"Hello Words"})
    void shouldConvertToUpperCase(String input) {
        String expected = input.toUpperCase();
        String actual = StringUtilsTest.toUpperCase(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowExceptionForNullExceptionInput() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class () {
            StringUtilsTest.toUpperCase(null);
        });
        assertEquals("The place cannot be empty", exception.getMessage());
    }
}