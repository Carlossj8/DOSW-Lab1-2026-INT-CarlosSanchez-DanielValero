package Laboratorio1.reto3;

import java.util.stream.Stream;
import java.util.Scanner;

public class Reto3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el mensaje interceptado: ");
        String mensaje = scanner.nextLine();

        CanalA canalA = new CanalA();
        CanalB canalB = new CanalB();


        String resultadoCanalA = canalA.amplificarMensaje(mensaje);
        System.out.println("Canal A: \"" + resultadoCanalA + "\"");

        String resultado = Stream.of(mensaje)
                .map(msg -> canalB.invertirMensaje(canalA.amplificarMensaje(msg)))
                .findFirst()
                .orElse("");

        System.out.println("Descifrado final:");
        System.out.println("\"" + resultado + "\"");

        scanner.close();
    }
}
