package Ejercicios;
import java.util.Scanner;
public class Loops {

  /* Sumar los primeros 10 numero enteros */
  public static void sumarNumeros(){
    int suma=0;
    for(int iteracion = 1; iteracion<=10;iteracion++){
       suma = suma +iteracion;
    }
    System.out.println(suma);
  }
  /* Imprimir los numeros pares del 1 al 20 */
  public static void numerosPares(){
    for(int iteracion=1;iteracion<=20;iteracion++){
      if(iteracion%2==0){
        System.out.println(iteracion);
      }
    }
  }
  /* Calcular el factorial de un numero */
  public static void calcularFactorial(int numero){
    int factorial =1;
    for(int iteracion=1;iteracion<numero;iteracion++){
      factorial = factorial *( iteracion+1);
      System.out.println("catorial dentro del for: "+factorial);
    }
    System.out.printf("El factorial de  es: "+factorial);
  }
  /* Imprimir numeros del 1 al 10 */
  public static void ImprimirNumeros(){
    int numero = 1 ;
    while (numero<=10) {
      System.out.println(numero);
      numero++;
    }
  }
  /* Suma de numeros hasta que el usuario ingrese un numero negativo */
  public static void sumaNumeros(){
    Scanner scanner = new Scanner(System.in);
    int suma=0;
    int numero=1;
    System.out.println("Ingrese un numero: "); 
    while ((numero = scanner.nextInt() )>0) {      
      suma += numero;
      System.out.println("Ingrese un numero: "); 
    }
    System.out.println("La suma de los numeros es: "+suma);
  }
  /* Contar el numero de digitos que hay en un numero */
  public static void contarDigitos(int numero){
    int division= numero;
    int cont =0;
    while (division!=0) {
      division/=10;
      System.out.println("Valor de division dentro del for: "+division);
      cont+=1;
    }
    System.out.println(cont);
  }
  /* Sumar los numeros ingresados por el usuario */
  public static void sumarNumerosPositivos(){
    Scanner scanner = new Scanner(System.in);
    int numero =0;
    int suma=0;
    do{
      System.out.println("Ingrese el numero a sumar: ");      
      suma+=numero;
    }while ((numero=scanner.nextInt())>0);
    System.out.println("Resultado = "+suma);
  }
  /* Imprimir los elementos de un arreglo utilizando forEach */
  public static void imprimirArreglo(){
    String arr [] = {"luis","yair","rios"};
    for (String string : arr) {
      System.out.println(string);
    }
  }
  /* Solicita una cadena de texto, devuelve el numero de vocales. */
  public static void concatenarVocales(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresar texto");
    String cadena = scanner.nextLine();
    
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Ejercicio 1 de Loop for.
    /* sumarNumeros(); */
    
    //Ejercicio 2 de Loop for.
    /* numerosPares(); */
    
    //Ejercicio 3 de Loop for.
    /* System.out.println("Ingrese el numero al cual calcular factorial: "); */
    /* calcularFactorial(scanner.nextInt()); */
    
    //Ejercicio 1 de Loop while
    /* ImprimirNumeros(); */

    //Ejercicio 2 de Loop while     
    /* sumaNumeros(); */

    //Ejercicio 3 de Loop while
    /*System.out.println("Ingrese un numero");
    contarDigitos(scanner.nextInt()); */
    
    //Ejercicio 1 de Loop do-while
    /* sumarNumerosPositivos(); */

    //Ejercicio 2 de Loop do-while

    //Ejercicio 3 de Loop do-while

    //Ejercicio 1 de forEach
    /* imprimirArreglo(); */

    //Ejercicio 2 de forEach
    concatenarVocales();
    //Ejercicio 3 de forEach


  }
}
