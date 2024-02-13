package Herencia;

public class Ciguenya extends Aves{
    public Ciguenya(String nombre){
        super(nombre);
    }
    public void comunicarse() {
        System.out.println("Croto para comunicarme");
    }
}