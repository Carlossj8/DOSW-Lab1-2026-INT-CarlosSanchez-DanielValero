package Laboratorio1.reto4;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("HashMap: ");
        EstudianteA estudianteA = new EstudianteA();
        Map<String, Integer> hashMap = estudianteA.crearHashMap(scanner);

        System.out.println("Hashtable: ");
        List<Map.Entry<String, Integer>> datosB = new ArrayList<>();
        System.out.print("¿Cuántos pares vas a ingresar? ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Clave " + (i + 1) + ": ");
            String clave = scanner.nextLine();

            System.out.print("Valor " + (i + 1) + ": ");
            int valor = Integer.parseInt(scanner.nextLine());

            datosB.add(new AbstractMap.SimpleEntry<>(clave, valor));
        }

        Hashtable<String, Integer> hashtable = EstudianteB.procesar(datosB);

        Map<String, Integer> combinado = new HashMap<>(hashMap);
        combinado.putAll(hashtable);

        String resultado = combinado.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(e -> "Clave: " + e.getKey().toUpperCase() + " | Valor: " + e.getValue())
                .collect(Collectors.joining("\n"));

        System.out.println("\n=== Resultado combinado ===");
        System.out.println(resultado);

        scanner.close();
    }
}