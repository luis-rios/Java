package Funciones;
import java.util.Scanner;
public class Funciones {

  public static double  sumar (double numero1,double numero2){
    return numero1 + numero2;
  }
  //Funcion sin tetorno Restar 
  public static void Restar(int numero1,int numero2){// Funcion restar reciviendo datos por parametros.
    System.out.println("El resultado de la resta es: "+(numero1-numero2));
  }
  //Metodo saludar
   public void Saludar(String nombre){
    System.out.println("Wellcome " +nombre);
  }
  public static void main (String []args){
    Scanner datos = new Scanner(System.in);

  /*   System.out.println("Ingrese el primer valor de la suma");
    double valor1 = datos.nextDouble();
    System.out.println("Ingrese el segundo valor de la suma");
    double valor2 = datos.nextDouble();
    System.out.println("El resultado de la suma es: "+sumar(valor1,valor2)); */

    Restar(10, 8);// llamada a la funcion Restar pasando como argumentos los valores

    Funciones metodo = new Funciones();//Instanciando objeto de la clase funciones
    metodo.Saludar("Luis");//llamando a al metodo saludar desde el objeto metodo de la clase funciones
  }
}