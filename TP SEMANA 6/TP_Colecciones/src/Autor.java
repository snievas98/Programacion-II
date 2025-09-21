import java.util.Objects;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad){
        this.id = id; this.nombre = nombre; this.nacionalidad = nacionalidad;
    }
    public String getId(){ return id; }
    public String getNombre(){ return nombre; }
    public String getNacionalidad(){ return nacionalidad; }

    @Override public String toString(){
        return "Autor{id='"+id+"', nombre='"+nombre+"', nacionalidad='"+nacionalidad+"'}";
    }
    @Override public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Autor)) return false;
        return Objects.equals(id, ((Autor)o).id);
    }
    @Override public int hashCode(){ return Objects.hash(id); }
}