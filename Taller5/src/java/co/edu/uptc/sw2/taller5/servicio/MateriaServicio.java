/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/Materia")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MateriaServicio {

    /**
     * retorna una lista con las Materias que se encuentran en la base de
     * datos
     *
     * @return retorna una lista de MateriaDTO
     * @generated
     */
    @GET
    public List<MateriaDTO> obtenerTodasMaterias() {
        return ProveedorInformacion.instance().obtenerTodos(MateriaDTO.class);
    }

    /**
     * @param id identificador del elemento Materia
     * @return Materia del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public MateriaDTO obtenerMateria(@PathParam("id") Long id) {
        return (MateriaDTO) ProveedorInformacion.instance().obtener(MateriaDTO.class, id);
    }

    /**
     * almacena la informacion de Materia
     *
     * @param dto Materia a guardar
     * @return Materia con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public MateriaDTO guardarMateria(MateriaDTO dto) {
        return (MateriaDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Materia con el identificador dado
     *
     * @param id identificador del Materia
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarMateria(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(MateriaDTO.class, id);
    }

    @GET
    @Path("/consulta")
    public List<MateriaDTO> consultarMateria(@QueryParam("nombre") String nombre) {
        List<MateriaDTO> lista = obtenerTodasMaterias();
        List<MateriaDTO> respuesta = new ArrayList<>();
        for (MateriaDTO m : lista) {
            if (m.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
                respuesta.add(m);
            }
        }
        return respuesta;
    }
}
