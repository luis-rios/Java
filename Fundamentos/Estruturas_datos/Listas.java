package Estruturas_datos;

import java.util.*;

public class Listas {
  public static final Scanner scanner = new Scanner(System.in);

  public void manipulacionList(ArrayList<Integer> lista){
    boolean continuar = true;
    
    //Ingresando datos dinamicamente a la lista.
    while (continuar==true) {
      System.out.println("Longitud de la lista: "+lista.size());
      System.out.println("\n1._Ingresar edad del usuario \n2._Borrar ultima edad ingresada \n3._Salir");
      int respuesta = scanner.nextInt();            
      if (respuesta ==1) {
        System.out.println("Ingresar: ");
        lista.add(scanner.nextInt());
        /* continue; */
      }else if(respuesta ==2){
        lista.removeLast();
      }else{
        continuar=false;
      }
    }
    System.out.println("Lista de edades \n"+lista.toString());
  }

  public void invertirArray(){

    System.out.println("Ingresar cadena de texto");
    String cadena = scanner.nextLine(); 
    String [] array = new String[cadena.toCharArray().length];   
    int tamañoCadena = cadena.toCharArray().length;
    int contador=1;

    for(char datos:cadena.toCharArray()){
      array[tamañoCadena-contador]=Character.toString(datos);      
      contador+=1;
    }
    System.out.println(Arrays.toString(array));
  
  }

  public void calcularDias(int dias){
    System.out.println(dias/28);
  }
  public static void main(String[] args) {
    Listas listas = new Listas();

    //Declaración de una lista.
    ArrayList <Integer> lista = new ArrayList<>();
    

    //Declaracion de una rray.
    int [] numeros = {1,2,3,4};
    
    /* listas.manipulacionList(lista); */

    /* listas.invertirArray(); */

    listas.calcularDias(86);
    
  }
}
