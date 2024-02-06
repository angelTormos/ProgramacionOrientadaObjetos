package Ejercicio7;

import Ejercicio4.Libro;
import Ejercicio6.Catedra;
import Ejercicio6.Departament;
import Ejercicio6.Profesor;

import java.util.List;

public class MainLibros {
    public static void main(String[] args) {
        Autor machado = new Autor("Antonio Machado", 001);
        Tema modernista = new Tema(2105, "Modernista");
        Editorial santillana = new Editorial(15412, "Santillana");
        Llibre camposcastilla = new Llibre("9788420675763", "Campos de Castilla", santillana, modernista);
        Lector paco = new Lector("52489784R", "Paco");
        Exemplar exemplar1 = new Exemplar("21581", camposcastilla, paco);
        Prestec prestec1 = new Prestec("21-4-2023", exemplar1, paco);

        machado.addLlibres(camposcastilla);
        santillana.addLlibres(camposcastilla);
        modernista.addLlibres(camposcastilla);
        camposcastilla.addExemplars(exemplar1);
        paco.addExemplars(exemplar1);
        exemplar1.addPrestecs(prestec1);
        paco.addPrestecs(prestec1);

        System.out.println(machado);
        for (Llibre l : machado.getLlibres()) {
            System.out.println("\t" + l);
            System.out.println("\t\t" + l.getEditorial());
            System.out.println("\t\t\t" + l.getTema());
            for (Exemplar e: l.getExemplars()) {
                System.out.println("\t\t\t\t" + e);
                System.out.println("\t\t\t\t" + e.getLector());
                System.out.println("\t\t\t\t" + e.getPrestecs());

            }

        }
    }
}