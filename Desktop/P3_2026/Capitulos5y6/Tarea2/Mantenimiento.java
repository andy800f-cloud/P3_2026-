public class Mantenimiento {
package Capitulos5y6;

public class Mantenimiento extends Empleado {
    private String areaAsignada;

    public Mantenimiento(int codigo, String nombre, String apellido, double salario, String areaAsignada) {
        super(codigo, nombre, apellido, salario);
        this.areaAsignada = areaAsignada;
    }

    public String getAreaAsignada() {
        return areaAsignada;
    }

    @Override
    public void realizarTrabajo() {
        System.out.println("Realizando labores de limpieza y mantenimiento en el área de: " + areaAsignada + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Área Asignada: " + areaAsignada + " [Tipo: Mantenimiento]";
    }
}
}
