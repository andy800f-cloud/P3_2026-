package EjercicioEnClase;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan Perez", "Ana Lopez", "Carlos Ruiz", "Maria Diaz", "Luis Marte"};
        String[] correos = {"juan@ucne.edu", "ana@gmail.com", "carlos@ucne.edu", "maria@yahoo.com", "luis@ucne.edu"};
        double[] parcial1 = {8.5, 9.0, 6.3, 4.5, 7.8};
        double[] parcial2 = {7.0, 8.5, 5.9, 6.0, 9.2};
        double[] parcial3 = {9.0, 7.5, 4.8, 8.0, 6.5};

        // 1. Reporte general
        System.out.println("NOMBRE               PROMEDIO    ESTADO");
        System.out.println("--------------------------------------");

        double sumaTotalPromedios = 0;
        double mayorPromedio = -1;
        double menorPromedio = 11;
        String mejorEstudiante = "";
        String peorEstudiante = "";
        
        int aprobados = 0;
        int reprobados = 0;

        double[] promedios = new double[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            promedios[i] = (parcial1[i] + parcial2[i] + parcial3[i]) / 3.0;
            sumaTotalPromedios += promedios[i];

            String estado = (promedios[i] >= 6.0) ? "Aprobado" : "Reprobado";

            if (promedios[i] >= 6.0) {
                aprobados++;
            } else {
                reprobados++;
            }

            if (promedios[i] > mayorPromedio) {
                mayorPromedio = promedios[i];
                mejorEstudiante = nombres[i];
            }

            if (promedios[i] < menorPromedio) {
                menorPromedio = promedios[i];
                peorEstudiante = nombres[i];
            }

            // Formato de tabla alineado
            System.out.printf("%-20s %-11.2f %-10s\n", nombres[i], promedios[i], estado);
        }

        // 2. Estadísticas del grupo
        double promedioGeneral = sumaTotalPromedios / nombres.length;
        System.out.println("\n--- ESTADÍSTICAS DEL GRUPO ---");
        System.out.printf("Promedio general del grupo: %.2f\n", promedioGeneral);
        System.out.println("Estudiante con el promedio más alto: " + mejorEstudiante + " (" + mayorPromedio + ")");
        System.out.println("Estudiante con el promedio más bajo: " + peorEstudiante + " (" + menorPromedio + ")");
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);

        // 3. Filtro de correos institucionales
        System.out.println("\nEstudiantes con correo institucional:");
        for (int i = 0; i < correos.length; i++) {
            if (correos[i].endsWith("@ucne.edu")) {
                System.out.println("- " + nombres[i].toUpperCase() + "    " + correos[i]);
            }
        }

        // 4. Búsqueda por nombre
        System.out.println("\n--- PRUEBA DE BÚSQUEDA ---");
        String busqueda = "lopez";
        int indiceEncontrado = buscarEstudiante(nombres, busqueda);

        if (indiceEncontrado != -1) {
            System.out.println("Estudiante encontrado: " + nombres[indiceEncontrado]);
            System.out.println("Correo: " + correos[indiceEncontrado]);
            System.out.printf("Parciales: %.1f, %.1f, %.1f\n", parcial1[indiceEncontrado], parcial2[indiceEncontrado], parcial3[indiceEncontrado]);
            System.out.printf("Promedio: %.2f\n", promedios[indiceEncontrado]);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Método de búsqueda requerido
    public static int buscarEstudiante(String[] nombres, String busqueda) {
        String busquedaMinuscula = busqueda.toLowerCase();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].toLowerCase().contains(busquedaMinuscula)) {
                return i; 
            }
        }
        return -1; 
    }
}