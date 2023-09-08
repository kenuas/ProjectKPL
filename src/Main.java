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
        List<Empleado>listaempleado=new ArrayList<>();
        List<Manager>listamanager=new ArrayList<>();
        String sino = "si";
        do {
            int decision = Integer.parseInt(JOptionPane.showInputDialog("Hola bienvenid@ , es un gusto poder atenderte, que deseas realizarr\n"+
                    "1.Agregar clientes\n" +
                    "2.Agregar empleados\n" +
                    "3.Agregar un manager\n" +
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
                    break;
                case 2:
                    Empleado empleadito= new Empleado();
                    empleadito.setNum_empleado((Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de empleado: "))));
                    empleadito.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre:"));
                    empleadito.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad")));
                    empleadito.setDireccion(JOptionPane.showInputDialog("Ingresa tu direccion"));
                    empleadito.setHorario(JOptionPane.showInputDialog("Ingresa tu horario: "));
                    empleadito.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu salario: ")));
                    listaempleado.add(empleadito);

                    break;
                case 3:
                    Manager manager1=new Manager();
                    manager1.setNumero_empleado((Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de empleado: "))));
                    manager1 .setNombre(JOptionPane.showInputDialog("Ingresa tu nombre:"));
                    manager1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad")));
                    manager1.setDireccion(JOptionPane.showInputDialog("Ingresa tu direccion"));
                    manager1.setRfc(JOptionPane.showInputDialog("Ingresa tu rfc:"));

                    break;
                case 4:

                    listaclientes.remove(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el num de afilador del cilente que deseas eliminar: "))-1);
                    break;
                case 5:
                    listaempleado.remove(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el num del empleado que deseas eliminar: "))-1);
                    break;

                case 6:
                    for (cliente clienteactual:listaclientes) {
                        JOptionPane.showMessageDialog(null,"Num emppleado: "+clienteactual.getNumero_afilador());
                        JOptionPane.showMessageDialog(null,"Nombre: "+clienteactual.getNombre());
                        JOptionPane.showMessageDialog(null,"Edad: "+clienteactual.getEdad());
                        JOptionPane.showMessageDialog(null,"Direccion: "+clienteactual.getDireccion());
                        JOptionPane.showMessageDialog(null,"RFC: "+clienteactual.getRfc());

                    }
                    break;
                case 7:
                    for (Empleado empleadoactual:listaempleado) {
                        JOptionPane.showMessageDialog(null,"Num afilador: "+ empleadoactual.getNum_empleado());
                        JOptionPane.showMessageDialog(null,"Nombre: "+empleadoactual.getNombre());
                        JOptionPane.showMessageDialog(null,"Edad: "+empleadoactual.getEdad());
                        JOptionPane.showMessageDialog(null,"Direccion: "+empleadoactual.getDireccion());
                        JOptionPane.showMessageDialog(null,"Horario: "+empleadoactual.getHorario());
                        JOptionPane.showMessageDialog(null,"Salario: "+empleadoactual.getSalario());

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