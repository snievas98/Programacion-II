package tp5.e2;

public class Bateria {
    String modelo;
    int capacidad; // mAh

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + "mAh}";
    }
}