package tp7.kata3;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract double calcularSueldo();
}