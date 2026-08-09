package Laboratorio1.reto5;

import java.util.Scanner;
import java.util.Set;

public class Reto5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Estudiante A: HashSet ===");
        EstudianteA estudianteA = new EstudianteA();
        Set<Integer> hashSetFiltrado = estudianteA.crearHashSetSinMultiplosDe3(scanner);

        System.out.println("\n=== Resultado HashSet sin múltiplos de 3 ===");
        hashSetFiltrado.forEach(n -> System.out.println("Número en arena: " + n));

        scanner.close();
    }
}