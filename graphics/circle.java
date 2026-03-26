package graphics;

public class circle implements shape {
    double radius;

    public circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}