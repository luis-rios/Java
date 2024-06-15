package Loops;
import java.util.Scanner;
public class While {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Ejemplo 1.
    int numero = 5;
    //La condicion comprueba que la variable numero sea mayor que 0
    while (numero>0) {
      System.out.println(numero);//Imprime el valor de la  variable
      numero--; //La variable se va reduciendo 1 en 1 hasta llegar a 0 y salir del loop
    }
  }
}
