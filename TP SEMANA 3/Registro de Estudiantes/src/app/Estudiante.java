package app;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion; // 0..10

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido +
                " | Curso: " + curso + " | Calificación: " + calificacion);
    }
    public void subirCalificacion(int puntos) {
        if (puntos < 0) return;
        calificacion = Math.min(10, calificacion + puntos);
    }
    public void bajarCalificacion(int puntos) {
        if (puntos < 0) return;
        calificacion = Math.max(0, calificacion - puntos);
    }
}