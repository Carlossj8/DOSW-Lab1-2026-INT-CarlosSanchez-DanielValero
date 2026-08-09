package Laboratorio1.reto4;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EstudianteA estudianteA = new EstudianteA();
        Map<String, Integer> hashMap = estudianteA.crearHashMap(scanner);

        String resultado = hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> "Clave: " + entry.getKey().toUpperCase()
                        + " | Valor: " + entry.getValue())
                .collect(Collectors.joining("\n"));

        System.out.println(resultado);

        scanner.close();
    }
}