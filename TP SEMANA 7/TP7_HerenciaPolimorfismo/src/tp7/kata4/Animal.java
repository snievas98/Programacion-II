package tp7.kata4;

public class Animal {
    public String hacerSonido() {
        return "(sonido genérico)";
    }

    public String describirAnimal() {
        return getClass().getSimpleName() + " hace: " + hacerSonido();
    }
}