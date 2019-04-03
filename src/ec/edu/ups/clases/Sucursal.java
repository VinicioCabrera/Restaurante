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
public class Sucursal 
{

    @Override
    public String toString() 
    {
        return "Sucursal{" + "numeroRes=" + numeroRes + ", nombreRes=" + nombreRes + ", direccionRes=" + direccionRes + '}';
    }
    private int numeroRes;
    private String nombreRes;
    private String direccionRes;
    
       public void nombreLocal( ){
    
}
     public void codigoLocal( ){
    
}  
     public void direccionLocal(){
         
}
    
    public void setnumeroRes(int numeroRes)
    {
        this.numeroRes=numeroRes; 
    }
    
    public void setnombreRes(String nombreRes)
    {
        this.nombreRes=nombreRes; 
    }
    
    public void setdireccionRes(String direccionRes)
    {
        this.direccionRes=direccionRes;
    } 
    
    public int getnumeroRes()
    {
        return this.numeroRes; 
    }
    
    public String getnombreRes()
    {
        return this.nombreRes; 
    }
    
    public String getdireccionRes()
    {
        return this.direccionRes; 
    }
}
