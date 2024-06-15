package Ejercicios;
import java.util.Scanner;
public class Loops {

  /* Sumar los primeros 10 numero enteros */
  public static void sumarNumeros(){
    int suma=0;
    for(int iteracion = 1; iteracion<=10;iteracion++){
       suma = suma +iteracion;
    }
    System.out.println(suma);
  }
  /* Imprimir los numeros pares del 1 al 20 */
  public static void numerosPares(){
    for(int iteracion=1;iteracion<=20;iteracion++){
      if(iteracion%2==0){
        System.out.println(iteracion);
      }
    }
  }
  /* Calcular el factorial de un numero */
  public static void calcularFactorial(int numero){
    int factorial =1;
    for(int iteracion=1;iteracion<numero;iteracion++){
      factorial = factorial *( iteracion+1);
      System.out.println("catorial dentro del for: "+factorial);
    }
    System.out.printf("El factorial de  es: "+factorial);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Ejercicio 1 de Loop for.
    /* sumarNumeros(); */
    //Ejercicio 2 de Loop for.
    /* numerosPares(); */
    //Ejercicio 3 de Loop for.
    System.out.println("Ingrese el numero al cual calcular factorial: ");
    calcularFactorial(scanner.nextInt());
  }
}
