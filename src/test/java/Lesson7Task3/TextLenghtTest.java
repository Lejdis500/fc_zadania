package Lesson7Task3;

import static org.junit.jupiter.api.Assertions.*;
class TextLenghtTest {
    @org.junit.jupiter.api.Test
    @ParameterizedTest
    @ValueSource
    public static int lengthOf(String str) {
        return str.length();
    }}