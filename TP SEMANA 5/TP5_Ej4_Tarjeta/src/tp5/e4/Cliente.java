package tp5.e4;

public class Cliente {
    String nombre;
    String dni;
    TarjetaDeCredito tarjeta; // asociación bidireccional

    public void setTarjeta(TarjetaDeCredito t){
        this.tarjeta = t;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre='" + nombre + "', dni=" + dni + "}";
    }
}