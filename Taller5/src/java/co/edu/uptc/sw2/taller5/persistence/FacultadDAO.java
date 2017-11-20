/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller5.persistence;

import co.edu.uptc.sw2.taller5.persistence.entities.Facultad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LORENA MALDONADO
 */
@Stateless
public class FacultadDAO {

    @PersistenceContext
    private EntityManager em;

    public Facultad obtenerPorId(Long id) {
        return em.find(Facultad.class, id);

    }
}
