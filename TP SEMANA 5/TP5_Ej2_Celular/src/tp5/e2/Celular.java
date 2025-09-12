package tp5.e2;

public class Celular {
    String imei;
    String marca;
    String modelo;
    Bateria bateria;  // agregación (inyectada)
    Usuario usuario;  // asociación bidireccional 1–1

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario){
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        if (usuario != null) usuario.setCelular(this);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "imei=" + imei +
                ", marca=" + marca +
                ", modelo=" + modelo +
                ", bateria=" + bateria +
                ", usuario=" + usuario +
                '}';
    }
}