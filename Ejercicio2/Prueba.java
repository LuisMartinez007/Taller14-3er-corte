package Taller14.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        // Crear instancias de Persona, Estudiante y Profesor
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        // Usar polimorfismo para invocar el método presentarse
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}

