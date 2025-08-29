package app;

public class Main {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Andrómeda";
        nave.combustible = 50;

        nave.mostrarEstado();     // 50/100
        nave.despegar();          // OK
        nave.avanzar(60);         // Falla (no alcanza)
        nave.recargarCombustible(60); // Sube hasta 100 (tope)
        nave.avanzar(60);         // Ahora sí
        nave.mostrarEstado();     // 40/100
    }
}