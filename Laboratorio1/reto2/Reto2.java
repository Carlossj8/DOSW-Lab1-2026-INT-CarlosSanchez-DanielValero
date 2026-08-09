package Laboratorio1.reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.print("¿Cuántos números deseas ingresar a la lista?: ");
        int n = scanner.nextInt();

        System.out.println("Ingresa los " + n + " números:");
        for (int i = 0; i < n; i++) {
            lista.add(scanner.nextInt());
        }

        int menor = lista.stream()
                .min((a, b) -> a.compareTo(b))
                .orElse(0);

        long cantidad = lista.stream()
                .count();

        Carril1 carril1 = new Carril1();

        int maximo = carril1.calcularMaximo(lista);

        System.out.println("\n--- Resultados Combinados ---");
        System.out.println("Mínimo: " + menor);
        System.out.println("Máximo: " + maximo);
        System.out.println("Cantidad de datos ingresados: " + cantidad);

        scanner.close();
    }
}
