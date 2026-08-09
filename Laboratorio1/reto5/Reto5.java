package Laboratorio1.reto5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Reto5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EstudianteA estudianteA = new EstudianteA();
        Set<Integer> hashSetFiltrado = estudianteA.crearHashSetSinMultiplosDe3(scanner);

        Set<Integer> treeSetFiltrado = EstudianteB.procesar(scanner);

        Set<Integer> combinado = new TreeSet<>();
        combinado.addAll(hashSetFiltrado);
        combinado.addAll(treeSetFiltrado);

        combinado.forEach(n -> System.out.println("Número en arena: " + n));

        scanner.close();
    }
}