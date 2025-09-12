package tp5.e7;

public class Motor {
    private String tipo;     // p.ej. "1.8 NA", "2.0 Turbo", "Eléctrico"
    private int potenciaHP;  // caballos de potencia

    public Motor(String tipo, int potenciaHP) {
        this.tipo = tipo;
        this.potenciaHP = potenciaHP;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo='" + tipo + '\'' + ", potenciaHP=" + potenciaHP + '}';
    }
}