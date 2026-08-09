package Laboratorio1.reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carril1 carril1 = new Carril1();

        System.out.print("¿Cuántos números deseas ingresar para la Lista 1?: ");
        int n1 = scanner.nextInt();
        List<Integer> lista1 = new ArrayList<>();
        System.out.println("Ingresa los " + n1 + " números de la Lista 1:");
        for (int i = 0; i < n1; i++) {
            lista1.add(scanner.nextInt());
        }

        System.out.print("\n¿Cuántos números deseas ingresar para la Lista 2?: ");
        int n2 = scanner.nextInt();
        List<Integer> lista2 = new ArrayList<>();
        System.out.println("Ingresa los " + n2 + " números de la Lista 2:");
        for (int i = 0; i < n2; i++) {
            lista2.add(scanner.nextInt());
        }

        System.out.println("\n--- RESULTADOS ---");

        procesarLista(lista1, "Lista 1", carril1);
        System.out.println();
        procesarLista(lista2, "Lista 2", carril1);

        scanner.close();
    }

    private static void procesarLista(List<Integer> lista, String nombreLista, Carril1 carril1) {
        int menor = lista.stream()
                .min((a, b) -> a.compareTo(b))
                .orElse(0);

        long cantidad = lista.stream()
                .count();

        int maximo = carril1.calcularMaximo(lista);

        boolean maximoEsMultiploDeDos = carril1.esMultiploDeDos(maximo);
        boolean esDivisorDe2 = (maximo != 0) && (2 % maximo == 0);
        boolean esPar = cantidad % 2 == 0;

        System.out.println(nombreLista + " => max:" + maximo + " min:" + menor + " cant: " + cantidad);
        System.out.println("¿" + maximo + " múltiplo de 2? " + (maximoEsMultiploDeDos ? "Si" : "No"));
        System.out.println("¿" + maximo + " divisor de 2? " + (esDivisorDe2 ? "Si" : "No"));

        if (esPar) {
            System.out.println("¿Cantidad (" + cantidad + ") es par? Si");
        } else {
            System.out.println("¿Cantidad (" + cantidad + ") es impar? Si");
        }
    }
}