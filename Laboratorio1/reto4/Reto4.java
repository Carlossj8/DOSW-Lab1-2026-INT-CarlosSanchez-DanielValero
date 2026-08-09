package Laboratorio1.reto4;
import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Map.Entry<String, Integer>> datosB = new ArrayList<>();

        System.out.println("=== Estudiante B: ingreso de datos para Hashtable ===");
        System.out.print("¿Cuántos pares vas a ingresar? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Clave " + (i + 1) + ": ");
            String clave = sc.nextLine();

            System.out.print("Valor " + (i + 1) + ": ");
            int valor = Integer.parseInt(sc.nextLine());

            datosB.add(new AbstractMap.SimpleEntry<>(clave, valor));
        }

        Hashtable<String, Integer> mapaB = EstudianteB.procesar(datosB);

        System.out.println("\n=== Resultado Hashtable (Estudiante B) ===");
        mapaB.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(e -> "Clave: " + e.getKey() + " | Valor: " + e.getValue())
                .forEach(System.out::println);

        sc.close();
    }
}
