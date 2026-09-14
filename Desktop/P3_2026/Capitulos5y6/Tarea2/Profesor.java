public class Profesor {
package Capitulos5y6;

public class Profesor extends Empleado implements Bonificable {
    private String asignatura;
    private int horasClase;

    public Profesor(int codigo, String nombre, String apellido, double salario, String asignatura, int horasClase) {
        super(codigo, nombre, apellido, salario);
        this.asignatura = asignatura;
        this.horasClase = horasClase;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getHorasClase() {
        return horasClase;
    }

    @Override
    public void realizarTrabajo() {
        System.out.println("Impartiendo clases de la asignatura: " + asignatura + " (" + horasClase + " horas).");
    }

    @Override
    public double calcularBono() {
      
        return horasClase * 50.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Asignatura: " + asignatura + ", Horas de Clase: " + horasClase + " [Tipo: Profesor]";
    }
}
}
