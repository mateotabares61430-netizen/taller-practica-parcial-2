package vehiculoherencia;

class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil(String marca, String modelo, int velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void describir() {
        System.out.println(" AUTOMÓVIL ");
        super.describir();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
    
}
