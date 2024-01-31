package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Prestec {
    private int num_p;
    private Set<Prestec> prestecs;

    public Prestec(int num_p){
        this.num_p = num_p;
        this.prestecs = new HashSet<>();
    }
}
