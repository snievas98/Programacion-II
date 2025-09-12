package tp5.e8;

import java.time.LocalDate;

public class Inscripcion {
    private Alumno alumno;       // agregación
    private LocalDate fecha;

    public Inscripcion(Alumno alumno, LocalDate fecha) {
        this.alumno = alumno;
        this.fecha = fecha;
    }

    public Alumno getAlumno() { return alumno; }

    @Override
    public String toString() {
        return alumno + " - " + fecha;
    }
}