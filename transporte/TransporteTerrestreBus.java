package transporte;

class TransporteTerrestreBus extends MedioTransporte {
    private static final double TARIFA_KM = 180;

    public TransporteTerrestreBus(String origen, String destino, double distanciaKm) {
        super(origen, destino, distanciaKm);
    }

    @Override public double calcularCosto() { return distanciaKm * TARIFA_KM; }
    @Override public String getNombre()     { return "Bus"; }
}
