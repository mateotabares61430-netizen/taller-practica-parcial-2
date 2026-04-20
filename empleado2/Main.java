package empleado2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empleado> nomina = new ArrayList<>();

        // Empleados tiempo completo
        nomina.add(new EmpleadoTiempoCompleto("Ana López",    "TC-001", 3_500_000, 200_000));
        nomina.add(new EmpleadoTiempoCompleto("Carlos Ruiz",  "TC-002", 4_200_000, 350_000));
        nomina.add(new EmpleadoTiempoCompleto("María Torres", "TC-003", 2_900_000, 150_000));

        // Empleados medio tiempo
        nomina.add(new EmpleadoMedioTiempo("Luis Gómez",    "MT-001", 0, 80,  18_000));
        nomina.add(new EmpleadoMedioTiempo("Sofía Herrera", "MT-002", 0, 60,  22_500));
        nomina.add(new EmpleadoMedioTiempo("Juan Pérez",    "MT-003", 0, 100, 15_000));


        double totalNomina = 0;

        for (Empleado e : nomina) {
            System.out.println(e);                          // Llama al toString() de cada subclase
            totalNomina += e.calcularSalarioMensual();      // Polimorfismo en acción
            System.out.println("--------------------------------------------------");
        }

        System.out.printf("%n TOTAL NÓMINA DEL MES: $%,.2f%n", totalNomina);
    }
}
