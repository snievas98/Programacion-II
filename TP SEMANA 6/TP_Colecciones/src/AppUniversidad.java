public class AppUniversidad {
    public static void main(String[] args) {
        Universidad u = new Universidad("UTN - Programación II");

        Profesor pr1 = new Profesor("PR01", "Ana López", "BD");
        Profesor pr2 = new Profesor("PR02", "Carlos Pérez", "POO");
        Profesor pr3 = new Profesor("PR03", "María Díaz", "Redes");

        Curso cu1 = new Curso("CUR01", "Programación II");
        Curso cu2 = new Curso("CUR02", "Bases de Datos");
        Curso cu3 = new Curso("CUR03", "Redes");
        Curso cu4 = new Curso("CUR04", "Arquitectura");
        Curso cu5 = new Curso("CUR05", "Estadística");

        u.agregarProfesor(pr1); u.agregarProfesor(pr2); u.agregarProfesor(pr3);
        u.agregarCurso(cu1); u.agregarCurso(cu2); u.agregarCurso(cu3); u.agregarCurso(cu4); u.agregarCurso(cu5);

        u.asignarProfesorACurso("CUR01", "PR02");
        u.asignarProfesorACurso("CUR02", "PR01");
        u.asignarProfesorACurso("CUR03", "PR03");
        u.asignarProfesorACurso("CUR04", "PR02");

        System.out.println("== Cursos ==");
        u.listarCursos();

        System.out.println("\n== Profesores ==");
        u.listarProfesores();

        System.out.println("\n== Cambiar prof CUR04 -> PR01 ==");
        u.asignarProfesorACurso("CUR04", "PR01");
        u.listarCursos();

        System.out.println("\n== Eliminar CUR05 ==");
        System.out.println("Eliminado: " + u.eliminarCurso("CUR05"));
        u.listarProfesores();

        System.out.println("\n== Eliminar PR03 ==");
        System.out.println("Eliminado: " + u.eliminarProfesor("PR03"));
        u.listarCursos();

        System.out.println();
        u.reporteCantidadCursosPorProfesor();
    }
}