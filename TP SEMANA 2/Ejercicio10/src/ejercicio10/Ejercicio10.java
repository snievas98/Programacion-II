package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scan.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = scan.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = scan.nextInt();

        int nuevoStock = actualizarStock(stockActual, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static int actualizarStock(int stock, int vendida, int recibida) {
        return stock - vendida + recibida;
    }
}