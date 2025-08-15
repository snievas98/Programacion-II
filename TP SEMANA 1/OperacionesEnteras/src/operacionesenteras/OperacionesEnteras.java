package operacionesenteras;

 import java.util.Scanner;

public class OperacionesEnteras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer entero: ");
        int a = sc.nextInt();
        System.out.print("Segundo entero: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        if (b != 0) {
            System.out.println("División (entera): " + (a / b));
        } else {
            System.out.println("División: error (división por cero)");
        }

        sc.close();
    }
}