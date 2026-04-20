package instrumento;

public class Main {

    // Método estático que recibe un arreglo de Instrumento (puede tener cualquier subclase)
    public static void darConcierto(Instrumento[] banda) {
        System.out.println("¡El concierto comienza!");
        for (Instrumento instrumento : banda) {
            System.out.print("   " + instrumento + " → ");
            instrumento.tocar();   // Polimorfismo: Java decide en ejecución qué tocar() llamar
        }
        System.out.println(" ¡Concierto finalizado!");
    }

    public static void main(String[] args) {

        // Arreglo mixto de instrumentos
        Instrumento[] banda = {
            new Guitarra("Fender Stratocaster", "Estados Unidos"),
            new Piano("Steinway", "Alemania"),
            new Bateria("Pearl Export", "Japón"),
            new Guitarra("Gibson Les Paul", "Estados Unidos"),
            new Instrumento("Instrumento misterioso", "Desconocido")  // Clase base directa
        };

        darConcierto(banda);
    }
}
