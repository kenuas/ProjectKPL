import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       /* Tiempo tiempito =new Tiempo();
        tiempito.setHoras(8);
        tiempito.setMinutos(23);
        tiempito.setSegundos(12);
        JOptionPane.showMessageDialog(null,"El tiempo calculado es: "+tiempito.toString());

        Tiempo tiempito2 =new Tiempo();
        tiempito2.setHoras(8);
        tiempito2.setMinutos(23);
        tiempito2.setSegundos(12);
        JOptionPane.showMessageDialog(null,"El tiempo calculado es: "+Tiempo.sumartiempo(tiempito,tiempito2));*/
        ////////////////////////////////////////////////////////////////////////////
        /*Desarrollar un programa que desarrolle una lista de objetos para clientes,  empleados y un manager en mi
        funcion principal voy a tener la capacidad de agregar clientes, empleados y un unico manager, tambien tendra
        la capacidad de eliminar clientes y empleados finalmente se va a desplegar la lista de clientes y empleados
         cliente: numero der afiliador, nombre, edad, direccion, rfc
        empleados: numero de empleado, nombre, edad, direccion y salario, horario
       manager:  numero de empleado, nombre, edad, direccion, rfc.
       objetos 3,herencia1, menu1=5 firmas*/

        List<cliente>listaclientes=new ArrayList<>();
        //añadir lista
        cliente cliente1=new cliente();
        cliente1.setNombre("Jorge");
        listaclientes.add(cliente1);
        listaclientes.remove(0);
         //mostrar
        for (cliente clienteactual:listaclientes) {
            JOptionPane.showMessageDialog(null,"NOMBRE:"+clienteactual.getNombre());
        }

        JOptionPane.showMessageDialog(null,"Bienvenido, te mostraremos a continuacion el menu de regguistros, si asi lo deseas" +
                "1.Agregar clientes\n"+
               "2.Agregar empleados\n"+
                "3.Agregar un unico manager\n"+
                "4.");

    }
}