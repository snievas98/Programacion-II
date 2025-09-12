package tp5.e3;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("J. K. Rowling", "Reino Unido");
        Editorial ed = new Editorial("Bloomsbury", "Londres");

        Libro l = new Libro("Harry Potter y la piedra filosofal", "978-0747532699", autor, ed);

        System.out.println(l);
    }
}