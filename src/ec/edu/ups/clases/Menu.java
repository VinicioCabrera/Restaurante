/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author PCX
 */
public class Menu 
{
    private String nombreSeccion;
    private String nombreComida;
    private double costoComida;
    
    
    public void setnombreSeccion(String nombreSeccion)
    {
        this.nombreSeccion=nombreSeccion; 
    }
    
    public void setnombreComida(String nombreComida)
    {
        this.nombreComida=nombreComida; 
    }
    
    public void setcostoComida(double costoComida)
    {
        this.costoComida=costoComida;
    } 
    
    public String getnombreSeccion()
    {
        return this.nombreSeccion; 
    }
    
    public String getnombreComida()
    {
        return this.nombreComida; 
    }
    
    public double getcostoComida()
    {
        return this.costoComida;
    } 
}
