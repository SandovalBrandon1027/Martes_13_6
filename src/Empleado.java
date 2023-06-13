public class Empleado extends persona{
    private String puesto;
    private String cargo;
    private String RMU;
    public Empleado(){
        super();
    }

    public Empleado(int CI, String nombre, String apellido, String direccion, String telefono,String puesto,String cargo,String RMU) {
        super(CI, nombre, apellido, direccion, telefono);
        this.puesto=puesto;
        this.cargo=cargo;
        this.RMU=RMU;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRMU() {
        return RMU;
    }

    public void setRMU(String RMU) {
        this.RMU = RMU;
    }

    public void tramitar(){
        System.out.println("Este es el metodo tramitar....");
    }
}
