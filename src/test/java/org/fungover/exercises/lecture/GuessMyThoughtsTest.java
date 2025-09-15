package org.fungover.exercises.lecture;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class GuessMyThoughtsTest {

    public static Stream<Arguments> numberGenerator() {
        return Stream.iterate(1, i -> i + 1)
                .limit(100) // You can adjust the limit to control how many values you want
                .map(Arguments::of);
    }


    @ParameterizedTest
    @MethodSource("numberGenerator")
    void verifySecretNumberIsFound(int input) {
        assertThat(GuessMyThoughts.test(input)).isEqualTo(input);
    }


}