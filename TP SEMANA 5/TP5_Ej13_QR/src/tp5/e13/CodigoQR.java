package tp5.e13;

import java.time.LocalDateTime;

public class CodigoQR {
    private String valor;          // el contenido codificado (ej.: URL, token, etc.)
    private Usuario usuario;       // asociación 1–1
    private LocalDateTime creado;  // metadato útil

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
        this.creado = LocalDateTime.now();
    }

    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }
    public LocalDateTime getCreado() { return creado; }

    @Override
    public String toString() {
        return "QR{valor='" + valor + "', usuario=" + usuario + ", creado=" + creado + "}";
    }
}