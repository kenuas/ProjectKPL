import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main  {

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
        String sino = "si";
        do {
            int decision = Integer.parseInt(JOptionPane.showInputDialog("Hola bienvenid@ , es un gusto poder atenderte, que deseas realizarr\n"+
                    "1.Agregar clientes\n" +
                    "2.Agregar empleados\n" +
                    "3.Agregar un unico manager\n" +
                    "4.Eliminar clientes\n" +
                    "5.Eleminar empleados\n"+
                    "6.Mostrar clientes\n"+
                    "7.Mostrar empleados\n"));
            switch (decision) {
                case 1:

                    cliente cliente1=new cliente();
                    cliente1.setNumero_afilador(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de afilador: ")));
                    cliente1.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre:"));
                    cliente1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad")));
                    cliente1.setDireccion(JOptionPane.showInputDialog("Ingresa tu direccion: "));
                    cliente1.setRfc(JOptionPane.showInputDialog("Ingresa tu rfc:"));
                    listaclientes.add(cliente1);
                    listaclientes.remove(0);
                case 2:
                    List<Empleado>listaempleado=new ArrayList<>();
                    Empleado empleadito= new Empleado();


                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;

                case 6:
                    for (cliente clienteactual:listaclientes) {
                        JOptionPane.showMessageDialog(null,"NOMBRE:"+clienteactual.getNombre());

                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingresa un dato valido");
                    break;
        }
        sino=JOptionPane.showInputDialog(null,"Deseas reperir el programa ");
    }while (sino.equals("si") || sino.equals("SI") || sino.equals("Si"));
    }
}