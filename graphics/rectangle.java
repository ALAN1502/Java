package graphics;

public class rectangle implements shape {
    double length, breadth;

    public rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public double area() {
        return length * breadth;
    }
}