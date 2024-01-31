package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Domiciliacio {
    private int num_d;
    private Set<Domiciliacio> domiciliacions;

    public Domiciliacio(int num_d) {
        this.num_d = num_d;
        this.domiciliacions = new HashSet<>();
    }
}
