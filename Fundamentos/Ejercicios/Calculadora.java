package Ejercicios;

public class Calculadora {
  public double calcularAhorro(int tiempo){
    return ((54*10)/6);
  }
  public static void main(String[] args) {
    Calculadora calcu = new Calculadora();
    System.out.println(calcu.calcularAhorro(24));
  }
}
//1 persona tarda 24 horas
//¿Cuanto tiempo restara si 10 personas hacen el trabajo durante 1 hora?
//1- 1 trabajador trabajo en 1 hora = 60 minutos = 1/12
//2- 10 trabajadores = .10*60 = 60 minutos
// restamos lo que tardaria 1 trabajador a lo que harian 10 => 60-840=780
//780/60=13 horas