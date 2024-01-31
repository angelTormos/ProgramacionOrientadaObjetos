package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class CompteCorrent {
    private int n_cc;
    private Set<CompteCorrent> comptes;
    private Set<Domiciliacio> domiciliacions;

    public CompteCorrent(int n_cc) {
        this.n_cc = n_cc;
        this.comptes = new HashSet<>();
        this.domiciliacions = new HashSet<>();
    }
}
