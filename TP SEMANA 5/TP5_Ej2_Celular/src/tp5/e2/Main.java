package tp5.e2;

public class Main {
    public static void main(String[] args) {
        Bateria bat = new Bateria("BN-45", 5000);
        Usuario u = new Usuario();
        u.nombre = "Santiago";
        u.dni = "40545665";

        Celular cel = new Celular("352099123456789", "Motorola", "G84", bat, u);

        System.out.println(cel);
        System.out.println(u.celular);
    }
}