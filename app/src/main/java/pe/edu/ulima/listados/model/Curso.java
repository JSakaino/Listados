package pe.edu.ulima.listados.model;

/**
 * Created by sodm on 12/09/2016.
 */
public class Curso {
    private String nombre;
    private int credito;

    public Curso(String nombre, int credito) {
        this.nombre = nombre;
        this.credito = credito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
