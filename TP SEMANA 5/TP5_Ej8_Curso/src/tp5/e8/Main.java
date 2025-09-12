package tp5.e8;

public class Main {
    public static void main(String[] args) {
        Profesor prof = new Profesor("Ana Pérez", "30.112.223");
        Curso poo = new Curso("Programación Orientada a Objetos", 2, prof);

        Alumno a1 = new Alumno("Santiago Nievas", "20251");
        Alumno a2 = new Alumno("Lucía Gómez", "20252");
        Alumno a3 = new Alumno("Matías Roldán", "20253");

        System.out.println("Inscripción a1: " + poo.inscribir(a1)); // true
        System.out.println("Inscripción a2: " + poo.inscribir(a2)); // true
        System.out.println("Inscripción a3: " + poo.inscribir(a3)); // false (sin cupo)

        System.out.println();
        System.out.println(poo);
    }
}