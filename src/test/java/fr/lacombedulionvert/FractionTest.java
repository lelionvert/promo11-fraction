package fr.lacombedulionvert;

import static org.junit.Assert.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import javax.swing.*;
import java.util.stream.IntStream;

/**
 * Unit test for simple App.
 */
public class FractionTest {

    @Test
    public void add_0_to_0() {
        // Given / When
        Fraction result = new Fraction(0, 1)
                .add(new Fraction(0, 1));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(0, 1)
        );
    }

    @Test
    public void add_0_to_non_0() {
        // Given / When
        Fraction result = new Fraction(0, 1)
                .add(new Fraction(1, 1));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(1, 1)
        );
    }

    @Test
    public void add_fractions_with_both_denominators_equal_one() {
        // Given / When
        Fraction result = new Fraction(3, 1)
                .add(new Fraction(2, 1));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(5, 1)
        );
    }

    @Test
    public void add_fractions_with_same_denominators() {
        // Given / When
        Fraction result = new Fraction(1, 2)
                .add(new Fraction(3, 2));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(8, 4)
        );
    }

    @Test
    public void add_fractions_with_different_denominators() {
        // Given / When
        Fraction result = new Fraction(1, 5)
                .add(new Fraction(1, 7));

        // Then
        Assertions.assertThat(result).isEqualTo(
                new Fraction(12, 35)
        );
    }
}
