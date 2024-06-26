package Estruturas_datos;
import java.util.*;

public class Arrays_{

  //Funcion que recorre he imprime el array.
  public static void recorridoArray(String arr[]){
    for (String iteracion : arr) {
      System.out.println(iteracion);
    }
  }
  public static void main(String[] args) {

    //Declaracion del array.
    String Nombres [] = {"luis","yair","rios","miranda"};
    String Nombres2 [] = {"luis","yair","rios","miranda"};
    int [] Edades  = {12,16,15,29};

    //Cambia un valor en espesifico del array.
    Arrays.fill(Nombres,2,3,"Skoll");
    
    
    //Llamada a la función.
    recorridoArray(Nombres);
    
  }
}
