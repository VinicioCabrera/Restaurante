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
public class Sucursal 
{
    private int numeroLocal;
    private String nombreRes;
    private String direccionRes;
    
    
    public void setnumeroLocal(int numeroLocal)
    {
        this.numeroLocal=numeroLocal; 
    }
    
    public void setnombreRes(String nombreRes)
    {
        this.nombreRes=nombreRes; 
    }
    
    public void setdireccionRes(String direccionRes)
    {
        this.direccionRes=direccionRes;
    } 
    
    public int getnumeroLocal()
    {
        return this.numeroLocal; 
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
