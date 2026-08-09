package Laboratorio1.reto6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EstudianteA estudianteA = new EstudianteA();

        Map<String, Runnable> comandos = new HashMap<>();
        comandos.put("SALUDAR", estudianteA.ejecutarComando("SALUDAR"));
        comandos.put("DESPEDIR", estudianteA.ejecutarComando("DESPEDIR"));
        comandos.put("CANTAR", estudianteA.ejecutarComando("CANTAR"));
        comandos.put("DANZAR", estudianteA.ejecutarComando("DANZAR"));

        System.out.print("¿Cuántos comandos deseas ejecutar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el comando " + (i + 1) + ": ");
            String comando = scanner.nextLine().toUpperCase();

            Runnable accion = comandos.get(comando);
            if (accion != null) {
                accion.run();
            } else {
                System.out.println("Comando no disponible.");
            }
        }

        scanner.close();
    }
}