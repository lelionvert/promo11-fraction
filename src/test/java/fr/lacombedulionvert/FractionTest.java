package fr.lacombedulionvert;

import static org.junit.Assert.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;
import java.util.stream.IntStream;

/**
 * Unit test for simple App.
 */
public class FractionTest {

    @Test
    public void add_0_and_0_equals_0() {
        // Given / When
        Fraction result = new Fraction(0, 1)
                .add(new Fraction(0, 1));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(0, 1)
        );
    }

    @Test
    public void add_0_and_1_equals_1() {
        // Given / When
        Fraction result = new Fraction(0, 1)
                .add(new Fraction(1, 1));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(1, 1)
        );
    }

    @Test
    public void add_3_and_2_equals_5() {
        // Given / When
        Fraction result = new Fraction(3, 1)
                .add(new Fraction(2, 1));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(5, 1)
        );
    }

    @Test
    public void add_1_on_2_and_3_on_2_equals_8_on_4() {
        // Given / When
        Fraction result = new Fraction(1, 2)
                .add(new Fraction(3, 2));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(8, 4)
        );
    }

    @Test
    public void add_1_on_2_and_1_on_4_equals_6_on_8() {
        // Given / When
        Fraction result = new Fraction(1, 2)
                .add(new Fraction(1, 4));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(6, 8)
        );
    }

    @Test
    public void add_1_on_1_and_1_on_2_equals_3_on_2() {
        // Given / When
        Fraction result = new Fraction(1, 1)
                .add(new Fraction(1, 2));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(3, 2)
        );
    }

    @Test
    public void add_1_on_2_and_1_on_10_equals_12_on_20() {
        // Given / When
        Fraction result = new Fraction(1, 2)
                .add(new Fraction(1, 10));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(12, 20)
        );
    }

    @Test
    public void add_1_on_5_and_1_on_10_equals_15_on_50() {
        // Given / When
        Fraction result = new Fraction(1, 5)
                .add(new Fraction(1, 10));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(15, 50)
        );
    }

    @Test
    public void add_1_on_4_and_1_on_2_equals_6_on_8() {
        // Given / When
        Fraction result = new Fraction(1, 4)
                .add(new Fraction(1, 2));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(6, 8)
        );
    }

    @Test
    public void add_1_on_2_and_1_on_5_equals_7_on_10() {
        // Given / When
        Fraction result = new Fraction(1, 2)
                .add(new Fraction(1, 5));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(7, 10)
        );
    }

    @Test
    public void add_1_on_3_and_1_on_2_equals_5_on_6() {
        // Given / When
        Fraction result = new Fraction(1, 3)
                .add(new Fraction(1, 2));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(5, 6)
        );
    }

    @Test
    public void add_1_on_5_and_1_on_7_equals_12_on_35() {
        // Given / When
        Fraction result = new Fraction(1, 5)
                .add(new Fraction(1, 7));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(12, 35)
        );
    }
}
