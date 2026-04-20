package empleado2;

class Empleado {
    protected String nombre;
    protected String id;
    protected double salarioBase;

    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioMensual() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %-20s | ID: %-6s | Salario base: $%,.2f", 
                nombre, id, salarioBase);
    }
}
