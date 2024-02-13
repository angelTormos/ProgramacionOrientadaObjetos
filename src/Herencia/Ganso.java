package Herencia;

public class Ganso extends Aves {
    public Ganso(String nombre) {
        super(nombre);
    }

    public void comunicarse() {
        System.out.println("Grazno para comunicarme");
    }
}