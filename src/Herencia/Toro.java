package Herencia;

public class Toro extends Mamifero{
    public Toro(String nombre){
        super(nombre);
    }
    public void comunicarse(){
        System.out.println("Bramo para comunicarme");
    }
}
