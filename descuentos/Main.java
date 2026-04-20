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

public class Main {
    public static void main(String[] args) {
        double precio = 80_000;

        Descuento[] descuentos = {
            new DescuentoPorcentaje("Descuento 20%", 20),
            new DescuentoFijo("Descuento fijo $15.000", 15_000),
            new DescuentoProgresivo("Descuento progresivo")
        };

        System.out.printf("Precio original: $%,.0f%n", precio);
        System.out.println("─".repeat(52));

        for (Descuento d : descuentos) {
            double descuento   = d.calcular(precio);
            double precioFinal = precio - descuento;
            System.out.printf("%-28s | Descuento: $%,8.0f | Final: $%,.0f%n",
                    d.nombre, descuento, precioFinal);
        }
    }
}
