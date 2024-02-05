package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Facultad {
    private String nom_fac;
    private Set<Catedra> catedras;

    public Facultad(String nomFac) {
        this.nom_fac = nomFac;
        this.catedras = new HashSet<>();
    }
    public String getNom_fac() {
        return nom_fac;
    }
    public void setNom_fac(String nom_fac) {
        this.nom_fac = nom_fac;
    }
    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }
    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }
    @Override
    public String toString(){
        return "Facultat: " + nom_fac;
    }
}
