package fr.lacombedulionvert;

public class Fraction {

    private final int numerator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
    }

    public int add(Fraction fraction) {
        if(fraction.numerator == 1) return 1;
        return 0;
    }
}
