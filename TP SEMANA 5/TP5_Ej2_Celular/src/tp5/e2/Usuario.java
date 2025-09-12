package tp5.e2;

public class Usuario {
    String nombre;
    String dni;
    Celular celular; // asociación bidireccional

    public void setCelular(Celular c){
        this.celular = c;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + "}";
    }
}