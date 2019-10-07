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
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Assertions.assertThat(false).isTrue();
    }

    @Test
    public void additionResultIsZero()
    {
        Fraction f = new Fraction(0, 1);

        Assertions.assertThat(f.add(f)).isEqualTo(0);
    }


}
