package tp5.e14;

import java.time.LocalDateTime;

public class Render {
    private String formato;          // p.ej. "MP4", "MOV"
    private Proyecto proyecto;       // asociación 1–1
    private LocalDateTime fechaHora; // metadato útil
    private String rutaSalida;       // simulada

    public Render(String formato, Proyecto proyecto, String rutaSalida) {
        this.formato = formato;
        this.proyecto = proyecto;
        this.rutaSalida = rutaSalida;
        this.fechaHora = LocalDateTime.now();
    }

    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }
    public String getRutaSalida() { return rutaSalida; }

    @Override
    public String toString() {
        return "Render{" +
                "formato='" + formato + '\'' +
                ", proyecto=" + proyecto +
                ", fechaHora=" + fechaHora +
                ", rutaSalida='" + rutaSalida + '\'' +
                '}';
    }
}