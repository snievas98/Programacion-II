package app;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Ana";
        e.apellido = "López";
        e.curso = "Programación II";
        e.calificacion = 6;
        e.mostrarInfo();
    }
}