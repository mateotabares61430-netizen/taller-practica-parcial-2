package cuentabancariaherencia;

class CuentaAhorros extends CuentaBancaria {

    private double tasaInteres;

    public CuentaAhorros(String titular, String numeroCuenta, double saldo, double tasaInteres) {
        super(titular, numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;

    }
    
     public void aplicarInteres() {
        double interes = saldo * tasaInteres;
        saldo += interes;
        System.out.printf(" Interés del %.1f%% aplicado: +$%.2f | Nuevo saldo: $%.2f%n",
                tasaInteres * 100, interes, saldo);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
        System.out.printf("   Tasa de interés: %.1f%%%n", tasaInteres * 100);
    } 

}
