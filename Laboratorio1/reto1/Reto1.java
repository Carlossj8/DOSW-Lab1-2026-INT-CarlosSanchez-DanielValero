package Laboratorio1.reto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto1 {
    private static ArrayList<Estudiante> estudiantes;

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduce el numero de estudiantes");
        estudiantes = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Nombre del estudiante");
            String nombre = scanner.nextLine();

            System.out.println("Semestre");
            String semestre = scanner.nextLine();

            System.out.println("Edad");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Correo");
            String correo = scanner.nextLine();

            Estudiante estudiante = new Estudiante(nombre, edad, semestre, correo);
            estudiantes.add(estudiante);

        }
        scanner.close();

        MensajeBienvenida mensaje = new MensajeBienvenida();
        mensaje.imprimirMensaje(estudiantes);
    }

    public static ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;

    }
}