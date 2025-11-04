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
        //Arrange
        var ob = new UnitTestExamples();
        //Act
        ob.setValue("Hello");
        //Assert
        assertThat(ob.getValue()).isEqualTo("Hello");
    }

    @Test
    void setAnotherValueShouldSaveThat() {
        var ob = new UnitTestExamples();

        ob.setValue("Another");

        assertThat(ob.getValue()).isEqualTo("Another");
    }

}