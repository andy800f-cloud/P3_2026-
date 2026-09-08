package Capitulos5y6;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[5];
        
        flota[0] = new Automovil(1, "Toyota", "Corolla", 2022, 60.5, 4);
        flota[1] = new Motocicleta(2, "Yamaha", "R3", 2023, 80.0, 320);
        flota[2] = new Camion(3, "Mack", "Anthem", 2021, 45.0, 15000.0);
        flota[3] = new Automovil(4, "Honda", "Civic", 2024, 50.0, 2);
        flota[4] = new Motocicleta(5, "Suzuki", "AX100", 2020, 40.0, 100);

        System.out.println("--- RECORRIENDO LA FLOTA DE VEHÍCULOS ---");
        for (Vehiculo v : flota) {
            System.out.println("\nClase real: " + v.getClass().getSimpleName());
            System.out.println(v.toString());
            v.conducir();

            if (v instanceof Cargable) {
                System.out.println(">> Este vehículo es CARGABLE.");
                Camion c = (Camion) v;
                c.cargar(5000.0);
                c.descargar();
            }
        }
    }
}