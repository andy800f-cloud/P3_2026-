public class Administrativo {
package Capitulos5y6;

public class Administrativo extends Empleado implements Bonificable {
    private String departamento;
    private String cargo;

    public Administrativo(int codigo, String nombre, String apellido, double salario, String departamento, String cargo) {
        super(codigo, nombre, apellido, salario);
        this.departamento = departamento;
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public void realizarTrabajo() {
        System.out.println("Gestionando trámites en el departamento de " + departamento + " como " + cargo + ".");
    }

    @Override
    public double calcularBono() {
        // Bono fijo del 10% del salario para el personal administrativo
        return getSalario() * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento + ", Cargo: " + cargo + " [Tipo: Administrativo]";
    }
}
}
