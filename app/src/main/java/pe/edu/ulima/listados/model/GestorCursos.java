package pe.edu.ulima.listados.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sodm on 12/09/2016.
 */
public class GestorCursos {

    public List<Curso> listarCursos(){
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("PDM", 3));
        cursos.add(new Curso("Programacion Internet", 4));
        return cursos;
    }
}
