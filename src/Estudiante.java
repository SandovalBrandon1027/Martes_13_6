public class Estudiante extends persona {
    private int codigo;
    private String correo;
    private String semestre;
    private String carrera;

    public Estudiante(){
        super();
    }


    public Estudiante(int CI, String nombre, String apellido, String direccion, String telefono, int codigo, String correo, String semestre, String carrera) {
        super(CI, nombre, apellido, direccion, telefono);
        //Atributos de la clase
        this.codigo = codigo;
        this.correo = correo;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void estudiar(){
        System.out.println("Este el metodo estudiar");
    }
    public void memorizar(){
        System.out.println("MEmorizar");
    }
    public void leer(){
        System.out.println("Leer");
    }
}
