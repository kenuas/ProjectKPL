import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempito =new Tiempo();
        tiempito.setHoras(8);
        tiempito.setMinutos(23);
        tiempito.setSegundos(12);
        JOptionPane.showMessageDialog(null,"El tiempo calculado es: "+tiempito.toString());

    }
}