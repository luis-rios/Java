package Loops;

public class ForEach {
  public static void main(String[] args) {
    //Declaracion de una matriz/Array
    int arr[] = {12,23,44,56,78};

    //Declaracion de loop forEach, recorriendo la matriz.
    for(int iteracion:arr){// Iteracion = cada elemento de la matriz
      System.out.println(iteracion);
    }
  }
}
