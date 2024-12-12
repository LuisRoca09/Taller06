public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento) {
        super(nombre, horasTrabajadas, departamento);
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return getHorasTrabajadas() * tarifaHora;
    }
}