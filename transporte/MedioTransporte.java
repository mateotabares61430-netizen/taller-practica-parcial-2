package transporte;

class MedioTransporte {
    protected String origen;
    protected String destino;
    protected double distanciaKm;

    public MedioTransporte(String origen, String destino, double distanciaKm) {
        this.origen      = origen;
        this.destino     = destino;
        this.distanciaKm = distanciaKm;
    }

    public double calcularCosto() { return 0; }
    public String getNombre()     { return "Transporte genérico"; }
}
