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
        Assertions.assertThat(result.getDenominator()).isEqualTo(1);

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
        Assertions.assertThat(result.getDenominator()).isEqualTo(1);

    }

    @Test
    public void add_3_and_2_equals_5() {
        // Given
        Fraction f3 = new Fraction(3, 1);
        Fraction f2 = new Fraction(2, 1);

        // When
        Fraction result = f3.add(f2);

        // Then
        Assertions.assertThat(result.getNumerator()).isEqualTo(5);
        Assertions.assertThat(result.getDenominator()).isEqualTo(1);

    }

    @Test
    public void add_1_on_2_and_3_on_2_equals_4_on_2() {
        // Given
        Fraction f1_2 = new Fraction(1, 2);
        Fraction f3_2 = new Fraction(3, 2);

        // When
        Fraction result = f1_2.add(f3_2);

        // Then
        Assertions.assertThat(result.getNumerator()).isEqualTo(4);
        Assertions.assertThat(result.getDenominator()).isEqualTo(2);
    }

    /*@Test
    public void add_1_on_5_and_3_on_5_equals_4_on_5() {
        // Given
        Fraction f1_5 = new Fraction(1, 5);
        Fraction f3_5 = new Fraction(3, 5);

        // When
        Fraction result = f1_5.add(f3_5);

        // Then
        Assertions.assertThat(result.getNumerator()).isEqualTo(4);
        Assertions.assertThat(result.getDenominator()).isEqualTo(5);
    }*/

    @Test
    public void add_1_on_3_and_1_on_3_equals_2_on_3() {
        // Given
        Fraction f1_3 = new Fraction(1, 3);

        // When
        Fraction result = f1_3.add(f1_3);

        // Then
        Assertions.assertThat(result.getNumerator()).isEqualTo(2);
        Assertions.assertThat(result.getDenominator()).isEqualTo(3);
    }

}
