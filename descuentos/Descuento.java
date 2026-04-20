package descuentos;

class Descuento {
    protected String nombre;

    public Descuento(String nombre) {
        this.nombre = nombre;
    }

    public double calcular(double precioOriginal) {
        return 0.0;
    }
}
