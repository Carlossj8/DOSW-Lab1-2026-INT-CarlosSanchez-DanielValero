package Laboratorio1.reto5;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        TreeSet<Integer> arenaA = EstudianteA.procesar(sc); // sin múltiplos de 3
        TreeSet<Integer> arenaB = EstudianteB.procesar(sc); // sin múltiplos de 5

        TreeSet<Integer> arenaUnificada = new TreeSet<>(arenaA);
        arenaUnificada.addAll(arenaB); // TreeSet ya resuelve el conflicto de merge (descarta duplicados)

        System.out.println("\n=== Resultado final: Batalla de Conjuntos ===");
        arenaUnificada.stream()
                .filter(numero -> true) // ya vienen filtrados, se deja el filter por requisito técnico
                .forEach(numero -> System.out.println("Número en arena: " + numero));

        sc.close();
    }
}
