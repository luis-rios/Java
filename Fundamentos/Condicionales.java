import java.util.Scanner;
public class Condicionales {
  public static void main (String []args){
    Scanner prueva = new Scanner (System.in);

//Ejemplo 1 de uso instancia de la clase Scanner
  System.out.println("Ingresa nombre de usuario");
  String name = prueva.nextLine(); /*ingresar un dato de tipo cadena utilizando la instancia de Scanner (prueva)
                                  y lo almacena en la variable "name"*/
  System.out.println("Usuario: "+name);//muestra por consola el valor almacenado en la variable name
  
//Ejemplo 2 de uso instancia de la clase Scanner
    System.out.println("Ingresa nombre de usuario");
    System.out.println("2 prueba usuario: "+prueva.nextLine());//ingresa el dato por sonsola, al mismo tiempo lo muestra
    
    /* formas de ingresar cualquier tipo de dato */
    String nombre = prueva.nextLine(); //Tipo String
    prueva.next(); //Tipo char
    int edad = prueva.nextInt(); //Tipo entero
    double estatura = prueva.nextDouble();//Tipo real
    boolean casado = prueva.nextBoolean();//Tipo boolean
    float peso = prueva.nextFloat();//Tipo float

  }
}
