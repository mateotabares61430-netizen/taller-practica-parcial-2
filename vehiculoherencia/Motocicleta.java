package vehiculoherencia;

class Motocicleta extends Vehiculo {

private String tipoManillar;

    public Motocicleta(String marca, String modelo, int velocidadMaxima, String tipoManillar) {
        super(marca, modelo, velocidadMaxima);
        this.tipoManillar = tipoManillar;
    }

    @Override
    public void describir() {
        System.out.println(" MOTOCICLETA ");
        super.describir();
        System.out.println("Tipo de manillar: " + tipoManillar);
    }
    
}
