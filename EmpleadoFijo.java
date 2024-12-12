public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual) {
        super(nombre, salarioBase, horasTrabajadas, departamento);
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = getSalarioBase();
        salarioTotal += bonoAnual;
        return salarioTotal;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Bono Anual: " + bonoAnual);
        System.out.println("Departamento: " + getDepartamento());
    }
}

