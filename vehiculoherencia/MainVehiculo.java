package vehiculoherencia;

public class MainVehiculo {

public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla", 180, 4);
        Motocicleta moto = new Motocicleta("Honda", "CBR600", 240, "deportivo");
        Camion camion = new Camion("Volvo", "FH16", 120, 25.5);

        auto.describir();
        System.out.println();
        moto.describir();
        System.out.println();
        camion.describir();
    }
    
}
