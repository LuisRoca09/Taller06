public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento) {
        super(nombre, 0, horasTrabajadas, departamento);
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return getHorasTrabajadas() * tarifaHora;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Horas Trabajadas: " + getHorasTrabajadas());
        System.out.println("Tarifa por Hora: " + tarifaHora);
        System.out.println("Departamento: " + getDepartamento());
    }
}
