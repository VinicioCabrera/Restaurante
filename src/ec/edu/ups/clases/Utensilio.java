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
public class Utensilio 
{
    private int numeroMesa;
    private int numeroPlato;
    private int numeroCuchara;
    
    
    public void setnumeroMesa(int numeroMesa)
    {
        this.numeroMesa=numeroMesa; 
    }
    
    public void setnumeroPlato(int numeroPlato)
    {
        this.numeroPlato=numeroPlato; 
    }
    
    public void setnumeroCuchara(int numeroCuchara)
    {
        this.numeroCuchara=numeroCuchara;
    }
    public int getnumeroMesa()
    {
        return this.numeroMesa; 
    }
    public int getnumeroPlato()
    {
        return this.numeroPlato; 
    }
    public int getnumeroCuchara()
    {
        return this.numeroCuchara; 
    }
}
