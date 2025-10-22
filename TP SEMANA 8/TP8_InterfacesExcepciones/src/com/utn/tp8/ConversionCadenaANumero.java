// ConversionCadenaANumero.java
package com.utn.tp8;

public class ConversionCadenaANumero {
    public static void main(String[] args) {
        String texto = "123x"; // ejemplo
        try {
            int valor = Integer.parseInt(texto); // puede lanzar NumberFormatException
            System.out.println("Entero: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es un número entero válido.");
        }
    }
}