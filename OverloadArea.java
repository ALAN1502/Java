import java.util.Scanner;

class Area {

    // Area of Circle
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    // Area of Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    double area(float base, float height) {
        return 0.5 * base * height;
    }
}

public class OverloadArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle = " + obj.area(r));
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                System.out.println("Area of Rectangle = " + obj.area(l, b));
                break;

            case 3:
                System.out.print("Enter base: ");
                float base = sc.nextFloat();
                System.out.print("Enter height: ");
                float height = sc.nextFloat();
                System.out.println("Area of Triangle = " + obj.area(base, height));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}