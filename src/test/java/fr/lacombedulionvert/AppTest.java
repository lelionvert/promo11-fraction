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

    @Test
public void additionResultIsZero()
{
    Fraction f = new Fraction(0, 1);

    Assertions.assertThat(f.add(f)).isEqualTo(0);
}

    @Test
    public void additionResultIsOne()
    {
        Fraction f0 = new Fraction(0, 1);
        Fraction f1 = new Fraction(1, 1);

        Assertions.assertThat(f0.add(f1)).isEqualTo(1);
    }

}
