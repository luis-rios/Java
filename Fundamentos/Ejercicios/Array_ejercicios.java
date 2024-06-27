package Ejercicios;
import java.util.*;
public class Array_ejercicios {
  //Nos permite usar el scanner en cualquier metodo/funcion.
  private static final Scanner scanner = new Scanner(System.in);
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
  //Funcion ejercico *.
  public static void gestionTareas(){
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;
    String array [] = {null};

    while (salir == false){
      System.out.println("Seleccione una opción: "+
      "\n 1._ Agregar tarea "+
      "\n 2._ Eliminar tarea" +
      "\n 3._ Mostrar tareas pendientes"+
      "\n 4._ Salir del programa");
      int Menu = scanner.nextInt();
      switch (Menu) {
        case 1:
          
          break;
        case 2:
          
          break;
        case 3:
          
          break;
        default: 
          salir = true;                          
      }
    }

  }
  //Funcion ejercicio 2.
  public static void sumarNumeros(){
    int contador=0;
    int arrayEnteros [] = new int [10]; //instancia array con un valor de 10 por defecto.
    int acumulador=0;
    while (contador<10) {
      System.out.println("Ingrese un numero a sumar");
      arrayEnteros[contador] = scanner.nextInt();
      contador++;
    }
    //opcion 1.
    for(int suma: arrayEnteros){
      acumulador+=suma;
      System.out.println("El valor total de los numeros ingresados es = "+acumulador);
    }
    

  
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    /*Ejercicio 1 Array.
      Crear un programa que lea 5 numeros enteros desde el reclado,
      los almacene en un arreglo, y luego imprima el arreglo en orden inverso.*/
    //imprimirArregloInverso();
    
    /*Ejercicio 2 Array. 
     * Crea un programa que lea 10 numeros enteros desde el teclado, los almecene en 
     * un arreglo y luego calcule y muestre la suma de los elementos del arreglo.
    */
    sumarNumeros();

    /* Ejercicio 1 Array-list.
     * Crear un programa que getione una lista de tareas pendientes. Permite al usuario
     * agregar tareas, marcar tareas completadas(Eliminar de la lista) y mostrar la lista
     * de tareas pendientes.     
    */

  }
}
