package W7_ComplexNumbers.code;

import java.text.DecimalFormat;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void set(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    private static final DecimalFormat df = new DecimalFormat("0.##");

    @Override
    public String toString() {
        String realStr = df.format(real);
        String imaginaryStr = df.format(Math.abs(imaginary));

        if (imaginary >= 0)
        {
            return realStr + " + " + imaginaryStr + "i";
        }
        else
        {
            return realStr + " - " + imaginaryStr + "i";
        }
    }


}
