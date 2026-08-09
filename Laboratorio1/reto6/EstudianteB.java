package Laboratorio1.reto6;

public class EstudianteB {

    public Runnable ejecutarComando(String comando) {
        switch (comando) {
            case "BROMEAR":
                return () -> System.out.println("¿Por qué la RAM rompió con la CPU?\n  Porque necesitaba espacio...");

            case "GRITAR":
                return () -> System.out.println("¡AAAAAH! (grito simulado del sistema)");

            case "SUSURRAR":
                return () -> System.out.println("(susurro) ...esto es un secreto entre bits...");

            case "ANALIZAR":
                return () -> System.out.println("Analizando datos... ¡Eres increíble!");

            default:
                return () -> System.out.println("Comando \"" + comando + "\" no reconocido.");
        }
    }
}
