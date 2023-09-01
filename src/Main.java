import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempito =new Tiempo();
        tiempito.setHoras(8);
        tiempito.setMinutos(23);
        tiempito.setSegundos(12);
        JOptionPane.showMessageDialog(null,"El tiempo calculado es: "+tiempito.toString());

        Tiempo tiempito2 =new Tiempo();
        tiempito2.setHoras(8);
        tiempito2.setMinutos(23);
        tiempito2.setSegundos(12);
        JOptionPane.showMessageDialog(null,"El tiempo calculado es: "+Tiempo.sumartiempo(tiempito,tiempito2));
    }
}