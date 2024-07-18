package Estruturas_datos.Control_flujo;

public class break_continue_retorn {
  public static void main(String[]args){

    //Ejemplo del break
    for(int init=1;init<=10;init++){
      System.out.println("primer: "+init);
      if (init==5) {
        break;//cortar el bloque de código
      }
      System.out.println("segundo: "+init);
    }
    //Ejemplo del continue
    for(int init=1;init<=10;init++){
      System.out.println("primer: "+init);
      if (init==5) {
        continue;//salta las lineas de codigo que esten por debajo,pero continua el ciclo
      }
      System.out.println("segundo: "+init);
    }

    //El return solo devuelve un valor.
  }
}
