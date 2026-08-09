package Laboratorio1.reto3;

import java.util.Scanner;

public class Reto3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el mensaje interceptado: ");
        String mensaje = scanner.nextLine();

        CanalA canalA = new CanalA();
        String resultadoCanalA = canalA.amplificarMensaje(mensaje);

        System.out.println("Canal A: \"" + resultadoCanalA + "\"");

        scanner.close();
    }
}