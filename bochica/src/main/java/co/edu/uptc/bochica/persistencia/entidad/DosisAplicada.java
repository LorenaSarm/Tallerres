package co.edu.uptc.bochica.persistencia.entidad;

import java.util.Date;
import javax.persistence.*;

public class DosisAplicada {

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Date fecha;

    private Historial historial;

    private Dosis dosis;

    /**
     * @generated
     */
    public Date getFecha() {
        return this.fecha;
    }

    /**
     * @generated
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @generated
     */
    public Dosis getDosis() {
        return this.dosis;
    }

    /**
     * @generated
     */
    public void setDosis(Dosis dosis) {
        this.dosis = dosis;
    }

    /**
     * @generated
     */
    public Historial getHistorial() {
        return this.historial;
    }

    /**
     * @generated
     */
    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

}
