package Network;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Usuario pepe = new Usuario("Pepe");

        Mensaje m1 = new Mensaje(pepe, "23-07-2010", 33, 1234, "Vacaciones en torremolinos");
        Fotografia f1 = new Fotografia(pepe, "24-07-2010", 42,"torremolinos.jpg", "Viaje Torremolinos");

        pepe.addPublicaciones(m1);
        pepe.addPublicaciones(f1);
        m1.addComentarios("Torremolinos de mi corazón <3");
        f1.addComentarios("Viva Torremolinos");

        System.out.println(m1);
        System.out.println("\t");
        System.out.println(f1);

    }
}