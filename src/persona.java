public class persona {
    private int CI;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;

    public persona(){

    }
    public persona(int CI, String nombre, String apellido, String direccion, String telefono) {
        this.CI = CI;
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Telefono = telefono;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public void  caminar(){

    }
    public int trabajar(){
        return 0;
    }
}
