package Laboratorio1.reto2;

import java.util.List;

public class Carril1 {

    public int calcularMaximo(List<Integer> numeros) {

        return numeros.stream()
                .reduce((a, b) -> a > b ? a : b)
                .orElse(0);
    }
    public boolean esMultiploDeDos(int numero) {
        return numero % 2 == 0;
    }
}
