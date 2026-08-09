package Laboratorio1.reto5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class EstudianteA {

    public Set<Integer> crearHashSetSinMultiplosDe3(Scanner scanner) {
        Set<Integer> numeros = new HashSet<>();

        System.out.print("¿Cuántos números vas a ingresar (HashSet)? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = Integer.parseInt(scanner.nextLine());
            numeros.add(numero);
        }

        return numeros.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }
}