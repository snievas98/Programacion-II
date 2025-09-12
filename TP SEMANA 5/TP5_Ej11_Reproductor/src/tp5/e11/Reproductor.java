package tp5.e11;

public class Reproductor {
    // Dependencia de uso: recibe la canción como parámetro (no la guarda)
    public void reproducir(Cancion c) {
        System.out.println("▶ Sonando: " + c.getTitulo() + " - " + c.getArtista().getNombre());
    }

    public void pausar()  { System.out.println("⏸ Pausa"); }
    public void detener() { System.out.println("⏹ Detenido"); }
}