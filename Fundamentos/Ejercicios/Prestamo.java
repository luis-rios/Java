package Ejercicios;

import java.util.Scanner;

public class Prestamo {
  public static double CalcularPrestamo(double prestamo) {
    double descuento = prestamo;
    for (int iteracion = 1; iteracion <= 3; iteracion++) {
      descuento = descuento - (descuento * .10);
      System.out.println(iteracion + " Mes adeudo $" + descuento);
    }
    return descuento;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la cantidad del prestamo");
    double prestamo = scanner.nextDouble();
    System.out.println(CalcularPrestamo(prestamo));
  }
}
