package errorscannercorregido;

 import java.util.Scanner;

public class ErrorScannerCorregido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();      //  leer texto

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();            //  leer entero

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
        scanner.close();
    }
}