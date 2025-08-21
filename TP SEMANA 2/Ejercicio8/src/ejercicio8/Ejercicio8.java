package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scan.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = scan.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = scan.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double base, double imp, double desc) {
        return base + (base * imp / 100) - (base * desc / 100);
    }
}