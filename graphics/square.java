package graphics;

public class square implements shape {
    double side;

    public square(double s) {
        side = s;
    }

    public double area() {
        return side * side;
    }
}