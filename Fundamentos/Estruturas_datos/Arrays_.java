package Estruturas_datos;
import java.util.*;

public class Arrays_{

  //Funcion que recorre he imprime el array.
  public static void recorridoArray(String arr[]){
    for (String iteracion : arr) {
      System.out.println(iteracion);
    } 
  }
  //Funcion que compara 2 strings.
  public void compararArray(String array1[],String array2[]){
    System.out.println(Arrays.equals(array1, array2));
  }
  //Funcion que convertir un array a otro tipo de dato.
  void convertirArray(){
    int arrayNumeros [] = {1,2,3,4,5};
    Arrays.toString(arrayNumeros);
  }

  //Funcion que ordena un array
  static void ordenarArray(int array[]){
    System.out.println("Array original: \n"+Arrays.toString(array));
    Arrays.sort(array);
    System.out.println("Array ordenado: \n"+Arrays.toString(array));
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

    //Crea un instancia de la clase principal
    Arrays_ array = new Arrays_();

    String array1 [] = {"Nombres","apellidos","cp"};
    String array2 [] = {"Nombres","apellidos","cp"};
    String array3 [] = {"puesto"};

    //Llama a la funciones a travez de la instancia
    array.compararArray(array1,array2);

    //Llama la función 
    array.convertirArray();

    //Llamada a la función
    int Salarios [] = {23,12,35,1};
    ordenarArray(Salarios);
    
  }
}
