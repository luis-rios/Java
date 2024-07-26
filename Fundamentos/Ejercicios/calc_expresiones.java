package Ejercicios;
import java.util.*;
public class calc_expresiones {
  public static final Scanner scanner = new Scanner(System.in);

  public void calcularExpresion(String expresion){   
     
    double acum=0;
    char[] valExpresion =  expresion.toCharArray();
    for(int iteracion =0; iteracion<valExpresion.length;iteracion++){

      if(valExpresion[iteracion]=='('){
        if(Character.isDigit(valExpresion[iteracion+1]) ){
          acum+= valExpresion[iteracion+1];
          iteracion+=1;
        }        
      }else if(Character.isDigit(valExpresion[iteracion])){
        acum+=valExpresion[iteracion];
      }else {
        switch (valExpresion[iteracion]) {
          case '+':
            acum+=valExpresion[iteracion+1];
            iteracion+=1;
            break;
          case '-':
            acum-=valExpresion[iteracion+1];
            iteracion+=1;
            break;
          case '*':
            acum*=valExpresion[iteracion+1];
            iteracion+=1;
            break;
          case '/':
            acum/=valExpresion[iteracion+1];
            iteracion+=1;
            break;
        
          default:
            break;
        }
      }
    }
    System.out.println("Resultado = "+acum);
  }
  public static void main(String[] args) {
    calc_expresiones calcular = new calc_expresiones();
    //Calculadora de expresiones matemáticas.
    /* Escribe un programa que pueda evaluar espresiones matemáticas simples dadas
     * como cadenas de texto.Las exptresiones pueden contener números y operaciones
     * '+,-,*,/'
     * El programa debe manejar el orden de operaciones correctamente
     * (paréntesis y precedencia de operadores)
     * Requisitos
     * 1.El programa debe leer una expresión matemática de una cadena de texto.
     * 2.Evaluar la expresión respetando el orden de operaciones.
     * 3.Soportar paréntesis para definir la precedencia de las operaciones.
     * 4.Manejar errores como división por cero y expresiones inválidas.
    */
    System.out.println("Ingrese expresión matematica.");
    String expresion = scanner.nextLine();
    calcular.calcularExpresion(expresion);
  }
}
