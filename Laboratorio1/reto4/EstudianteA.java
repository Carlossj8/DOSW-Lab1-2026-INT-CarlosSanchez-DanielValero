package Laboratorio1.reto4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EstudianteA {

    public Map<String, Integer> crearHashMap(Scanner scanner) {
        Map<String, Integer> mapa = new HashMap<>();

        System.out.print("¿Cuántos pares (clave, valor) desea ingresar en el HashMap? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la clave " + (i + 1) + ": ");
            String clave = scanner.nextLine();

            System.out.print("Ingrese el valor para \"" + clave + "\": ");
            int valor = Integer.parseInt(scanner.nextLine());

            mapa.putIfAbsent(clave, valor);
        }

        return mapa;
    }
}