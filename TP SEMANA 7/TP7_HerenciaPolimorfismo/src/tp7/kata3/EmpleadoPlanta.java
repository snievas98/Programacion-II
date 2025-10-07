package tp7.kata3;

public class EmpleadoPlanta extends Empleado {
    private double salarioBase;
    private int aniosAntiguedad;

    public EmpleadoPlanta(String nombre, double salarioBase, int aniosAntiguedad) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        double adicional = salarioBase * 0.05 * aniosAntiguedad; // 5% por año
        return salarioBase + adicional;
    }
}