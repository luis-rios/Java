package Estruturas_datos;
import java.util.*;

public class Arrays_{
  public static void recorridoArray(String arr[]){
    for (String iteracion : arr) {
      System.out.println(iteracion);
    }
  }
  public static void main(String[] args) {
    
    //Declaracion del array.
    String Nombres [] = {"luis","yair","rios","miranda"};
    int [] Edades  = {12,16,15,29};
    //Cambian un valor en espesifico del array.
    Arrays.fill(Nombres,3,4,"Skoll");
    //Llamada a la función.
    recorridoArray(Nombres);
  }
}
