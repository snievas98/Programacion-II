package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0, num;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = scan.nextInt();
            if (num % 2 == 0 && num != 0) {
                suma += num;
            }
        } while (num != 0);

        System.out.println("La suma de los números pares es: " + suma);
    }
}