package tp7.kata3;

import java.util.ArrayList;
import java.util.List;

public class MainKata3 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Laura", 350000, 4));
        empleados.add(new EmpleadoTemporal("Mati", 120, 1800));
        empleados.add(new EmpleadoTemporal("Sofi", 170, 1800));
        empleados.add(new EmpleadoPlanta("Diego", 420000, 1));

        for (Empleado e : empleados) {
            String tipo = (e instanceof EmpleadoPlanta) ? "Planta" :
                          (e instanceof EmpleadoTemporal) ? "Temporal" : "Otro";
            System.out.printf("[%s] %s → sueldo: $%,.2f%n", tipo, e.getNombre(), e.calcularSueldo());
        }
    }
}