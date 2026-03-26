import graphics.*;

public class TestGraphics {
    public static void main(String[] args) {

        rectangle rect = new rectangle(10, 5);
        triangle tri = new triangle(4, 6);
        square sq = new square(5);
        circle cir = new circle(3);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
        System.out.println("Area of Square: " + sq.area());
        System.out.println("Area of Circle: " + cir.area());
    }
}