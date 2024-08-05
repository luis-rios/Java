package Ejercicios;
import java.util.*;

import Estruturas_datos.Control_flujo.break_continue_retorn;
public class SecuenciaNumerica {
  public Boolean secunciaNumerica(Integer []arrey){
    List<Integer> lista = new ArrayList<>(Arrays.asList(arrey));
    int cont=0;
    for(int itera=0;itera<lista.size()-1;itera++){
      if(!(lista.get(itera)<lista.get(itera+1))&&itera>0){
        if(!(lista.get(itera-1)<lista.get(itera+1))){
          lista.remove(itera+1);
          itera=-1;
          cont+=1;
        }else {
          lista.remove(itera);
          itera=-1;
          cont+=1;
        }
      }else if(!(lista.get(itera)<lista.get(itera+1))){
        lista.remove(itera);
        itera=-1;
        cont+=1;
      }
      if(cont>1){break;}
    }
    
    return cont>1?false:true;
  }
  public static void main(String[] args) {
    SecuenciaNumerica secuencia = new SecuenciaNumerica();
    Integer [] array = {1,2,3,2,1};
    System.out.println(secuencia.secunciaNumerica(array));
  }
}
