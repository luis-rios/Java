package Ejercicios;
import java.util.*;

public class Cadena_inversa {
  public static final Scanner scanner = new Scanner(System.in);

  public void invertirCadena(String cadena){
    StringBuilder builder = new StringBuilder(cadena);
    System.out.println(builder.reverse());
    /* Stack <Character> pila = new Stack<>();
    char[] cadenaInversa = cadena.toCharArray();
    int repetidor=-1;

    for(char valor: cadenaInversa){
      pila.push(valor);
    }
    
    while (repetidor <= pila.size()) {
      System.out.println(pila.pop());
      repetidor+=1;
    } */
  }
  public static void main(String[] args) {

    Cadena_inversa objeto = new Cadena_inversa();
    System.out.println("Ingrese cadena de texto");
    String cadena = scanner.nextLine();
    objeto.invertirCadena(cadena);
  }
}
