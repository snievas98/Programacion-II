package tp5.e13;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("Santiago Nievas", "snievas@example.com");

        GeneradorQR gen = new GeneradorQR();
        CodigoQR qr = gen.generar("https://miapp.com/auth?token=abc123", user);

        System.out.println(qr);                 // muestra datos del QR generado
        System.out.println("Dueño: " + qr.getUsuario().getNombre());
        System.out.println("Contenido: " + qr.getValor());
    }
}