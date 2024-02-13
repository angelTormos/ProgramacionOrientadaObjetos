package Herencia;

public class MainAnimal {
    public static void main(String[] args) {
        Ganso ganso = new Ganso("Paquito");
        ganso.comunicarse();
        ganso.mamar();
        ganso.respirar();
        ganso.moverse();

        System.out.println("\n");

        Buey buey = new Buey("Federico");
        buey.comunicarse();
        buey.mamar();
        buey.respirar();
        buey.moverse();
    }
}
