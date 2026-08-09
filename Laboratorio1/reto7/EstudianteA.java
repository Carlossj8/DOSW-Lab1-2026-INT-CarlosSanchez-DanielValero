package Laboratorio1.reto7;

import java.util.List;
import java.util.stream.Collectors;

public class EstudianteA {

    public List<Jugador> prueba1(List<Jugador> jugadores) {
        List<Jugador> eliminados = jugadores.stream()
                .filter(j -> j.getDeuda() > 170_000_000)
                .collect(Collectors.toList());

        eliminados.forEach(j -> j.setEstado("ELIMINADO"));

        return jugadores.stream()
                .filter(j -> j.getEstado().equals("ACTIVO"))
                .collect(Collectors.toList());
    }
}