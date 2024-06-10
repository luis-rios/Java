import java.util.Scanner;

public class Condicionales {
  public static void main(String[] args) {

    Scanner peticion = new Scanner(System.in);
    
    System.out.println("Ingrese el primer valor");
    double valor1 = peticion.nextDouble();
    System.out.println("Ingrese el segundo valor");
    double valor2 = peticion.nextDouble();
    

    /* if (valor1 > valor2) {
      System.out.println("El primer valor " + valor1 + " es mayor");
      
      }else if (valor1 < valor2) {
        System.out.println("El segundo valor " + valor2 + " es mayor");
        
        
        }else{
          System.out.println("Los valores son iguales");
          } */
        /*  switch (valor1) {// deve existir un solo valor - no hace comparativas
           case 17:
           System.out.println("El primer valor " + valor1 + " es mayor");
           
           break;
           case 20:
           
           System.out.println("El primer valor " + valor1 + " es mayor");
           break;        
           
           default:
           
            System.out.println("Los valores son iguales"); 
            break;
   } */
    
   System.out.println(valor1 > valor2  ? "El primer valor es mayor":valor1<valor2?"El segundo valor es mayor":"Son iguales");
  }

}
