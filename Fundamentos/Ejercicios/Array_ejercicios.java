package Ejercicios;

import java.util.*;

public class Array_ejercicios {
  // Nos permite usar el scanner en cualquier metodo/funcion.
  private static final Scanner scanner = new Scanner(System.in);

  // Funcion ejercicio 1.
  public static void imprimirArregloInverso() {

    Scanner scanner = new Scanner(System.in);
    int[] numeros = { 0, 0, 0, 0, 0 };
    int cont = 0;
    do {
      System.out.println("Ingrese un numero");
      numeros[cont] = scanner.nextInt();
      cont += 1;
    } while (cont < 5);
    for (int inicializacion = numeros.length - 1; inicializacion >= 0; inicializacion--) {
      System.out.println("Arreglo inverso: " + numeros[inicializacion]);
    }
  }

  // Funcion ejercico *.
  public static void gestionTareas() {
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;
    String array[] = { null };

    while (salir == false) {
      System.out.println("Seleccione una opción: " +
          "\n 1._ Agregar tarea " +
          "\n 2._ Eliminar tarea" +
          "\n 3._ Mostrar tareas pendientes" +
          "\n 4._ Salir del programa");
      int Menu = scanner.nextInt();
      switch (Menu) {
        case 1:

          break;
        case 2:

          break;
        case 3:

          break;
        default:
          salir = true;
      }
    }

  }

  // Funcion ejercicio 2.
  public static void sumarNumeros() {
    int contador = 0;
    int arrayEnteros[] = new int[10]; // instancia array con un valor de 10 por defecto.
    int acumulador = 0;
    while (contador < 10) {
      System.out.println("Ingrese un numero a sumar");
      arrayEnteros[contador] = scanner.nextInt();
      contador++;
    }
    // opcion 1.
    for (int suma : arrayEnteros) {
      acumulador += suma;
      System.out.println("El valor total de los numeros ingresados es = " + acumulador);
    }

  }

  // Funcion ejercicio 3.
  public static void calcularPromedio() {
    double notas[] = new double[5];
    double acumulador = 0.0;
    for (int i = 0; i < 5; i++) {
      System.out.println("Ingrese la notas para calcular el promedio: ");
      notas[i] = scanner.nextDouble();
    }
    for (double d : notas) {
      acumulador += d;

    }
    System.out.println("El promedio es = " + (float) (acumulador / 5));
  }

  // Funcion ejercicio 4.
  public static void numerosParesImpares() {
    System.out.println("Ingrese el tamaño del Array");
    int tamaño = scanner.nextInt();
    scanner.nextLine();
    int numeros[] = new int[tamaño];
    int contador = 0;
    int contadorPar = 0;
    int contadorImpar = 0;

    for (int i = 0; i < tamaño; i++) {
      System.out.println("Ingrese un numero par o impar");
      numeros[i] = scanner.nextInt();
      int temp = numeros[i] % 2 != 0 ? contadorImpar++ : contadorPar++;
    }
    int numerosPares[] = new int[contadorPar];
    int numerosImpares[] = new int[contadorImpar];

    System.out.println("Antes del while" + Arrays.toString(numeros));
    int cont1 = 0;
    int cont2 = 0;
    while (contador < numeros.length) {

      if (numeros[contador] % 2 != 0) {
        numerosImpares[cont2] = numeros[contador];
        System.out.println("dentro de impares" + Arrays.toString(numerosImpares));
        cont2 += 1;
      } else {
        numerosPares[cont1] = numeros[contador];
        System.out.println("dentro de pares" + Arrays.toString(numerosPares));
        cont1 += 1;
      }
      contador++;
    }
    System.out.println("Los numeros pares son: " +
        Arrays.toString(numerosPares) +
        "\nLos numeros impares son: " + Arrays.toString(numerosImpares));
  }

  // Funcion ejercicio 5.
  public static void listaCompras() {
    ArrayList<String> Productos = new ArrayList<>();
    int Menu = 0;
    do {
      System.out.println("Seleccione una opción: " +
          "\n1.-Agregar producto" +
          "\n2.-Eliminar producto" +
          "\n3.-Mostrar lista de productos"+
          "\n4.-Salir");

      Menu = scanner.nextInt();
      scanner.nextLine();

      switch (Menu) {
        case 1:
          System.out.println("Ingrese el producto");
          Productos.add(scanner.nextLine());
          break;

        case 2:
          System.out.println("¿Que producto desea eliminar?");
          for (String string : Productos) {
            System.out.println("\n" + string);
          }
          int elimanarProducto = scanner.nextInt();
          Productos.remove(elimanarProducto-1);
          break;
        case 3:
          System.out.println("Lista de productos \n" + (Productos));
          
          break;
        default:
          System.out.println("Lista de productos que se llevara: \n" + (Productos));
          break;
      }
    } while (Menu != 4);

  }
  //Funcion ejercicio 6.
  public static void nombresUnicos(){
    ArrayList<String> nombres = new ArrayList<>();
    int menu=0;    
    String nombre="";
    do{
      System.out.println("Selenccione una opción"+
      " \n 1-Ingresar nombre"+
      "\n 2-Mostrar lista de nombres");
      menu = scanner.nextInt();
      scanner.nextLine();
      if(menu==1) {     
        System.out.println("Ingresar nombre:"); 
        nombre = scanner.nextLine();
        if (!nombres.contains(nombre)) {
          nombres.add(nombre);          
        }
      }
    }while(menu==1);
    System.out.println(nombres);
  }
  //Funcion ejercicio 7.
  public static void promedioCalificaciones(){
    int menu=0;
    float suma=0;
    float calificaion=0;
    ArrayList <Float> calificaciones = new ArrayList<>();
    do{
      System.out.println("1-Ingresar calificación \n2-Calcular promedio");
      menu = scanner.nextInt();
      scanner.nextLine();
      if (menu==1) {        
        System.out.println("Ingrese calificación");
        calificaion = scanner.nextFloat();
        calificaciones.add(calificaion);
        suma+=calificaion;
      }
    }while(menu==1);
    System.out.println("El promedio es = "+(float)(suma/calificaciones.size()));
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    /*
     * Ejercicio 1 Array.
     * Crear un programa que lea 5 numeros enteros desde el reclado,
     * los almacene en un arreglo, y luego imprima el arreglo en orden inverso.
     */
    // imprimirArregloInverso();

    /*
     * Ejercicio 2 Array.
     * Crea un programa que lea 10 numeros enteros desde el teclado, los almecene en
     * un arreglo y luego calcule y muestre la suma de los elementos del arreglo.
     */
    // sumarNumeros();

    /*
     * Ejercicio 3 Array.
     * Crea un programa que lea 5 nota de estudiantes desde el teclado, las almacene
     * y luego calcule y muestre el promedio de las notas.
     */
    // calcularPromedio();

    /*
     * Ejercicio 4 Array.
     * Crea un programa que lea 10 numero enteros desde el teclado, los almacene en
     * un
     * arreglo y luego separe los números pares eh impares.Finalmente, muestre los
     * números
     * pares eh impares por separado.
     */
    /* numerosParesImpares(); */

    /*
     * Ejercicio 1 Array-list.
     * Crear un programa que getione una lista de tareas pendientes. Permite al
     * usuario
     * agregar tareas, marcar tareas completadas(Eliminar de la lista) y mostrar la
     * lista
     * de tareas pendientes.
     */
    /*
     * Ejercicio 2 Array-list
     * Crea un programa que permita al usuartio agregar productos a una lista de
     * compras,
     * elimanar productos de la lista y mostrar todos los productos en la lista.
     */
    /* listaCompras(); */
    /* 
     *Ejercicio 3 Array-list 
     *crea un programa que permita al usuario ingresar una lista de nombres, elimine 
     *duplicados y muestre la lista de nombres únicos.     
    */
    /* nombresUnicos(); */
    
    /*Ejercicio 4 Array-list
     *Crea un programa que permira al uauario ingresar 
     *calificaiciones de estudiantes, calcule y muestre
     *el promedio de las calificaciones.
     */
    promedioCalificaciones();
  }
}
