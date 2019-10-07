package fr.lacombedulionvert;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {
    @Test
    public void should_return_1_4_when_multiplying_1_2_and_1_2() {
        Fraction f = new Fraction(1,2);

        Fraction result = f.multiply(f);
        Assert.assertEquals(result.getDenominator(), 4);
        Assert.assertEquals(result.getNumerator(), 1);
    }

}
