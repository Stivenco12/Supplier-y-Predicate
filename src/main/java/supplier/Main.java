package supplier;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
    // Crear un Supplier que proporciona un número aleatorio
    //    Supplier<Integer> generarNumeroAleatorio = () -> {
    //        Random random = new Random();
    //        return random.nextInt(100); // Número aleatorio entre 0 y 99
    //    };
    // Usar el Supplier para obtener un número aleatorio
    //    Integer numeroAleatorio = generarNumeroAleatorio.get();
    //    System.out.println("Número aleatorio: " + numeroAleatorio);
    // Obtener otro número aleatorio
    //    Integer otroNumeroAleatorio = generarNumeroAleatorio.get();
    //    System.out.println("Otro número aleatorio: " + otroNumeroAleatorio);
    

    // ejemplo 2

    // Crear un array de nombres posibles
    //    String[] nombres = {"Carlos", "Ana", "Jose", "Maria", "Luis"};
        // Crear un Set para rastrear nombres ya usados
    //    Set<String> nombresUsados = new HashSet<>();
        // Crear un Supplier que proporciona instancias de Persona sin nombresrepetidos
    //    Supplier<Persona> generarPersonaAleatoria = () -> {
    //    Random random = new Random();
    //    String nombreAleatorio = null;
        // Encontrar un nombre que no haya sido usado
    //    while (true) {
    //        nombreAleatorio = nombres[random.nextInt(nombres.length)];
    //        if (!nombresUsados.contains(nombreAleatorio)) {
    //            nombresUsados.add(nombreAleatorio);
    //            break;
    //        }
    // }
    //     int edadAleatoria = 18 + random.nextInt(43); // Edad entre 18 y 60
    //     return new Persona(nombreAleatorio, edadAleatoria);
    // };
    // // Usar el Supplier para obtener instancias de Persona
    // for (int i = 0; i < nombres.length; i++) {
    //     Persona persona = generarPersonaAleatoria.get();
    //     System.out.println(persona);
    // }


    // ejemplo 3

        Predicate<Integer> esPar = n -> n % 2 == 0;
        System.out.println("4 es par: " + esPar.test(4));
        System.out.println("7 es par: " + esPar.test(7));
    }
}