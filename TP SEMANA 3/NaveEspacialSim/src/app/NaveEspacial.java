package app;

public class NaveEspacial {
    String nombre;
    int combustible;                  // unidades actuales
    static final int CAPACIDAD_MAX = 100;
    static final int CONSUMO_POR_UNIDAD = 1; // 1 combustible por unidad de distancia

    public boolean despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " despegó con " + combustible + " de combustible.");
            return true;
        } else {
            System.out.println("No hay combustible suficiente para despegar.");
            return false;
        }
    }

    public boolean avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("Distancia inválida: " + distancia);
            return false;
        }
        int consumo = distancia * CONSUMO_POR_UNIDAD;
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia +
                    " unidades. Combustible restante: " + combustible);
            return true;
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia +
                    " unidades. Disponible: " + combustible);
            return false;
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida para recargar.");
            return;
        }
        int antes = combustible;
        combustible = Math.min(CAPACIDAD_MAX, combustible + cantidad);
        System.out.println("Recarga: +" + cantidad + " (de " + antes +
                " a " + combustible + ", tope " + CAPACIDAD_MAX + ")");
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " +
                combustible + "/" + CAPACIDAD_MAX);
    }
}