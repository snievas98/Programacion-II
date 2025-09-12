package tp5.e12;

public class Main {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Santiago Nievas", "20-40545665-3");
        Impuesto imp = new Impuesto("Ganancias", 125000.0, c);

        Calculadora calc = new Calculadora();
        calc.imprimirResultado(imp);

        // También podés usar el valor devuelto:
        double total = calc.calcular(imp);
        System.out.println("Verificación -> total: $" + total);
    }
}