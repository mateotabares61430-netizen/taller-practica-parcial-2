package empleado2;

class EmpleadoTiempoCompleto extends Empleado {
    private double beneficiosSalud;

    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase, double beneficiosSalud) {
        super(nombre, id, salarioBase);
        this.beneficiosSalud = beneficiosSalud;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase + beneficiosSalud;
    }

    @Override
    public String toString() {
        return String.format(
            "[TIEMPO COMPLETO]%n" +
            "  %s%n" +
            "  Beneficios salud : $%,.2f%n" +
            "  Salario mensual  : $%,.2f",
            super.toString(), beneficiosSalud, calcularSalarioMensual()
        );
    }
}
