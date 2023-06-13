import java.security.spec.RSAOtherPrimeInfo;

public class menu {
    public static void main(String[] args) {
        persona p1 = new persona(1752805166,"Brandon","Sandoval","La Arcadia","0992597185");

        //System.out.println(p1.getApellido());

        persona pedro=new persona();

        //System.out.println(pedro.getCI());

        Estudiante Brandon=new Estudiante(1752805166,"Melani","Sandoval","La arcadia","0992597185",014151,"brandon.sandoval@epn.edu.ec","Tercer Semestre","Desarrllo de software");

        /*
        Brandon.caminar();
        Brandon.estudiar();
        Brandon.trabajar();
        Brandon.leer();

        System.out.println(Brandon.getCI());
        System.out.println(Brandon.getNombre());
        System.out.println(Brandon.getApellido());
        System.out.println(Brandon.getDireccion());
        System.out.println(Brandon.getTelefono());
        System.out.println(Brandon.getCodigo());
        System.out.println(Brandon.getCorreo());
        System.out.println(Brandon.getSemestre());
        System.out.println(Brandon.getCarrera());

         */

        Doctor Ana = new Doctor(145878,"Ana","Ramirez","Quitumbe","0992597485","Leo","Doctora","Nocturno","Andrade Marin");
        System.out.println(Ana.getNombre()+ " es " + Ana.getCod());
        System.out.println("Tiene 33 años");
        System.out.println("Es de signo "+ Ana.getEsp());
        Ana.examinar();


        System.out.println("  ");

        Empleado E1 = new Empleado(17528796,"Pablo","Pabloo","EL centro","123456","Empleado publico","Supervisor","02154");
        System.out.println(E1.getNombre() + " es "+ E1.getPuesto());
        System.out.println("Su telefono es "+E1.getTelefono());
        E1.tramitar();


        System.out.println(" ");

        Futbolista f1 = new Futbolista(175528191,"Maritza","Futbolista","Norte de quito", "0259784","Barcelona","Delantero",10,"Jorge Mendez",5);
        System.out.println(f1.getNombre()+ " es "+ f1.getApellido());
        System.out.println("Entrena "+f1.getHoras()+ " diarias");
        f1.correr();


        System.out.println(" ");
        System.out.println(Brandon.getNombre()+ " es estudiante");
        System.out.println("Esta en "+Brandon.getSemestre());
        Brandon.leer();












    }


}
