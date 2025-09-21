import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    final List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad){
        this.id=id; this.nombre=nombre; this.especialidad=especialidad;
    }

    public String getId(){ return id; }
    public String getNombre(){ return nombre; }
    public String getEspecialidad(){ return especialidad; }
    public List<Curso> getCursos(){ return new ArrayList<>(cursos); }

    public void agregarCurso(Curso c){ if(c!=null) c.setProfesor(this); }
    public void eliminarCurso(Curso c){ if(c!=null && cursos.contains(c)) c.setProfesor(null); }

    void _agregarCursoInterno(Curso c){ if(!cursos.contains(c)) cursos.add(c); }
    void _quitarCursoInterno(Curso c){ cursos.remove(c); }

    public void listarCursos(){ cursos.forEach(c -> System.out.println(c.getCodigo()+" - "+c.getNombre())); }

    @Override public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Profesor)) return false;
        return Objects.equals(id, ((Profesor)o).id);
    }
    @Override public int hashCode(){ return Objects.hash(id); }

    @Override public String toString(){
        return "Profesor{id='"+id+"', nombre='"+nombre+"', esp='"+especialidad+"', cursos="+cursos.size()+"}";
    }
}