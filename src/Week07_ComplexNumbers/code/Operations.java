package Week07_ComplexNumbers.code;

public class Operations {

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {

        double newReal = c1.getReal() + c2.getReal();
        double newImaginary = c1.getImaginary() + c2.getImaginary();
        return new ComplexNumber(newReal, newImaginary);

    }

    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {

        double newReal = c1.getReal() - c2.getReal();
        double newImaginary = c1.getImaginary() - c2.getImaginary();
        return new ComplexNumber(newReal, newImaginary);

    }

    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {

        double newReal = (c1.getReal() * c2.getReal()) - (c1.getImaginary() * c2.getImaginary());
        double newImaginary = (c1.getReal() * c2.getImaginary() + c1.getImaginary() * c2.getReal());
        return new ComplexNumber(newReal, newImaginary);

    }

    public static ComplexNumber divide(ComplexNumber c1, ComplexNumber c2) {

        double denominator = Math.pow(c2.getReal(), 2) + Math.pow(c2.getImaginary(), 2);
        double newReal = (c1.getReal() * c2.getReal()) + (c1.getImaginary() * c2.getImaginary());
        double newImaginary = (c1.getImaginary() * c2.getReal() - c1.getReal() * c2.getImaginary());
        return new ComplexNumber(newReal / denominator, newImaginary / denominator);

    }

    public static double magnitude(ComplexNumber compNum) {
        return Math.sqrt(compNum.getReal() * compNum.getReal() + compNum.getImaginary() * compNum.getImaginary());
    }

    public static ComplexNumber conjugate(ComplexNumber compNum) {
        double newImaginary = - compNum.getImaginary();
        return new ComplexNumber(compNum.getReal(), newImaginary);
    }

    public static ComplexNumber additiveInverse(ComplexNumber compNum) {

        double newReal = - compNum.getReal();
        double newImaginary = - compNum.getImaginary();
        return new ComplexNumber(newReal, newImaginary);

    }

    public static ComplexNumber multiplicativeInverse(ComplexNumber compNum) {

        double denominator = compNum.getReal() * compNum.getReal() + compNum.getImaginary() * compNum.getImaginary();
        double newReal = compNum.getReal() / denominator;
        double newImaginary = (- compNum.getImaginary()) / denominator;
        return new ComplexNumber(newReal,  newImaginary);

    }

    public boolean isEqual(ComplexNumber c1, ComplexNumber c2) {
        return c1.getReal() == c2.getReal() && c1.getImaginary() == c2.getImaginary();
    }

}
