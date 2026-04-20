package descuentos;

class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(String nombre, double montoFijo) {
        super(nombre);
        this.montoFijo = montoFijo;
    }

    @Override
    public double calcular(double precioOriginal) {
        return Math.min(montoFijo, precioOriginal); // Nunca descuenta más que el precio
    }
}
