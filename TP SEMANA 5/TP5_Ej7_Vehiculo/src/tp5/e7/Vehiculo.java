package tp5.e7;

public class Vehiculo {
    String patente;
    String marca;
    String modelo;

    private Motor motor;        // composición: se crea adentro del Vehiculo
    Conductor conductor;        // asociación bidireccional 1–1

    // Recibimos parámetros del Motor y lo construimos internamente
    public Vehiculo(String patente, String marca, String modelo,
                    String tipoMotor, int potenciaHP, Conductor conductor) {

        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;

        // COMPOSICIÓN
        this.motor = new Motor(tipoMotor, potenciaHP);

        // Asociación bidireccional
        this.conductor = conductor;
        if (conductor != null) conductor.setVehiculo(this);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", conductor=" + conductor +
                '}';
    }
}