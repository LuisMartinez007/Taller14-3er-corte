package Taller14.Ejercicio3;

public class Prueba{
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal.hacerSonido();
        
        // Intento de invocar el método ladrar, que solo existe en Perro
        // animal.ladrar(); // Esto causará un error de compilación
    }
}
