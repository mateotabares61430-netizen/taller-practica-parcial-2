package cuentabancariaherencia;

public class Main {

public static void main(String[] args) {

        System.out.println("========== CUENTA AHORROS ==========");
        CuentaAhorros ahorros = new CuentaAhorros("Ana López", "AH-001", 1000.0, 0.05);
        ahorros.consultarSaldo();
        ahorros.depositar(500.0);
        ahorros.retirar(200.0);
        ahorros.aplicarInteres();
        ahorros.consultarSaldo();

        System.out.println();

        System.out.println("========== CUENTA CORRIENTE ==========");
        CuentaCorriente corriente = new CuentaCorriente("Carlos Ruiz", "CC-002", 300.0, 500.0);
        corriente.consultarSaldo();
        corriente.retirar(200.0);   // Retiro normal
        corriente.retirar(400.0);   // Usa sobregiro
        corriente.retirar(300.0);   // Excede el límite total
        corriente.consultarSaldo();
    }
    
}
