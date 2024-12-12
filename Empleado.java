import java.util.ArrayList;
import java.util.List;

// Clase base abstracta
public abstract class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private String departamento;

    public Empleado(String nombre, int horasTrabajadas, String departamento) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public abstract double calcularSalario();

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }
}