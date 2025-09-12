package tp5.e9;

public class Main {
    public static void main(String[] args) {
        // Entidades externas (se inyectan en los préstamos)
        Socio s1 = new Socio("Santiago Nievas", "40545665");
        Socio s2 = new Socio("Lucía Gómez", "40999888");

        Libro l1 = new Libro("Clean Code", "9780132350884");
        Libro l2 = new Libro("Effective Java", "9780134685991");

        // La biblioteca compone y administra sus préstamos
        Biblioteca biblio = new Biblioteca("Central");

        var p1 = biblio.prestar(l1, s1);
        var p2 = biblio.prestar(l2, s2);

        // Devolver uno para ver ambos estados
        biblio.devolver(p1);

        System.out.println(biblio);
    }
}