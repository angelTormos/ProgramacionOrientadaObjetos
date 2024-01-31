package Ejercicio3;

public class Cuenta {

    private String titular;
    private Double cantidad;

    public Cuenta(String titular, Double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta (String titular){
        this.titular = titular;
    }

    public String getTitulas() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidadint){
        if (cantidadint > 0){
            this.cantidad += cantidadint;
        }
    }

    public void retirar(double cantidadint) {
        this.cantidad -= cantidadint;
        if (this.cantidad < 0) {
            this.cantidad = 0.0;
        }
    }


    @Override
    public String toString(){
        return this.titular + " - " + this.cantidad + "€";
    }

}
