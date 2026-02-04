import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    static Complex add(Complex c1, Complex c2) {
        return new Complex(
            c1.real + c2.real,
            c1.imaginary + c2.imaginary
        );
    }

    void display() {
        if (imaginary >= 0)
            System.out.println(real + "+" + imaginary + "i");
        else
            System.out.println(real + "-" + (-imaginary) + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex sum = Complex.add(c1, c2);
        System.out.print("Sum of complex numbers = ");
        sum.display();
    }
}
