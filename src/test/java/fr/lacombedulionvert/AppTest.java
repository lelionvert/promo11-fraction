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
        int result = f.add(f);

        // Then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void additionResultIsOne() {
        // Given
        Fraction f0 = new Fraction(0, 1);
        Fraction f1 = new Fraction(1, 1);

        // When
        int result = f0.add(f1);

        // Then
        Assertions.assertThat(result).isEqualTo(1);
    }

}
