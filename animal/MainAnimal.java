package animal;

public class MainAnimal {

public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Rex"),
            new Gato("Michi"),
            new Vaca("Lola")
        };
        for (Animal a : animales) {
            System.out.println(a.nombre + " dice: " + a.sonido());
        }
    }
    
}
