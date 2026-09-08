package Capitulos5y6;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(int codigo, String marca, String modelo, int year, double velocidadActual, int cilindrada) {
        super(codigo, marca, modelo, year, velocidadActual);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo la motocicleta a alta velocidad por la carretera.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada + "cc [Tipo: Motocicleta]";
    }
}