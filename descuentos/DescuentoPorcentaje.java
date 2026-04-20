package descuentos;

class DescuentoPorcentaje extends Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(String nombre, double porcentaje) {
        super(nombre);
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcular(double precioOriginal) {
        return precioOriginal * (porcentaje / 100);
    }
}
