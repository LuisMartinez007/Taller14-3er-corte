package Taller14.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        // Crear instancias de Circulo y Rectangulo
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        // Usar polimorfismo para calcular las áreas
        circulo.calcularArea();
        rectangulo.calcularArea();
    }
}
