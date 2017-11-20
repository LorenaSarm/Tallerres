package co.edu.uptc.sw2.taller5.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author LORENA MALDONADO
 */
@Entity
public class Facultad {
    
    @Id
    private long id;

    private String nombre;
    
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
}
