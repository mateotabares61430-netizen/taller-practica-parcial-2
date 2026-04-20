package cuentabancariaherencia;

class CuentaCorriente extends CuentaBancaria {
    private double sobregiroPermitido;

    public CuentaCorriente(String titular, String numeroCuenta, double saldo, double sobregiroPermitido) {
        super(titular, numeroCuenta, saldo);
        this.sobregiroPermitido = sobregiroPermitido;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("❌ El monto a retirar debe ser mayor a 0.");
            return false;
        }
        double limiteTotal = saldo + sobregiroPermitido;
        if (monto > limiteTotal) {
            System.out.printf("❌ Retiro rechazado. Límite disponible (saldo + sobregiro): $%.2f%n", limiteTotal);
            return true;
        }
        saldo -= monto;
        if (saldo < 0) {
            System.out.printf("⚠️  Retiro de $%.2f realizado usando sobregiro. Saldo: $%.2f%n", monto, saldo);
        } else {
            System.out.printf("✅ Retiro de $%.2f realizado. Nuevo saldo: $%.2f%n", monto, saldo);
        }
        return false;
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
        System.out.printf("   Sobregiro permitido: $%.2f%n", sobregiroPermitido);
    }

}
