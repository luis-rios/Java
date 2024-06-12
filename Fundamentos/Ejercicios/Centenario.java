package Ejercicios;

import java.util.*;

public class Centenario {

  static void calcularCentenario(int year) {
    System.out.println(year % 100 == 0 ? year / 100 :(int) Math.ceil(year / 100) + 1);
  }

  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("Ingresar año: ");
    int year = datos.nextInt();
    calcularCentenario(year);
  }
}
