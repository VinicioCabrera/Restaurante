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
public class Reservacion 
{

    @Override
    public String toString() 
    {
        return "Reservacion{" + "codigoReservacion=" + codigoReservacion + ", numeroMesaReservacion=" + numeroMesaReservacion + ", horarioReservacion=" + horarioReservacion + '}';
    }
    private int codigoReservacion;
    private int numeroMesaReservacion;
    private double horarioReservacion;
    
       public void Dia( ){
    
}
     public void Hora( ){
    
}  
     public void costos(){
         
}
    
    public void setcodigoReservacion(int codigoReservacion)
    {
        this.codigoReservacion=codigoReservacion; 
    }
    
    public void setnumeroMesaReservacion(int numeroMesaReservacion)
    {
        this.numeroMesaReservacion=numeroMesaReservacion; 
    }
    
    public void sethorarioReservacion(double horarioReservacion)
    {
        this.horarioReservacion=horarioReservacion;
    }  
    
    public int getcodigoReservacion()
    {
        return this.codigoReservacion; 
    }
    
    public int getnumeroMesaReservacion()
    {
        return this.numeroMesaReservacion; 
    }
    
    public double gethorarioReservacion()
    {
        return this.horarioReservacion; 
    }
}
