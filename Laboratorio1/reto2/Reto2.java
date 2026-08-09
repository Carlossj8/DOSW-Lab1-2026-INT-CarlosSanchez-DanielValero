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
        boolean maximoEsMultiploDeDos = carril1.esMultiploDeDos(maximo);

        boolean esDivisorDe2 = (maximo != 0) && (2 % maximo == 0);

        System.out.println("\n--- Resultados Combinados ---");
        System.out.println("Mínimo: " + menor);
        System.out.println("Máximo: " + maximo);
        System.out.println("Cantidad de datos ingresados: " + cantidad);
        System.out.println("¿El máximo es múltiplo de 2?: " +
                (maximoEsMultiploDeDos ? "Sí" : "No"));
        System.out.println("¿El máximo es divisor de 2?: " +
                (esDivisorDe2 ? "Sí" : "No"));

        scanner.close();
    }
}
