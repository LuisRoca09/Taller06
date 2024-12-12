public class EmpleadoTemporario extends Empleado {
    private double salarioBase;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato) {
        super(nombre, horasTrabajadas, departamento);
        this.salarioBase = salarioBase;
        this.mesesContrato = mesesContrato;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (mesesContrato * 100); // Ejemplo de cálculo
    }
}

