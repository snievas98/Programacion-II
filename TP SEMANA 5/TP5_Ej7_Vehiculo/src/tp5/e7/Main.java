package tp5.e7;

public class Main {
    public static void main(String[] args) {
        Conductor c = new Conductor("Santiago Nievas", "B-1234567");

        // El motor se crea dentro del Vehiculo (composición)
        Vehiculo v = new Vehiculo(
                "AE123AB", "Toyota", "Corolla",
                "1.8 NA", 140,
                c
        );

        System.out.println(v);               // Vehiculo con su Motor y Conductor
        System.out.println(c.vehiculo);      // Demuestra el enlace bidireccional
    }
}