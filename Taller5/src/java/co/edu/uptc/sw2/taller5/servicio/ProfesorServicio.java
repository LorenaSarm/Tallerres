package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/Profesor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfesorServicio {
    
    /**
     * retorna una lista con los Profesores que se encuentran en la base de datos
     *
     * @return retorna una lista de ProfesorDTO
     * @generated
     */
    @GET
    public List<ProfesorDTO> obtenerTodosProfesores() {
        return ProveedorInformacion.instance().obtenerTodos(ProfesorDTO.class);
    }

    /**
     * @param id identificador del elemento Profesor
     * @return Profesor del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public ProfesorDTO obtenerProfesor(@PathParam("id") Long id) {
        return (ProfesorDTO) ProveedorInformacion.instance().obtener(ProfesorDTO.class, id);
    }

    /**
     * almacena la informacion de Profesor
     *
     * @param dto Profesor a guardar
     * @return Profesor con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public ProfesorDTO guardarProfesor(ProfesorDTO dto) {
        return (ProfesorDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Profesor con el identificador dado
     *
     * @param id identificador del Profesor
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarProfesor(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(ProfesorDTO.class, id);
    }
    
    @GET
    @Path("/consulta")
    public List<ProfesorDTO> consultarProfesor(@QueryParam("nombres") String nombre){
        List<ProfesorDTO> lista=obtenerTodosProfesores();
        List<ProfesorDTO> respuesta=new ArrayList<>();
        for(ProfesorDTO p:lista){
            if(p.getNombres().toUpperCase().contains(nombre.toUpperCase())){
                respuesta.add(p);
            }
        }
        return respuesta;
    }
}
