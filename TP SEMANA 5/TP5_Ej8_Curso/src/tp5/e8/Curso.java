package tp5.e8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private int cupo;
    private Profesor profesor;           // agregación
    private List<Inscripcion> insc;      // composición

    public Curso(String nombre, int cupo, Profesor profesor) {
        this.nombre = nombre;
        this.cupo = cupo;
        this.profesor = profesor;
        this.insc = new ArrayList<>();
    }

    public boolean inscribir(Alumno a) {
        if (insc.size() >= cupo) return false;          // sin cupo
        // composición: la inscripción se crea dentro del curso
        insc.add(new Inscripcion(a, LocalDate.now()));
        return true;
    }

    public int cantidadInscriptos() { return insc.size(); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Curso: " + nombre +
                " | Profesor: " + profesor +
                " | Cupo: " + cupo + " | Inscriptos: " + cantidadInscriptos() + "\n");
        for (Inscripcion i : insc) sb.append("  - ").append(i).append("\n");
        return sb.toString();
    }
}