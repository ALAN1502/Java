package graphics;

public class triangle implements shape {
    double base, height;

    public triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}