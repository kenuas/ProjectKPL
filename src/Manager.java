public class Manager extends cliente{
    private int numero_empleado;
    private String nombre;
    private int edad;
    private String direccion;
    private String rfc;

    public int getNumero_empleado() {
        return numero_empleado;
    }

    public void setNumero_empleado(int numero_empleado) {
        this.numero_empleado = numero_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
