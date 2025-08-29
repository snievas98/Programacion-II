package app;

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Firulais";
        m1.especie = "Perro";
        m1.edad = 3;

        Mascota m2 = new Mascota();
        m2.nombre = "Mishi";
        m2.especie = "Gato";
        m2.edad = 1;

        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();

        m2.mostrarInfo();
    }
}
