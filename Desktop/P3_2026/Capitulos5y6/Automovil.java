package Capitulos5y6;

public class Automovil extends Vehiculo {
    private int cantidadPuertas;

    public Automovil(int codigo, String marca, String modelo, int year, double velocidadActual, int cantidadPuertas) {
        super(codigo, marca, modelo, year, velocidadActual);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo el automóvil de manera suave en la ciudad.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + cantidadPuertas + " [Tipo: Automóvil]";
    }
}