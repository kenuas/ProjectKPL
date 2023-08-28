public class Circulo extends Forma {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        double area=0;
      area=3.1416*(radio*radio);
      return area;
    }
}
