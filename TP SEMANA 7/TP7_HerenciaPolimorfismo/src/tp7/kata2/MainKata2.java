package tp7.kata2;

public class MainKata2 {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(3),
            new Rectangulo(2, 5),
            new Circulo(1.5)
        };

        for (Figura f : figuras) {
            System.out.printf("%s → área = %.2f%n", f.getNombre(), f.calcularArea());
        }
    }
}