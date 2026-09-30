import java.util.Scanner;

public class IT26101603Lab9Q2 {

    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double result = circleArea(radius);

        System.out.println("Area = " + result);
    }
}