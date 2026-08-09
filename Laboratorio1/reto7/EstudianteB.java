package Laboratorio1.reto7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class EstudianteB {

    private final Random random = new Random();
    private final Map<Integer, Integer> ultimosDados = new HashMap<>();

    public List<Jugador> prueba2(List<Jugador> jugadores) {
        return jugadores.stream()
                .peek(jugador -> ultimosDados.put(jugador.getNumero(), random.nextInt(6) + 1))
                .filter(jugador -> ultimosDados.get(jugador.getNumero()) % 2 == 0)
                .collect(Collectors.toList());
    }

    public int getDado(int numeroJugador) {
        return ultimosDados.get(numeroJugador);
    }
}
