package Laboratorio1.reto2;

import java.util.List;

public class Reto2 {

    public static void main(String[] args) {

        List<Integer> lista1 = List.of(14, 3, 27, 8, 51, 6);

        Carril1 carril1 = new Carril1();

        int maximo = carril1.calcularMaximo(lista1);

        System.out.println("Máximo: " + maximo);
    }
}
