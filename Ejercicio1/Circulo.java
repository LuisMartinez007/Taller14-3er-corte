package Taller14.Ejercicio1;

public class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}
