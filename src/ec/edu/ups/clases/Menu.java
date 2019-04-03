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
public class Menu 
{

    @Override
    public String toString() 
    {
        return "Menu{" + "nombreBebidas=" + nombreBebidas + ", nombreComida=" + nombreComida + ", costoComida=" + costoComida + '}';
    }
    private String nombreBebidas;
    private String nombreComida;
    private double costoComida;
    
    public void comida( ){
        
}
     public void bebidas( ){
    
}  
     public void costos(){
         
}
     public void setnombrebebidas(String nombreBebidas){
      this.nombreBebidas=nombreBebidas;   
     }
    
    public void setnombreComida(String nombreComida)
    {
        this.nombreComida=nombreComida; 
    }
    
    public void setcostoComida(double costoComida)
    {
        this.costoComida=costoComida;
    } 
    
    public String getnombreBebidas()
    {
        return this.nombreBebidas; 
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
