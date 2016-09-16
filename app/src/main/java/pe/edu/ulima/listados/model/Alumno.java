package pe.edu.ulima.listados.model;

/**
 * Created by sodm on 12/09/2016.
 */
public class Alumno {
    private long id;
    private String nombre;
    private int edad;
    private int foto;
    private int latitud;
    private int longitud;

    public Alumno(long id, String nombre, int edad, int foto) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.foto = foto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
