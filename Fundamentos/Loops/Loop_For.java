package Loops;
import java.util.Scanner;
public class Loop_For {
  //Metodo que imprime la tabla de multiplicar
  static void sicloFor(int valor){    
    for(int iteracion=1;iteracion<=10;iteracion++){
      System.out.println(valor+"x"+iteracion+"="+valor*iteracion);
    }
  }
  public static void main(String[]args){
    Scanner datos = new Scanner(System.in);

    System.out.println("Ingrese la tabla de multiplicar que desea ver: ");
    sicloFor(datos.nextInt()); 
  }
}
