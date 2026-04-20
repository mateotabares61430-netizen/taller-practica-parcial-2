package transporte;

class TransporteAereo extends MedioTransporte {
    private static final double TARIFA_KM       = 1_200;
    private static final double TASA_AEROPORTUARIA = 50_000;

    public TransporteAereo(String origen, String destino, double distanciaKm) {
        super(origen, destino, distanciaKm);
    }

    @Override public double calcularCosto() { return distanciaKm * TARIFA_KM + TASA_AEROPORTUARIA; }
    @Override public String getNombre()     { return "Avión"; }
}
