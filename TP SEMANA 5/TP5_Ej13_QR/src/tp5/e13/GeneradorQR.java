package tp5.e13;

public class GeneradorQR {
    // Dependencia de creación: el generador instancia y devuelve el QR
    public CodigoQR generar(String valor, Usuario u) {
        if (valor == null || valor.isBlank() || u == null) {
            throw new IllegalArgumentException("Valor y usuario no pueden ser nulos/vacíos");
        }
        return new CodigoQR(valor, u);
    }
}