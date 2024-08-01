package Ejercicios;

import java.util.*;


public class Estatuas {
  public void calcularEstatuas(int [] estatuas){
    Arrays.sort(estatuas);
    ArrayList<Integer> list = new ArrayList<>();
    for(int elemento : estatuas){
      list.add(elemento);
    }
    System.out.println("estatuas ordenadas \n"+Arrays.toString(estatuas));
    int contador=0;    
    for(int i=estatuas[0];i<estatuas[estatuas.length-1];i++){      
      if(!(list.contains(i))){           
        contador+=1;
      } 
        
    }
    System.out.println("El numero de estatuas faltantes es = "+contador);
  }
  public static void main(String[] args) {
    Estatuas estaua = new Estatuas();
    int [] array = {6,2,4,8};

    estaua.calcularEstatuas(array);
  }
}
