package Funciones;
import java.util.Scanner;

public class Funciones_recursivas {
  Scanner datos = new Scanner(System.in);

  //Funcion recurvia
  public static int Factorial(int numeroFactorial){
    
    if (numeroFactorial>1) {
      /*se almacena el valor de la multiplicacion */
      numeroFactorial = numeroFactorial * Factorial(numeroFactorial -1);//se manda a llamar a si misma pasando por parametro el valor original -1
    }
    return numeroFactorial; //retorna el valor total de multiplicar el pasado por parametro por todos sus numeros positivos inferiores a este
  }
  public static void main(String[] args) {
    System.out.println(Factorial(5));
  }
}
