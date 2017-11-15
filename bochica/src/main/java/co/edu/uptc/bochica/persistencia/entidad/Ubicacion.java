package co.edu.uptc.bochica.persistencia.entidad;

import javax.persistence.*;

public class Ubicacion {

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Double latitud;

    private Double longitud;

    @ManyToOne 
    private Persona persona;

    private DosisAplicada dosisAplicada;

    private Enfermedad enfermedad;

    /**
     * @generated
     */
    public Double getLatitud() {
        return this.latitud;
    }

    /**
     * @generated
     */
    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    /**
     * @generated
     */
    public Double getLongitud() {
        return this.longitud;
    }

    /**
     * @generated
     */
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    /**
     * @generated
     */
    public DosisAplicada getDosisAplicada() {
        return this.dosisAplicada;
    }

    /**
     * @generated
     */
    public void setDosisAplicada(DosisAplicada dosisAplicada) {
        this.dosisAplicada = dosisAplicada;
    }

    /**
     * @generated
     */
    public Enfermedad getEnfermedad() {
        return this.enfermedad;
    }

    /**
     * @generated
     */
    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    /**
     * @generated
     */
    public Persona getPersona() {
        return this.persona;
    }

    /**
     * @generated
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
