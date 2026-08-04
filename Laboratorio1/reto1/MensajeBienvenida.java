package Laboratorio1.reto1;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class MensajeBienvenida {

    public void imprimirMensaje(ArrayList<Estudiante> estudiantes){

        String datos = estudiantes.stream()
                .map(estudiante -> estudiante.getNombre() + ", estudiante de " + estudiante.getSemestre() + " semestre de " + estudiante.getEdad() + " años")
                .collect(Collectors.joining(", y "));

        String correos = estudiantes.stream()
                .map(estudiante -> estudiante.getCorreo())
                .collect(Collectors.joining(" y "));

        System.out.println("¡Hola, bienvenidos! Somos la pareja conformada por "
                + datos
                + ". Nuestros correos son: "
                + correos);
    }


}
