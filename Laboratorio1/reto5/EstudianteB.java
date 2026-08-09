package Laboratorio1.reto5;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EstudianteB {


    public static TreeSet<Integer> procesar(Scanner sc) {
        TreeSet<Integer> numeros = new TreeSet<>();

        System.out.print("¿Cuántos números vas a ingresar (TreeSet)? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = Integer.parseInt(sc.nextLine());
            numeros.add(numero);
        }

        return numeros.stream()
                .filter(num -> num % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
