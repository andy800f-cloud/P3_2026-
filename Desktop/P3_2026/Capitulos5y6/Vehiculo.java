package Capitulos5y6;

public abstract class Vehiculo {
    private int codigo;
    private String marca;
    private String modelo;
    private int year;
    private double velocidadActual; 

    public Vehiculo(int codigo, String marca, String modelo, int year, double velocidadActual) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.velocidadActual = velocidadActual;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public abstract void conducir();

    @Override
    public String toString() {
        return "Código: " + codigo + ", Marca: " + marca + ", Modelo: " + modelo + 
               ", Año: " + year + ", Velocidad Actual: " + velocidadActual + " km/h";
    }
}