package tp5.e14;

public class EditorVideo {
    // Dependencia de creación: el editor instancia y devuelve el Render
    public Render exportar(String formato, Proyecto p, String rutaSalida) {
        if (p == null) throw new IllegalArgumentException("Proyecto no puede ser null");
        if (formato == null || formato.isBlank()) throw new IllegalArgumentException("Formato inválido");
        if (rutaSalida == null || rutaSalida.isBlank()) rutaSalida = "./exports/" + p.getNombre() + "." + formato.toLowerCase();
        return new Render(formato, p, rutaSalida);
    }
}