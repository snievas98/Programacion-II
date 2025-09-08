public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;
    private static int proximoId = 1; // para ID automático

    // Constructor completo: recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        // mantener coherencia del autoincremental si se usó un id explícito alto
        if (id >= proximoId) {
            proximoId = id + 1;
        }
    }

    // Constructor con nombre y puesto: asigna id automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = proximoId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0; // salario por defecto (ajustable según necesidad)
        totalEmpleados++;
    }

    // --- Sobrecarga de métodos actualizarSalario ---
    // Aumento por porcentaje (ej.: 10 = 10%)
    public void actualizarSalario(int porcentaje) {
        if (porcentaje < 0) {
            throw new IllegalArgumentException("El porcentaje no puede ser negativo.");
        }
        this.salario += this.salario * (porcentaje / 100.0);
    }

    // Aumento por monto fijo
    public void actualizarSalario(double monto) {
        if (monto < 0) {
            throw new IllegalArgumentException("El monto de aumento no puede ser negativo.");
        }
        this.salario += monto;
    }

    // --- Encapsulamiento (getters/setters) ---
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) {
        if (salario < 0) throw new IllegalArgumentException("El salario no puede ser negativo.");
        this.salario = salario;
    }

    // --- Estáticos ---
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return String.format("Empleado{id=%d, nombre='%s', puesto='%s', salario=%.2f}",
                id, nombre, puesto, salario);
    }
}