package tp7.kata1;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " | Puertas: " + cantidadPuertas;
    }
}