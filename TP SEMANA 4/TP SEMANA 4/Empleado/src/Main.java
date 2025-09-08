public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(100, "Ana Pérez", "Analista", 150000.0);
        Empleado e2 = new Empleado("Juan López", "Desarrollador");
        Empleado e3 = new Empleado("María Gómez", "Soporte");

        e2.setSalario(120000.0);
        e3.setSalario(100000.0);

        e1.actualizarSalario(10);
        e2.actualizarSalario(15000.0);
        e3.actualizarSalario(5);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}