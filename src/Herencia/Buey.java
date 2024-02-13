package Herencia;

public class Buey extends Mamifero{
    public Buey(String nombre){
        super(nombre);
    }
    public void comunicarse(){
        System.out.println("Mugo para comunicarme");
    }
}
