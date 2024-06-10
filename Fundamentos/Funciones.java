import java.util.Scanner;
public class Funciones {

  public static double  sumar (double numero1,double numero2){
    return numero1 + numero2;
  }
  public static void main (String []args){
    Scanner datos = new Scanner(System.in);

    System.out.println("Ingrese el primer valor de la suma");
    double valor1 = datos.nextDouble();
    System.out.println("Ingrese el segundo valor de la suma");
    double valor2 = datos.nextDouble();
    System.out.println("El resultado de la suma es: "+sumar(valor1,valor2));
  }
}