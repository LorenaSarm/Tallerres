/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author LORENA MALDONADO
 */
@Path("servicioRest")
public class ServiceRest {
    
    @GET
    @Path("sumar")
    public int sumar(@QueryParam("a")int a, @QueryParam("b")int b) {
        return a + b;
    }
    
    @GET
    @Path("restar")
    public int restar(@QueryParam("a")int a, @QueryParam("b")int b) {
        return a - b;
    }
    
    @GET
    @Path("multiplicar")
    public int multiplicar(@QueryParam("a")int a, @QueryParam("b")int b) {
        return a * b;
    }
    
    @GET
    @Path("dividir")
    public int dividir(@QueryParam("a")int a, @QueryParam("b")int b) {
        return a / b;
    }
    
    @GET
    @Path("calcularPerimetroCirculo")
    public double calcularPerimetroCirculo(@QueryParam("a")int r) {
        return 2*Math.PI*r;
    }
    
    @GET
    @Path("calcularPerimetroCuadrado")
    public int calcularPerimetroCuadrado(@QueryParam("a")int a) {
        return 4*a;
    }
    
    @GET
    @Path("calcularPerimetroRectangulo")
    public int calcularPerimetroRectangulo(@QueryParam("a")int a, @QueryParam("b")int b) {
        return (2*a)+(2*b);
    }
    
    @GET
    @Path("calcularPerimetroTriangulo")
    public int calcularPerimetroTriangulo(@QueryParam("a")int a, @QueryParam("b")int b,@QueryParam("c")int c) {
        return a+b+c;
    }
}
