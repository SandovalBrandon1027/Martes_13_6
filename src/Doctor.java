import java.util.SplittableRandom;

public class Doctor extends persona{
    private String esp;
    private String cod;
    private String horario;
    private String hospital;
    public Doctor(){
        super();
    }

    public Doctor(int CI, String nombre, String apellido, String direccion, String telefono,String esp,String cod, String horario,String hospital) {
        super(CI, nombre, apellido, direccion, telefono);
        this.esp=esp;
        this.cod=cod;
        this.horario=horario;
        this.horario=hospital;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public void examinar(){
        System.out.println("Este es el metodo examinar.....");
    }
}
