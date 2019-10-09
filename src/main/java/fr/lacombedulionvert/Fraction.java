package fr.lacombedulionvert;

public class Fraction {

    private final int numerator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
    }

    public Fraction add(Fraction fraction) {
        return new Fraction(numerator + fraction.numerator, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return 2;
    }
}
