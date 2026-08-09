package Laboratorio1.reto7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jugador> jugadores = new ArrayList<>();

        System.out.print("¿Cuántos jugadores vas a ingresar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Deuda: ");
            long deuda = Long.parseLong(scanner.nextLine());

            jugadores.add(new Jugador(numero, nombre, deuda));
        }

        EstudianteA estudianteA = new EstudianteA();
        List<Jugador> sobrevivenP1 = estudianteA.prueba1(jugadores);

        System.out.println("\nPrueba 1 — Luz Roja Luz Verde:");

        String nombresPasan = sobrevivenP1.stream()
                .map(Jugador::getNombre)
                .collect(Collectors.joining(", "));
        System.out.println("  " + nombresPasan + " PASAN");

        jugadores.stream()
                .filter(j -> j.getEstado().equals("ELIMINADO"))
                .forEach(j -> System.out.println("  Jugador " + j.getNumero() + " ELIMINADO"));

        scanner.close();
    }
}