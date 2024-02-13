package Herencia;

public abstract class Aves extends Animal{
    public Aves(String nombre){
        super(nombre);
    }
    public void moverse(){
        System.out.println("Puedo tanto volar como caminar");
    }
    public void mamar(){
        System.out.println("Cuando soy pequeño no mamo");
    }
}
