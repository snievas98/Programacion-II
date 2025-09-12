package tp5.e11;

public class Main {
    public static void main(String[] args) {
        Artista a = new Artista("Daft Punk", "Electrónica");
        Cancion c1 = new Cancion("Harder, Better, Faster, Stronger", 224, a);
        Cancion c2 = new Cancion("One More Time", 320, a);

        Reproductor rep = new Reproductor();
        rep.reproducir(c1);
        rep.pausar();
        rep.reproducir(c2);
        rep.detener();

        System.out.println("Info pista actual: " + c2);
    }
}