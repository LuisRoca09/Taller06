public class EmpleadoFijo extends Empleado {
    private double salarioBase;
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual) {
        super(nombre, horasTrabajadas, departamento);
        this.salarioBase = salarioBase;
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonoAnual;
    }
}
