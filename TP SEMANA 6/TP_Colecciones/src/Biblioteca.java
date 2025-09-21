import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private final List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre){ this.nombre = nombre; }

    public boolean agregarLibro(String isbn, String titulo, int anio, Autor autor){
        if(buscarLibroPorIsbn(isbn) != null) return false;
        return libros.add(new Libro(isbn, titulo, anio, autor));
    }

    public void listarLibros(){
        if(libros.isEmpty()){ System.out.println("Biblioteca sin libros."); return; }
        libros.forEach(System.out::println);
    }

    public Libro buscarLibroPorIsbn(String isbn){
        for(Libro l : libros) if(l.getIsbn().equalsIgnoreCase(isbn)) return l;
        return null;
    }

    public boolean eliminarLibro(String isbn){
        return libros.removeIf(l -> l.getIsbn().equalsIgnoreCase(isbn));
    }

    public int obtenerCantidadLibros(){ return libros.size(); }

    public List<Libro> filtrarLibrosPorAnio(int anio){
        List<Libro> out = new ArrayList<>();
        for(Libro l : libros) if(l.getAnioPublicacion() == anio) out.add(l);
        return out;
    }

    public void mostrarAutoresDisponibles(){
        Set<Autor> autores = new LinkedHashSet<>();
        for(Libro l : libros) if(l.getAutor() != null) autores.add(l.getAutor());
        autores.forEach(a -> System.out.println(a.getNombre()+" ("+a.getNacionalidad()+")"));
    }
}