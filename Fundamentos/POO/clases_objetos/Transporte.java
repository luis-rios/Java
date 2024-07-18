package POO.clases_objetos;
import java.util.Scanner;

public class Transporte {
  public static final Scanner scanner = new Scanner(System.in);

  //Definimos los atributos de la clase.
  private String tipo_transporte;
  private int n_neumaticos;
  private String marca;
  private String tipo_gasolina;
  private int n_puertas;
  private String color;

  //Constructuro de la clase /declaras las propiedades en la instancia.
/*   public Transporte(String tipo_transporte,int n_neumaticos,String marca,String tipo_gasolina,int n_puertas,String color){
    this.tipo_transporte = tipo_transporte;
    this.n_neumaticos=n_neumaticos;
    this.marca=marca;
    this.tipo_gasolina=tipo_gasolina;
    this.n_puertas=n_puertas;
    this.color=color;
  } */
  public Transporte(){}

  //Metodos de la clase.

  public String getTipo_transporte(){
    return tipo_transporte;
  }
  public void setTipo_transporte(String tipo_transporte){
    this.tipo_transporte=tipo_transporte;
  }

  public int getN_neumaticos(){
    return n_neumaticos;
  }
  public void setN_neumaticos(int n_neumaticos){
    this.n_neumaticos=n_neumaticos;
  }

  public String getMarca(){
    return marca;
  }
  public void setMarca(String marca){
    this.marca=marca;
  }
  public String getTipo_gasolina(){
    return tipo_gasolina;
  }
  public void setTipo_gasolina(String gasolina){
    this.tipo_gasolina=gasolina;
  }
  public int getN_puertas(){
    return n_puertas;
  }
  public void setN_puertas(int puertas){
    this.n_puertas=puertas;
  }
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color=color;
  }

  public static void main(String[] args) {
    //Instanciamos  objeto de la clase.
    Transporte carro1 = new Transporte();

    //Asignacion de valores
    carro1.marca="Ford";
    carro1.setMarca("BMW");
    System.out.println(carro1.marca);
  }
}
