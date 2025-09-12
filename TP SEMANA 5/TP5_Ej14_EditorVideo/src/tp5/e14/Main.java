package tp5.e14;

public class Main {
    public static void main(String[] args) {
        Proyecto pr = new Proyecto("Trailer POO", 3); // 3 minutos

        EditorVideo editor = new EditorVideo();
        Render r = editor.exportar("MP4", pr, "./exports/trailer_poo.mp4");

        System.out.println(r);
        System.out.println("Archivo generado en: " + r.getRutaSalida());
    }
}