package Laboratorio1.reto3;

public class CanalB {

    public String invertirMensaje(String mensaje) {

        StringBuffer buffer = new StringBuffer(mensaje);

        return buffer.reverse().toString();
    }
}