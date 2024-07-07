package Practicas;

public class Auto {
    private String marca ="Ford";
    private String modelo;
    private  int año ;
    private int llantas = 4;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public static void main(String[]args){
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        auto2.marca = "Audi";
        System.out.println(auto1.marca);
        System.out.println(auto2.marca);
    }
}
