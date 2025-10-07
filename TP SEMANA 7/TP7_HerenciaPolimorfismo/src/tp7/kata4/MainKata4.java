package tp7.kata4;

import java.util.List;

public class MainKata4 {
    public static void main(String[] args) {
        List<Animal> animales = List.of(new Perro(), new Gato(), new Vaca(), new Animal());
        for (Animal a : animales) {
            System.out.println(a.describirAnimal());
        }
    }
}