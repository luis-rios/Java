package POO.clases_objetos;
import java.util.Scanner;

import org.w3c.dom.TypeInfo;

public class Trabajador {
  Scanner scanner = new Scanner(System.in);

  //Atributos de la clase.
  private String nombre;
  private String puesto;
  private char sexo;
  private double salario;
  private int edad;

  //Contrtuctor de la clase.
  public Trabajador(String nombre,String puesto,char sexo,double salario,int edad){
    this.nombre = nombre;
    this.puesto=puesto;
    this.sexo=sexo;
    this.salario=salario;
    this.edad=edad;
  }  
  //Metodos de la clase.
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPuesto() {
    return puesto;
  }

  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public static void main(String[] args) {

    //Instancia del obejeto perona1
    Trabajador  personal1 = new Trabajador("luis", "programador", 'm', 12.000, 29);
    System.out.println(personal1.nombre +"\n"+ personal1.edad);
    /* System.out.println(personal1.getClass().getName()); */
    System.out.println(personal1.toString());
  }
}
