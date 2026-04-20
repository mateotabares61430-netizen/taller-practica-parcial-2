package empleado2;

class EmpleadoMedioTiempo extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoMedioTiempo(String nombre, String id, double salarioBase,
                                int horasTrabajadas, double valorHora) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalarioMensual() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public String toString() {
        return String.format(
            "[MEDIO TIEMPO]%n" +
            "  %s%n" +
            "  Horas trabajadas : %d h%n" +
            "  Valor por hora   : $%,.2f%n" +
            "  Salario mensual  : $%,.2f",
            super.toString(), horasTrabajadas, valorHora, calcularSalarioMensual()
        );
    }
}
