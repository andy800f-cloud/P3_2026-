package Capitulos5y6;

public class Camion extends Vehiculo implements Cargable {
    private double capacidadMaximaCarga;
    private double cargaActual;

    public Camion(int codigo, String marca, String modelo, int year, double velocidadActual, double capacidadMaximaCarga) {
        super(codigo, marca, modelo, year, velocidadActual);
        this.capacidadMaximaCarga = capacidadMaximaCarga;
        this.cargaActual = 0.0;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión con precaución debido a su peso.");
    }

    @Override
    public void cargar(double peso) {
        if ((cargaActual + peso) <= capacidadMaximaCarga) {
            cargaActual += peso;
            System.out.println("Carga exitosa. Carga actual: " + cargaActual + " kg.");
        } else {
            System.out.println("¡Error! Excede la capacidad máxima de carga del camión (" + capacidadMaximaCarga + " kg).");
        }
    }

    @Override
    public void descargar() {
        cargaActual = 0.0;
        System.out.println("El camión ha sido descargado por completo.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad Máx: " + capacidadMaximaCarga + "kg, Carga Actual: " + cargaActual + "kg [Tipo: Camión]";
    }
}