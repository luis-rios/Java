package Fundamentos.POO.Ejercicios;

import java.util.*;

public class Binario {
  public void ConvertirBinario(int numero) {
    int result[] = { 0, 0, 0, 0 };
    int face1 = 0;
    int face2 = 0;
    int cont = 1;

    for (int iteracion = 0; iteracion < result.length; iteracion++) {
      face1 = numero / 2;
      face2 = numero % 2;
      System.out.println("resultado de divisor: " + face1);
      System.out.println("resultado de almacena: " + face2);

      if (face2 == 0 || face2 == 1) {
        result[result.length - cont] = face2;

        cont++;
        System.out.println("Insercicion en el array: " + Arrays.toString(result));
      }
      if (face1 != 0) {
        numero = face1;
        System.out.println("valor de numero: " + numero);
      } else {
        break;
      }

    }
    System.out.println(Arrays.toString(result));
  }

  public static void main(String[] args) {
    Binario binario = new Binario();
    binario.ConvertirBinario(7);
    System.out.println(binario.toBinary(7));
    
  }

  public String toBinary(int numero){
    String resultado ="";
    while (numero>0) {
      
      resultado = (numero%2) + resultado;
      numero = numero/2;
    }
    return resultado;
  }
}