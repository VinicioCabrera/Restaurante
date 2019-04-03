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
public class Comidas {

    @Override
    public String toString() {
        return "Comidas{" + "nombrecomida=" + nombrecomida + ", cantidadplatos=" + cantidadplatos + ", nombrespostres=" + nombrespostres + '}';
    }
    private String nombrecomida;
    private int cantidadplatos;
    private String nombrespostres;
    
     public void Bebidas ( ){
    
}
     public void tazas( ){
    
}  
     public void cuchillos(){
         
}
    
    public void setnombreComida(String nombrecomida)
    {
        this.nombrecomida=nombrecomida; 
    }
    
    public void setcantidadPlatos(int cantidadplatos)
    {
        this.cantidadplatos=cantidadplatos; 
    }
    public void setnombresPostres(String nombrespostres){
        this.nombrespostres=nombrespostres;
    }
    
    public String getnombreComida()
    {
        return this.nombrecomida; 
    }
    public int getcantidadPlatos()
    {
        return this.cantidadplatos; 
    }
    public String getnombresPostres()
    {
        return this.nombrespostres; 
    }
}  

