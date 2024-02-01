package Ejercicio5;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {
        Banco BBVA = new Banco(100, "BBVA", new HashSet<>());

        Sucursal sucursal1 = new Sucursal(1, BBVA, "C/Felipe, 15");

        Client client1 = new Client(25, "Pedro");

        Prestec prestec1 = new Prestec(12, 2500, sucursal1, client1);

        CompteCorrent compte1 = new CompteCorrent(2485, 15000, sucursal1);

        Domiciliacio iberdrola = new Domiciliacio(874, "Iberdrola");

        BBVA.addSucursales(sucursal1);
        client1.addPrestec(prestec1);
        sucursal1.addPrestec(prestec1);
        sucursal1.addCompte(compte1);
        compte1.addDomiciliacio(iberdrola);

        System.out.println(BBVA);
        for (Sucursal s : BBVA.getSucursales()) {
            System.out.println("\t" + s);
            for (Prestec p : sucursal1.getPrestecs()) {
                System.out.println("\t\t" + p);
                System.out.println("\t\t" + p.getClient());
                for (CompteCorrent cc : sucursal1.getComptes()) {
                    System.out.println("\t\t\t" + cc);
                    for (Domiciliacio d:compte1.getDomiciliacions()) {
                        System.out.println("\t\t\t\t" + d);
                    }
                }
            }
        }
    }
}