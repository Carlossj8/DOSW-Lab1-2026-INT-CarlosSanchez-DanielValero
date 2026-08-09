package Laboratorio1.reto3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CanalA {

    public String amplificarMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder(
                Stream.of(mensaje, mensaje, mensaje)
                        .collect(Collectors.joining(" "))
        );

        return sb.toString();
    }
}