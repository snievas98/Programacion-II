package leernombreedad;

 import java.util.Scanner;

public class LeerNombreEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresá tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresá tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Nombre: " + nombre + " | Edad: " + edad);

        sc.close();
    }
}