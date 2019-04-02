/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Menu;
import ec.edu.ups.clases.Reservacion;
import ec.edu.ups.clases.Sucursal;
import ec.edu.ups.clases.Utensilio;

/**
 *
 * @author PCX
 */
public class Prueba 
{
    public static void main(String []args)
    {
        Menu Lista=new Menu();
        Empleado Nombre=new Empleado();
        Sucursal Local=new Sucursal();
        Utensilio Objeto=new Utensilio();
        Reservacion Reserva=new Reservacion();
        
        Lista.setnombreSeccion("Comida Rapida");
        Lista.setnombreComida("Hamburguesa");
        Lista.setcostoComida(3.75);
        
        Nombre.setnombreEmpleado("Jose");
        Nombre.setentradaEmpelado(8.30);
        Nombre.setsueldoEmpleado(380.50);
        
        Local.setnumeroLocal(1);
        Local.setnombreRes("Restaurante: Los tres chanchitos");
        Local.setdireccionRes("Av. Las Américas");
        
        Objeto.setnumeroPlato(20);
        Objeto.setnumeroMesa(10);
        Objeto.setnumeroCuchara(50);
        
        Reserva.setnumeroMesaReservacion(3);
        Reserva.setcodigoReservacion(2598);
        Reserva.sethorarioReservacion(17.30);
    }
}
