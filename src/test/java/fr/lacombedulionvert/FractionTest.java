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
        // Given
        Fraction f = new Fraction(0, 1);

        // When
        Fraction result = f.add(f);

        // Then
        Assertions.assertThat(result.getNumerator()).isEqualTo(0);
    }

    @Test
    public void add_0_and_1_equals_1() {
        // Given
        Fraction f0 = new Fraction(0, 1);
        Fraction f1 = new Fraction(1, 1);

        // When
        Fraction result = f0.add(f1);

        // Then
        Assertions.assertThat(result.getNumerator()).isEqualTo(1);
    }

    @Test
    public void add_3_and_2_equals_5() {
        // Given
        Fraction f0 = new Fraction(3, 1);
        Fraction f1 = new Fraction(2, 1);

        // When
        Fraction result = f0.add(f1);

        // Then
        Assertions.assertThat(result.getNumerator()).isEqualTo(5);
    }
}
