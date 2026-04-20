package vehiculoherencia;

class Camion extends Vehiculo {

     private double capacidadToneladasCarga;

    public Camion(String marca, String modelo, int velocidadMaxima, double capacidadToneladasCarga) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadToneladasCarga = capacidadToneladasCarga;
    }

    @Override
    public void describir() {
        System.out.println(" CAMIÓN ");
        super.describir();
        System.out.println("Capacidad de carga: " + capacidadToneladasCarga + " toneladas");
    }
    
}
