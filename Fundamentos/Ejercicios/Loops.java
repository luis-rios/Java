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
  /* Solicita una cadena de texto, devuelve el numero de vocales, utilizando forEach.*/
  public static void concatenarVocales(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresar texto");
    String cadena = scanner.nextLine();
    char arr [] = cadena.toCharArray();
    int contador=0;
    for(int iteracion: arr){
      if (iteracion=='a'||iteracion=='e'||iteracion=='i'||iteracion=='o'||iteracion=='u') {
        contador+=1;
      }
    }System.out.println("El numero de vocales de la cadena de texto es: "+contador);

  }
  /* Solicita una cadena de texto, devuelve el numero de vocales, utilizando do while.*/
  public static void contadorVocales(){
    int contador1=0;
    int contador2=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresar cadena de texto");
    char arr [] = scanner.nextLine().toCharArray();
    do {
      if (arr[contador1]=='a'||arr[contador1]=='e'||arr[contador1]=='i'||arr[contador1]=='o'||arr[contador1]=='u') {
        contador2+=1;
      }  
      contador1+=1;    
    }while(contador1<arr.length);
    System.out.println("El total de vocales dentro de la cadena de texto es: "+contador2);
  }
  /* Calcular el promedio de los numeros dentro de un array utilizando forEach*/
  public static void calcularPromedio(){
    int arr[]={10,20,30,40,50};
    int acumulador=0;
    for(int iteracion:arr ){
      acumulador+=iteracion;
    }
    System.out.println("El promedio es: "+((double)acumulador/arr.length));
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
    /* concatenarVocales(); */

    //Ejercicio 3 de Loop do-while

    //Ejercicio 1 de forEach
    /* imprimirArreglo(); */

    //Ejercicio 2 de forEach
    /* concatenarVocales(); */

    //Ejercicio 3 de forEach
    /* Promedio en un array de numeros */
    calcularPromedio();
  }
}
