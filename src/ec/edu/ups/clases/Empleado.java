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
public class Empleado 
{
    private String nombreEmpleado;
    private double sueldoEmpleado;
    private double entradaEmpleado;
    
    
    public void setnombreEmpleado(String nombreEmpleado)
    {
        this.nombreEmpleado=nombreEmpleado; 
    }
       
    public void setsueldoEmpleado(double sueldoEmpleado)
    {
        this.sueldoEmpleado=sueldoEmpleado; 
    }
    
    public void setentradaEmpelado(double entradaEmpleado)
    {
        this.entradaEmpleado=entradaEmpleado;
    } 
    
    public String getnombreEmpleado()
    {
        return this.nombreEmpleado; 
    }
    
    public double getsueldoEmpleado()
    {
        return this.sueldoEmpleado; 
    }
    
    public double getentradaEmpleado()
    {
        return this.entradaEmpleado; 
    }
}
