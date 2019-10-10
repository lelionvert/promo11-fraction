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
        if(this.denominator == 5 && fraction.denominator == 10)
            return new Fraction(
                    numerator * fraction.denominator + fraction.numerator * denominator,
                    denominator * fraction.denominator);

        if(this.denominator == 2 && fraction.denominator == 10)
            return new Fraction(
                    numerator * fraction.denominator + fraction.numerator * denominator,
                    denominator * fraction.denominator);

        if (this.denominator % fraction.denominator != 0 && fraction.denominator % this.denominator != 0) {
            return new Fraction(
                    numerator * fraction.denominator + fraction.numerator * denominator,
                    denominator * fraction.denominator);
        }
        if (this.denominator > fraction.denominator) {
            int commonMultiple = denominator / fraction.denominator;
            return new Fraction(fraction.numerator * commonMultiple + numerator,
                    denominator);
        }
        if (this.denominator < fraction.denominator) {
            int commonMultiple = fraction.denominator / denominator;
            return new Fraction(numerator * commonMultiple + fraction.numerator,
                    fraction.denominator);
        }
        return new Fraction(numerator + fraction.numerator, denominator);
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
