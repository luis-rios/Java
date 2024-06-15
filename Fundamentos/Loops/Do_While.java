package Loops;

public class Do_While {
  public static void main(String[] args) {

    //Ejemplo 1 del uso del loop do while.
    int numero = 5;
    do{
      System.out.println(numero);
      numero--;
    }while(numero>0);

    //Ejemplo 2 del uso del loop do while. repetira por consola los numeros del 1 al 5
    int  numero2 = 1;
    do{
      if (numero2>5) {
        break;//Rompe el siclo para que no sea infinito.
      }
      System.out.println(numero2);
      numero2++;
    }while (numero2 >1);
  }
}
