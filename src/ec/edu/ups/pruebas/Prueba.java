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
import ec.edu.ups.clases.Comidas;
import java.util.Scanner;

/**
 * @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */
public class Prueba 
{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        
        Menu Lis=new Menu();
        String nombCo,nombBE;
        double Com;
        System.err.println("Ingresar nombre de Bebidas: ");
        nombBE=x.next();
        System.err.println("Ingrese el nombre de la primera entrada: ");
        nombCo=x.next();
        System.err.println("Ingrese el costo de "+nombCo+" y "+nombBE +":");
        Com=x.nextDouble();
        Lis.setnombrebebidas(nombBE);
        Lis.setnombreComida(nombCo);
        Lis.setcostoComida(Com);
        String bebidasnom=Lis.getnombreBebidas( );
        String comidasnom=Lis.getnombreComida( );
        double costcomi=Lis.getcostoComida( );
        System.out.println("Bebidas: "+bebidasnom);
        System.out.println("comida: "+comidasnom);
        System.out.println("costo de la comida: "+costcomi);
        
          
            Empleado N=new Empleado();
        String nombEm;
        double entrada, sueldo;
        System.err.println("Ingrese el nombre del empledo: ");
        nombEm=x.next();
        System.err.println("Ingrese la hora de entrada: ");
        entrada=x.nextDouble();
        System.err.println("Ingrese el sueldo: ");
        sueldo=x.nextDouble();
        N.setnombreEmpleado(nombEm);
        N.setentradaEmpelado(entrada);
        N.setsueldoEmpleado(sueldo);
        String emplenom=N.getnombreEmpleado();
        double horaent=N.getentradaEmpleado();
        double suel=N.getsueldoEmpleado();
        System.out.println("Nombre Empleado: "+emplenom);
        System.out.println("Entrada de Empleado: "+horaent);
        System.out.println("Sueldo Empleado: "+suel);
        
            Sucursal L=new Sucursal();
        int numL;
        String nombL, direc;
        System.err.println("Ingrese el codigo del Restaurante: ");
        numL=x.nextInt();
        System.err.println("Ingrese el nombre del Restaurante: ");
        nombL=x.next();
        System.err.println("Ingrese la direccion del Restaurante: ");
        direc=x.next();
        L.setnumeroRes(numL);
        L.setnombreRes(nombL);
        L.setdireccionRes(direc);
        int codRes=L.getnumeroRes();
        String nomRes=L.getnombreRes();
        String dicRes=L.getdireccionRes();
        System.out.println("Codigo restaurante: "+codRes);
        System.out.println("Nombre Restaurante: "+nomRes);
        System.out.println("Direccion Restaurante: "+dicRes);
        
        
            Comidas C=new Comidas();
        int cantPa;
        String nomCo,nomPos;
        System.err.println("Ingrese cantidad  de platos: ");
        cantPa=x.nextInt();
        System.err.println("Ingrese nombre de la segunda entrada: ");
        nomCo=x.next();
        System.err.println("Ingrese nombre postres: ");
        nomPos=x.next();
        C.setcantidadPlatos(cantPa);
        C.setnombreComida(nomCo);
        C.setnombresPostres(nomPos);
        int canPa=C.getcantidadPlatos();
        String nbCo=C.getnombreComida();
        String nbPo=C.getnombresPostres();
        System.out.println("Cantidad de Platos: "+canPa);
        System.out.println("nombre de la comida: "+nbCo);
        System.out.println("nombre de postres: "+nbPo);
        
        
          Reservacion R=new Reservacion();
        int mesRes,cRes;
        double horRes;
        System.err.println("Ingrese numero de mesa de reservacion: ");
        mesRes=x.nextInt();
        System.err.println("Ingrese codigo de reservacion: ");
        cRes=x.nextInt();
        System.err.println("Ingrese hora de reservacion: ");
        horRes=x.nextDouble();
        R.setnumeroMesaReservacion(mesRes);
        R.setcodigoReservacion(cRes);
        R.sethorarioReservacion(horRes);
        int remesa=R.getnumeroMesaReservacion();
        int codRe=R.getcodigoReservacion();
        double horaRe=R.gethorarioReservacion();
        System.out.println("Mesa Reservada: "+remesa);
        System.out.println("codigo Mesa: "+codRe);
        System.out.println("Hora Reservacion: "+horaRe);
                
    }
}
