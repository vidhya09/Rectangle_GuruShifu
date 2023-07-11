package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RectangleTest {

        @Test
        void shouldReturnValidAreaWhenLengthAndBreadthIsGiven() {
            Rectangle newRectangle = Rectangle.createRectangle(10, 12);

            int rectArea = newRectangle.calculateArea();

            assertThat(rectArea, is(equalTo(120)));
        }
}
