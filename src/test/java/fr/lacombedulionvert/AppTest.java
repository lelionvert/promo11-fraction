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
public class AppTest {

    @Test
    public void additionResultIsZero() {
        // Given
        Fraction f = new Fraction(0, 1);

        // When
        Fraction result = f.add(f);

        // Then
        Assertions.assertThat(result.getNumerator()).isEqualTo(0);
    }

    @Test
    public void additionResultIsOne() {
        // Given
        Fraction f0 = new Fraction(0, 1);
        Fraction f1 = new Fraction(1, 1);

        // When
        Fraction result = f0.add(f1);

        // Then
        Assertions.assertThat(result.getNumerator()).isEqualTo(1);
    }

    /*Test
    public void additionResultIs3_2() {
        // Given
        Fraction f1_2 = new Fraction(1, 2);
        Fraction f1 = new Fraction(1, 1);

        // When
        Fraction result = f1_2.add(f1);

        // Then
        Fraction f3_2 = new Fraction(3, 2);
        Assertions.assertThat(result).isEqualTo(f3_2);
    }*/
}
