package Taller14.Ejercicio1;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        double area = ancho * alto;
        System.out.println("El área del rectángulo es: " + area);
    }
}

