// ValidadorEdad.java
package com.utn.tp8;

public class ValidadorEdad {
    public static void validar(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
    }

    public static void main(String[] args) {
        try {
            validar(30);
            System.out.println("Edad válida.");
            validar(130); // dispara la excepción personalizada
        } catch (EdadInvalidaException e) {
            System.out.println("Capturada excepción personalizada: " + e.getMessage());
        }
    }
}