package tp5.e12;

public class Calculadora {
    // Dependencia de uso: recibe el impuesto por parámetro (no lo guarda)
    public double calcular(Impuesto imp) {
        // Cálculo simple: retornar el monto tal cual.
        // Si quisieras reglas, podrías ramificar por imp.getTipo().
        return imp.getMonto();
    }

    public void imprimirResultado(Impuesto imp) {
        double total = calcular(imp);
        System.out.println("Total a pagar por " + imp.getTipo() + " de " +
                imp.getContribuyente().getNombre() + ": $" + total);
    }
}