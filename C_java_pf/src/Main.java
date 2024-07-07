public class Main {
    public static void main(String[] args) {
       Usuario usuario1 = new Usuario();
       Usuario usuario2 = new Usuario();
       usuario1.nombre="Luis yair";
       usuario2.nombre="rios developer";
       System.out.println(usuario1.nombre +" "+usuario2.nombre);
    }
}
class Usuario{
    //Atributos
    String nombre;
    String apellido;
    int edad;
    String direccion;
    String telefono;
}
