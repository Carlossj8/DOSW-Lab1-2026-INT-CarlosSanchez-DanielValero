package Laboratorio1.reto3;

import java.util.Scanner;

public class Reto3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el mensaje cifrado: ");
        String mensaje = scanner.nextLine();

        CanalB canalB = new CanalB();

        String resultado = canalB.invertirMensaje(mensaje);

        System.out.println("Mensaje descifrado: " + resultado);

        scanner.close();
    }
}
