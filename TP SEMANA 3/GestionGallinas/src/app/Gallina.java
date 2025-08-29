package app;

public class Gallina {
    int idGallina;
    int edad;           // en años
    int huevosPuestos;  // acumulado

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina #" + idGallina +
                " | Edad: " + edad + " | Huevos: " + huevosPuestos);
    }
}