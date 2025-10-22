// Cliente.java
package com.utn.tp8;

public class Cliente implements Notificable {
    private final String nombre;
    private final String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getEmail()  { return email; }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación a " + nombre + " (" + email + "): " + mensaje);
    }
}