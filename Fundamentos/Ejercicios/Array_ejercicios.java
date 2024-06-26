package Ejercicios;
import java.util.*;
public class Array_ejercicios {

  //Funcion ejercicio 1.
  public static void imprimirArregloInverso(){
    Scanner scanner = new Scanner(System.in);
    int [] numeros = {0,0,0,0,0};
    int cont=0;
    do {
      System.out.println("Ingrese un numero");
      numeros[cont] = scanner.nextInt();
      cont+=1;
    }while(cont<5);
    for(int inicializacion = numeros.length-1; inicializacion>=0;inicializacion--){
      System.out.println("Arreglo inverso: "+numeros[inicializacion]);
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    /*Ejercicio 1.
      Crear un programa que lea 5 numeros enteros desde el reclado,
      los almacene en un arreglo, y luego imprima el arreglo en orden inverso.*/
    imprimirArregloInverso();
  }
}
