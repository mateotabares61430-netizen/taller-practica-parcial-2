package descuentos;

class DescuentoProgresivo extends Descuento {

    public DescuentoProgresivo(String nombre) {
        super(nombre);
    }

    @Override
    public double calcular(double precioOriginal) {
        if      (precioOriginal > 100_000) return precioOriginal * 0.15;
        else if (precioOriginal >  50_000) return precioOriginal * 0.10;
        else                               return precioOriginal * 0.05;
    }
}
