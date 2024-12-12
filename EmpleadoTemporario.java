public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato) {
        super(nombre, salarioBase, horasTrabajadas, departamento);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Meses de Contrato: " + mesesContrato);
        System.out.println("Departamento: " + getDepartamento());
    }
}

