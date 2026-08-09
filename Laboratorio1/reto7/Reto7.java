package Laboratorio1.reto7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Jugador> jugadores = new ArrayList<>();

        System.out.println("=== El Juego del Calamar ===");
        System.out.print("¿Cuántos jugadores vas a ingresar? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Número del jugador " + (i + 1) + ": ");
            int numero = Integer.parseInt(sc.nextLine());
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Deuda del jugador " + (i + 1) + " (wones): ");
            long deuda = Long.parseLong(sc.nextLine());

            jugadores.add(new Jugador(numero, nombre, deuda));
        }

        EstudianteA estudianteA = new EstudianteA();
        EstudianteB estudianteB = new EstudianteB();

        long premioTotal = 150_000_000_000L;
        int eliminadosP1yP2 = 0;

        List<Jugador> pasanP1 = estudianteA.prueba1(jugadores);

        System.out.println("\nPrueba 1 — Luz Roja Luz Verde:");
        pasanP1.forEach(j -> System.out.println("  " + j.getNombre() + " PASA"));

        List<Jugador> eliminadosP1 = jugadores.stream()
                .filter(j -> !pasanP1.contains(j))
                .peek(j -> j.setEstado("ELIMINADO"))
                .collect(Collectors.toList());
        eliminadosP1.forEach(j -> System.out.println("  Jugador " + j.getNumero() + " ELIMINADO"));
        eliminadosP1yP2 += eliminadosP1.size();

        List<Jugador> pasanP2 = estudianteB.prueba2(pasanP1);

        System.out.println("\nPrueba 2 — Los Dados:");
        pasanP2.forEach(j -> System.out.println("  " + j.getNombre() + "(" + estudianteB.getDado(j.getNumero()) + ") PASA"));

        List<Jugador> eliminadosP2 = pasanP1.stream()
                .filter(j -> !pasanP2.contains(j))
                .peek(j -> j.setEstado("ELIMINADO"))
                .collect(Collectors.toList());
        eliminadosP2.forEach(j -> System.out.println("  Jugador " + j.getNumero() + " ELIMINADO"));
        eliminadosP1yP2 += eliminadosP2.size();

        List<Jugador> pasanP3 = pasanP2.stream()
                .filter(j -> j.getNombre().length() >= 5)
                .collect(Collectors.toList());

        System.out.println("\nPrueba 3 — Puente de Cristal:");
        pasanP3.forEach(j -> System.out.println("  " + j.getNombre() + " PASA"));

        List<Jugador> eliminadosP3 = pasanP2.stream()
                .filter(j -> !pasanP3.contains(j))
                .peek(j -> j.setEstado("ELIMINADO"))
                .collect(Collectors.toList());
        eliminadosP3.forEach(j -> System.out.println("  Jugador " + j.getNumero() + " ELIMINADO"));

        premioTotal += eliminadosP1yP2 * 50_000_000L;
        premioTotal += eliminadosP3.size() * 100_000_000L;

        List<Jugador> ganadores = pasanP3;
        long premioPorGanador = premioTotal / ganadores.size();

        ganadores.forEach(j -> {
            j.setEstado("GANADOR");
            j.sumarPremio(premioPorGanador);
        });

        System.out.println();
        ganadores.forEach(j -> System.out.println("¡Jugador " + j.getNumero() + " Eres el Ganador!"));
        System.out.println(String.format(new Locale("es", "CO"), "Premio: %,d wones", premioPorGanador));

        sc.close();
    }
}