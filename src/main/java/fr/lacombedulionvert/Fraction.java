package fr.lacombedulionvert;

import java.util.Objects;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction) {
        Fraction fractionWithMaxDenominator = this.denominator >= fraction.denominator ? this : fraction;
        Fraction fractionWithMinDenominator = this.denominator < fraction.denominator ? this : fraction;
        return new Fraction(
                crossProductNumerator(fractionWithMaxDenominator, fractionWithMinDenominator)
                        + fractionWithMaxDenominator.numerator,
                fractionWithMaxDenominator.denominator);
    }

    private int crossProductNumerator(Fraction fractionWithMaxDenominator, Fraction fractionWithMinDenominator) {
        return (fractionWithMaxDenominator.denominator / fractionWithMinDenominator.denominator)
                * fractionWithMinDenominator.numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
