package tp5.e7;

public class Conductor {
    String nombre;
    String nroLicencia;
    Vehiculo vehiculo;   // vínculo bidireccional

    public Conductor(String nombre, String nroLicencia) {
        this.nombre = nombre;
        this.nroLicencia = nroLicencia;
    }

    public void setVehiculo(Vehiculo v) {
        this.vehiculo = v;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre='" + nombre + '\'' + ", licencia='" + nroLicencia + '\'' + '}';
    }
}