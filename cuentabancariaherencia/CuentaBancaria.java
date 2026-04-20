package cuentabancariaherencia;

import java.time.LocalDate;

public class CuentaBancaria {

    protected String titular;
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

     public CuentaBancaria(String numeroCuenta) {
        this(numeroCuenta, 0);
    }

    public CuentaBancaria(String numeroCuenta, double depositoInicial) {

        if (numeroCuenta == null || numeroCuenta.isEmpty()) {
            throw new IllegalArgumentException("El numero de cuenta no puede ser null ni estar vacio");
        }
        if (depositoInicial < 0) {
            throw new IllegalArgumentException("El deposito inicial no puede ser negativo");
        }

        this.numeroCuenta  = numeroCuenta;
        this.saldo         = depositoInicial;
    }
    
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor a 0");
        }
        this.saldo += monto;
        System.out.println("  Depósito exitoso de $" + monto + " → Saldo actual: $" + this.saldo);
    }
        
    public boolean retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor a 0");
        }
        if (monto > this.saldo) {
            System.out.println("  Saldo insuficiente. Saldo disponible: $" + this.saldo);
            return false;
        }
        this.saldo -= monto;
        System.out.println("  Retiro exitoso de $" + monto + " → Saldo actual: $" + this.saldo);
        return true;
    }

    public void consultarSaldo() {
        System.out.printf(" Titular: %s | Cuenta: %s | Saldo: $%.2f%n",
                titular, numeroCuenta, saldo);
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }


    
}
