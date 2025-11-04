package org.fungover.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UnitTestExamplesTest {

    @Test
    void sumOfTwoInts() {
        int result = UnitTestExamples.add(1, 1);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void sumOfTwoNegativeInts() {
        var result = UnitTestExamples.add(-1, -10);
        assertThat(result).isEqualTo(-11);
    }

    @Test
    void setAValueShouldSaveValue() {
        var ob = new UnitTestExamples();

        ob.setValue("Hello");

        assertThat(ob.getValue()).isEqualTo("Hello");

    }

}