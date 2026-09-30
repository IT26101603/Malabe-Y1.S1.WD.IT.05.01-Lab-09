import java.util.Scanner;

public class IT26101603Lab9Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c, x;

        System.out.print("Enter a: ");
        a = input.nextDouble();

        System.out.print("Enter b: ");
        b = input.nextDouble();

        System.out.print("Enter c: ");
        c = input.nextDouble();

        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println("x = " + x);
    }
}