package app;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " (" + especie + "), edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
    }
}