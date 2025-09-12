package tp5.e5;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Santiago Nievas", "40545665");

        Producto p1 = new Producto("Mouse", 8500);
        Producto p2 = new Producto("Teclado", 12500);
        Producto p3 = new Producto("Monitor 24\"", 120000);

        Pedido ped = new Pedido("A-0001", cli);
        ped.agregarItem(p1, 2);
        ped.agregarItem(p2, 1);
        ped.agregarItem(p3, 1);

        System.out.println(ped);
    }
}