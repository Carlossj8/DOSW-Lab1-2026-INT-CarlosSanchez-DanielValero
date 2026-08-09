package Laboratorio1.reto3;

public class CanalA {

    /**
     * Recibe el mensaje cifrado y lo amplifica repitiéndolo 3 veces
     * separado por espacio usando StringBuilder.
     */
    public String amplificarMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder();

        sb.append(mensaje)
                .append(" ")
                .append(mensaje)
                .append(" ")
                .append(mensaje);

        return sb.toString();
    }
}