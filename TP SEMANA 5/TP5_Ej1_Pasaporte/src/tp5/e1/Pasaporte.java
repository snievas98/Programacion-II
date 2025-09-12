package tp5.e1;

public class Pasaporte {
    String numero;
    String fechaEmision;
    Foto foto;       // composición: se crea internamente
    Titular titular; // asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Titular titular, String img, String fmt) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(img, fmt);
        this.titular = titular;
        if (titular != null) titular.setPasaporte(this);
    }
}