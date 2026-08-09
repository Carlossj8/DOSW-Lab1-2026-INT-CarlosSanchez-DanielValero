package Laboratorio1.reto6;

public class EstudianteA {

    public Runnable ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
                return () -> System.out.println("¡Saludos, viajero del Tiempo y del código!");
            case "DESPEDIR":
                return () -> System.out.println("Hasta pronto, que el código te acompañe.");
            case "CANTAR":
                return () -> System.out.println("La la la, compilando sin parar");
            case "DANZAR":
                return () -> System.out.println("Girando en modo fiesta.");
            default:
                return () -> System.out.println("Comando no reconocido");
        }
    }
}