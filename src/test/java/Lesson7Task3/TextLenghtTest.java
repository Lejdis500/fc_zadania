package Lesson7Task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
class TextLenghtTest {
    @org.junit.jupiter.api.Test
    @ParameterizedTest
    @ValueSource
    public static int lengthOf(String str) {
        return str.length();
    }}