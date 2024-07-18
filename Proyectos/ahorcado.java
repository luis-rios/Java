package Proyectos;

import java.util.Scanner;

public class ahorcado {
  //Utilizar scanner desde cualquier metodo
  public static final Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    String Clave="inteligencia";
    int Intentos_maximos=10;
    int N_intentos =0;
    boolean Palabra_adivinada=false;

    //Arreglos
    char [] Letras_adivinadas = new char[Clave.length()];

    for(int iteracion=0;iteracion<Clave.length();iteracion++){
      Letras_adivinadas[iteracion] = '_';
    }
    
  }
}
