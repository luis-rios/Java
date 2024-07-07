package POO;

public class Poo {
    //Atributos privados
    private String nombre;
    private  int edad;
    private char sexo;
    private String puesto;
    private  double salario;

    //Constructor con parámetros.
    /*public Poo(String nombre,int edad, char sexo, String puesto, double salario){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.puesto=puesto;
        this.salario=salario;

    }*/
    //constructor
    public Poo(){
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public char getSexo(){
        return sexo;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    public String getPuesto(){
        return puesto;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public static void main (String[] args){
        Poo persona1 = new Poo();
        persona1.setNombre("Skoll");
        persona1.setEdad(29);
        persona1.setSexo('H');
        persona1.setPuesto("Back-end developer");
        persona1.setSalario(12000);

        System.out.println(
                persona1.getNombre() +"\n"+
                persona1.getEdad()+"\n"+
                persona1.getSexo()+"\n"+
                persona1.getPuesto()+"\n"+
                persona1.getSalario()+"\n"
        );
        persona1.nombre = "jose";
        System.out.println(persona1.getNombre());
    }
}
