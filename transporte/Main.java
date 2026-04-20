package transporte;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MedioTransporte> opciones = Arrays.asList(
            new TransporteAereo("Manizales", "Bogotá", 300),
            new TransporteTerrestreBus("Manizales", "Bogotá", 300),
            new TransporteTerrestreTaxi("Manizales", "Bogotá", 300)
        );

        System.out.println("Trayecto: Manizales → Bogotá (300 km)");
        System.out.println("─".repeat(40));
        System.out.printf("%-8s | %s%n", "Medio", "Costo");
        System.out.println("─".repeat(40));

        MedioTransporte masEconomico = opciones.get(0);

        for (MedioTransporte m : opciones) {
            System.out.printf("%-8s | $%,.0f%n", m.getNombre(), m.calcularCosto());
            if (m.calcularCosto() < masEconomico.calcularCosto()) {
                masEconomico = m;  // Sin instanceof: solo polimorfismo
            }
        }

        System.out.println("─".repeat(40));
        System.out.printf("✅ Más económico: %s → $%,.0f%n",
                masEconomico.getNombre(), masEconomico.calcularCosto());
    }
}
