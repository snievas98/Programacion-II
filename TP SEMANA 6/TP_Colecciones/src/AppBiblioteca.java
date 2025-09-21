public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A01","J. Cortázar","Argentina");
        Autor a2 = new Autor("A02","I. Asimov","EE.UU.");
        Autor a3 = new Autor("A03","U. Eco","Italia");

        b.agregarLibro("ISBN-001","Rayuela",1963,a1);
        b.agregarLibro("ISBN-002","Ficciones",1944,new Autor("A04","J. L. Borges","Argentina"));
        b.agregarLibro("ISBN-003","Fundación",1951,a2);
        b.agregarLibro("ISBN-004","El péndulo de Foucault",1988,a3);
        b.agregarLibro("ISBN-005","Yo, Robot",1950,a2);

        System.out.println("== Libros ==");
        b.listarLibros();

        System.out.println("\n== Buscar ISBN-003 ==");
        System.out.println(b.buscarLibroPorIsbn("ISBN-003"));

        System.out.println("\n== Publicados en 1951 ==");
        b.filtrarLibrosPorAnio(1951).forEach(System.out::println);

        System.out.println("\n== Eliminar ISBN-002 ==");
        System.out.println("Eliminado: " + b.eliminarLibro("ISBN-002"));
        b.listarLibros();

        System.out.println("\n== Cantidad total ==");
        System.out.println(b.obtenerCantidadLibros());

        System.out.println("\n== Autores disponibles ==");
        b.mostrarAutoresDisponibles();
    }
}