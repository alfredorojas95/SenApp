package estructura;

import java.io.Serializable;

/**
 * Created by wilfr on 05-06-2017.
 */

public class Palabra implements Serializable {
    private int imagen;
    private String nombre;
    private String descripcion;

    public Palabra(int imagen, String nombre, String descripcion){
        this.imagen = imagen;
        this.nombre=nombre;
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
