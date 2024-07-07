package Ejercicios;

import javax.print.attribute.IntegerSyntax;

public class numerosAdyacentes {
    public static int productoMayor(int numeros[]){
        int producto=0;
        int productoMayor= Integer.MIN_VALUE;
        for(int init=0;init<numeros.length-1;init++){
            producto = numeros[init]*numeros[init+1];
            System.out.println("producto = "+producto);
            if(producto>productoMayor){
                productoMayor = producto;
            }
        }
        return productoMayor;
    }
    public static void main(String []args){
        int [] numeros = {-23, 4, -3, 8, -12};
        /*int [] numeros = {3,6,-2,-5,7,3};*/
        System.out.println(productoMayor(numeros));


    }
}
