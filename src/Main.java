import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Circulo ciculito=new Circulo();
        ciculito.setRadio(10);
        JOptionPane.showMessageDialog(null,"El area es: " +ciculito.calcularArea());


    }
}