import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre){ this.nombre = nombre; }

    public boolean agregarProfesor(Profesor p){
        if(p == null || buscarProfesorPorId(p.getId()) != null) return false;
        return profesores.add(p);
    }
    public boolean agregarCurso(Curso c){
        if(c == null || buscarCursoPorCodigo(c.getCodigo()) != null) return false;
        return cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id){
        for(Profesor p : profesores) if(p.getId().equalsIgnoreCase(id)) return p;
        return null;
    }
    public Curso buscarCursoPorCodigo(String codigo){
        for(Curso c : cursos) if(c.getCodigo().equalsIgnoreCase(codigo)) return c;
        return null;
    }

    public boolean asignarProfesorACurso(String codCurso, String idProfesor){
        Curso c = buscarCursoPorCodigo(codCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if(c == null || p == null) return false;
        c.setProfesor(p);
        return true;
    }

    public void listarProfesores(){ profesores.forEach(System.out::println); }
    public void listarCursos(){ cursos.forEach(System.out::println); }

    public boolean eliminarCurso(String codigo){
        Curso c = buscarCursoPorCodigo(codigo);
        if(c == null) return false;
        c.setProfesor(null); // romper relación
        return cursos.remove(c);
    }

    public boolean eliminarProfesor(String id){
        Profesor p = buscarProfesorPorId(id);
        if(p == null) return false;
        for(Curso c : new ArrayList<>(p.getCursos())) c.setProfesor(null);
        return profesores.remove(p);
    }

    public void reporteCantidadCursosPorProfesor(){
        System.out.println("== Cantidad de cursos por profesor ==");
        for(Profesor p : profesores)
            System.out.println(p.getNombre()+": "+p.getCursos().size());
    }
}