package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

        @Test
        void shouldReturnValidAreaWhenLengthAndBreadthIsGiven() {
            Rectangle newRectangle = Rectangle.createRectangle(10, 12);

            int rectArea = newRectangle.calculateArea();

            assertEquals(120, rectArea);
        }
}
