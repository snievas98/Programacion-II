package divisiondouble;

import java.util.Scanner;

public class DivisionDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a (double): ");
        double a = sc.nextDouble();
        System.out.print("b (double): ");
        double b = sc.nextDouble();

        System.out.println("a / b (double) = " + (a / b)); // con decimales
        sc.close();
    }
}