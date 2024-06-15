package Ejercicios;
import java.util.Scanner;

public class Dias_segundos {
  public static void convertirDiasHorasa(int dias){
    System.out.println(((dias*24)*60)*60);
    
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dias = scanner.nextInt();
    convertirDiasHorasa(dias);
  }
  
}