package tp5.e1;

public class Main {
    public static void main(String[] args) {
        Titular t = new Titular();
        t.nombre = "Pepe";
        t.dni = "40545665";

        Pasaporte p = new Pasaporte("AR123", "2025-09-08", t, "foto.png", "png");
        System.out.println("OK: se creó el pasaporte " + p.numero + " de " + t.nombre);
    }
}