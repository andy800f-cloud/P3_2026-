public class Main {
package Capitulos5y6;

public class Main {
    public static void main(String[] args) {
        Empleado[] personal = new Empleado[8];
        
        personal[0] = new Profesor(1, "Juan", "Pérez", 45000.0, "Matemáticas", 20);
        personal[1] = new Administrativo(2, "María", "Gómez", 35000.0, "Admisiones", "Coordinadora");
        personal[2] = new Mantenimiento(3, "Carlos", "Martínez", 22000.0, "Edificio A");
        personal[3] = new Profesor(4, "Ana", "Rodríguez", 48000.0, "Programación I", 25);
        personal[4] = new Administrativo(5, "Luis", "Fernández", 38000.0, "Finanzas", "Contador");
        personal[5] = new Mantenimiento(6, "Rosa", "Ramírez", 21500.0, "Jardinería y Áreas Verdes");
        personal[6] = new Profesor(7, "José", "Torres", 42000.0, "Base de Datos", 18);
        personal[7] = new Mantenimiento(8, "Pedro", "Lora", 23000.0, "Laboratorios de Computación");

        double totalSalarios = 0;
        double mayorSalario = -1;
        Empleado empleadoEstrella = null;

        int contProfesor = 0;
        int contAdministrativo = 0;
        int contMantenimiento = 0;

        System.out.println("=== RECORRIENDO EL PERSONAL DE LA UNIVERSIDAD ===\n");
        
        for (Empleado e : personal) {
        
            System.out.println("Tipo real: " + e.getClass().getSimpleName());
            System.out.println(e.toString());

            
            e.realizarTrabajo();

            if (e instanceof Bonificable) {
                double bono = ((Bonificable) e).calcularBono();
                System.out.println(">> Bono asignado: $" + bono);
            } else {
                System.out.println(">> Este puesto no aplica para bonos.");
            }

    
            totalSalarios += e.getSalario();

            if (e.getSalario() > mayorSalario) {
                mayorSalario = e.getSalario();
                empleadoEstrella = e;
            }

            
            if (e instanceof Profesor) {
                contProfesor++;
            } else if (e instanceof Administrativo) {
                contAdministrativo++;
            } else if (e instanceof Mantenimiento) {
                contMantenimiento++;
            }

            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n=== ESTADÍSTICAS FINALES ===");
        System.out.println("Total de salarios de todos los empleados: $" + totalSalarios);
        System.out.println("Empleado con el salario más alto: " + empleadoEstrella.getNombre() + " " + empleadoEstrella.getApellido() + " ($" + empleadoEstrella.getSalario() + ")");
        System.out.println("\nConteo por tipo de empleado:");
        System.out.println("- Profesores: " + contProfesor);
        System.out.println("- Administrativos: " + contAdministrativo);
        System.out.println("- Mantenimiento: " + contMantenimiento);
    }
}
}
