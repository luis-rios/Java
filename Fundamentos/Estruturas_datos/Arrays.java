package Estruturas_datos;
import java.util.Scanner;

public class Arrays {
  public static void recorridoArray(String arr[]){
    for (String iteracion : arr) {
      System.out.println(iteracion);
    }
  }
  public static void main(String[] args) {
    //Declaracion del array
    String Nombres [] = {"luis","yair","rios","miranda"};
    int [] Edades  = {12,16,15,29};
    recorridoArray(Nombres);
  }
}
