public class Futbolista extends persona{
    private String equipo;
    private String posicion;
    private int Num_camiseta;
    private String representante;
    private int horas;

    public Futbolista(){
        super();
    }

    public Futbolista(int CI, String nombre, String apellido, String direccion, String telefono,String equipo,String posicion,int Num_camiseta,String representante, int horas) {
        super(CI, nombre, apellido, direccion, telefono);
        this.equipo=equipo;
        this.posicion=posicion;
        this.Num_camiseta=Num_camiseta;
        this.representante=representante;
        this.horas=horas;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum_camiseta() {
        return Num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        Num_camiseta = num_camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void correr(){

        System.out.println("Este es el metodo correr....");
    }
}
