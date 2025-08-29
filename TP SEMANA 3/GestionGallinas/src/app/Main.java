package app;

public class Main {
    public static void main(String[] args) {
        // Crear 2–3 gallinas
        Gallina g1 = new Gallina();
        g1.idGallina = 1; g1.edad = 1;

        Gallina g2 = new Gallina();
        g2.idGallina = 2; g2.edad = 2;

        Gallina g3 = new Gallina();
        g3.idGallina = 3; g3.edad = 1;

        // Acciones
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        g3.ponerHuevo();

        // Mostrar estado
        g1.mostrarEstado();
        g2.mostrarEstado();
        g3.mostrarEstado();
    }
}