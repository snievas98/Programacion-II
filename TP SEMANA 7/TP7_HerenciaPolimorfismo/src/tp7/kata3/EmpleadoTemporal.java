package tp7.kata3;

public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = horasTrabajadas * valorHora;
        if (horasTrabajadas > 160) { // simple plus por horas extra
            sueldo *= 1.2;
        }
        return sueldo;
    }
}