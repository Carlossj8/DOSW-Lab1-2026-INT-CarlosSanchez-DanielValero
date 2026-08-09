package Laboratorio1.reto4;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
public class EstudianteB {

    public static Hashtable<String, Integer> procesar(List<Map.Entry<String, Integer>> datos) {
        Hashtable<String, Integer> tabla = new Hashtable<>();

        datos.stream()
                .forEach(par -> tabla.put(par.getKey(), par.getValue()));

        return tabla;
    }
}
