package Laboratorio1.reto6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Reto6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EstudianteA estudianteA = new EstudianteA();
        EstudianteB estudianteB = new EstudianteB();

        Map<String, Runnable> maquina = new HashMap<>();

        Stream.of("SALUDAR", "DESPEDIR", "CANTAR", "DANZAR")
                .forEach(comando -> maquina.put(comando, estudianteA.ejecutarComando(comando)));

        Stream.of("BROMEAR", "GRITAR", "SUSURRAR", "ANALIZAR")
                .forEach(comando -> maquina.put(comando, estudianteB.ejecutarComando(comando)));

        System.out.print("¿Cuántos comandos vas a ingresar? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Comando " + (i + 1) + ": ");
            String comando = sc.nextLine().toUpperCase();

            maquina.getOrDefault(comando, () -> System.out.println("Comando \"" + comando + "\" no reconocido."))
                    .run();
        }

        sc.close();
    }
}