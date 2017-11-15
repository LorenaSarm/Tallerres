package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import co.edu.uptc.bochica.servicio.*;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas
 * como servicios REST
 *
 * @author daperador
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.edu.uptc.bochica.servicio.DosisAplicadaServicio.class);
        resources.add(co.edu.uptc.bochica.servicio.DosisServicio.class);
        resources.add(co.edu.uptc.bochica.servicio.EnfermedadServicio.class);
        resources.add(co.edu.uptc.bochica.servicio.HistorialServicio.class);
        resources.add(co.edu.uptc.bochica.servicio.PersonaServicio.class);
        resources.add(co.edu.uptc.bochica.servicio.UbicacionServicio.class);
        resources.add(co.edu.uptc.bochica.servicio.VacunaServicio.class);
    }

}
