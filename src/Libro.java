public class Libro {
    private int Num_identificacion;
    private String Nombre;
    private String Direccion;
    private int Telefono;
    private int Fecha_Alta;

    public int getNum_identificacion() {
        return Num_identificacion;
    }

    public void setNum_identificacion(int num_identificacion) {
        Num_identificacion = num_identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public int getFecha_Alta() {
        return Fecha_Alta;
    }

    public void setFecha_Alta(int fecha_Alta) {
        Fecha_Alta = fecha_Alta;
    }

}
