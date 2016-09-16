package pe.edu.ulima.listados.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sodm on 12/09/2016.
 */
public class GestorAlumnos {
    public static List<Alumno> alumnos = new ArrayList<>();

    public static void agregarAlumnos(Alumno alumno){
        alumno.setId(alumnos.size());
        alumnos.add(alumno);
    }

    public static List<Alumno> obtenerAlumnos(){
        return alumnos;
    }
}
