/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */
public class Empleado 
{

    @Override
    public String toString() 
    {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", sueldoEmpleado=" + sueldoEmpleado + ", entradaEmpleado=" + entradaEmpleado + '}';
    }
    private String nombreEmpleado;
    private double sueldoEmpleado;
    private double entradaEmpleado;
    
       public void nombres( ){
    
}
     public void cedula( ){
    
}  
     public void asignar(){
         
}
    
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
