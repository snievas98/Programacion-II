package tp5.e1;

public class Titular {
    String nombre;
    String dni;
    Pasaporte pasaporte; // asociación bidireccional

    public void setPasaporte(Pasaporte p) {
        this.pasaporte = p;
    }
}