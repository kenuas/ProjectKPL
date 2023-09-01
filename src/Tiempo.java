public class Tiempo {

    /*Crea una clase llamada tiempo con los atributos suma y reta que  llamada resta
     se crean de la forma horas,minutos, y segudos crea el metodo to string para ver los
     intervalos de tiem SUMAN  5H 90m 9s SI SEOR EJEMPLO 30m 40s y 35m 20s el rwesultado deberia ser 1h 6m 0s */
   private int horas;
    private int minutos;
    private int segundos;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public String toString(){
        String tostring;
        return this.horas+" h "+this.minutos+" m "+this.segundos+" s ";


    }
}
