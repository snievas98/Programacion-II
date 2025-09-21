public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // relación bidireccional

    public Curso(String codigo, String nombre){
        this.codigo = codigo; this.nombre = nombre;
    }

    public String getCodigo(){ return codigo; }
    public String getNombre(){ return nombre; }
    public Profesor getProfesor(){ return profesor; }

    // Mantiene sincronía 1→N sin recursión infinita
    public void setProfesor(Profesor p){
        if(this.profesor == p) return;
        Profesor anterior = this.profesor;
        this.profesor = p;
        if(anterior != null) anterior._quitarCursoInterno(this);
        if(p != null) p._agregarCursoInterno(this);
    }

    @Override public String toString(){
        return "Curso{"+codigo+" - "+nombre+", prof="+(profesor!=null?profesor.getNombre():"—")+"}";
    }
}