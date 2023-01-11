package Lesson4Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void shouldGetArea() {
        // given
        int sideA = 5;
        // when
        Square square = new Square(sideA);
        int area = square.getArea();
        // then
        Assertions.assertEquals(25, area);

    }

    @Test
    void shouldGetPerimeter() {
        // given
        int sideA = 5;
        // when
        Square square = new Square(sideA);
        int perimeter = square.getPerimeter();
        // then
        Assertions.assertEquals(20, perimeter);
    }
}