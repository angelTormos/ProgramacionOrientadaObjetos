package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private int cod_e;
    private String nom_e;
    private Set<Llibre> llibres;
    public Editorial(int cod_e, String nom_e) {
        this.cod_e = cod_e;
        this.nom_e = nom_e;
        this.llibres = new HashSet<>();
    }

    public int getCod_e() {
        return cod_e;
    }

    public void setCod_e(int cod_e) {
        this.cod_e = cod_e;
    }

    public String getNom_e() {
        return nom_e;
    }

    public void setNom_e(String nom_e) {
        this.nom_e = nom_e;
    }

    public Set<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(Set<Llibre> llibres) {
        this.llibres = llibres;
    }
    public void addLlibres(Llibre llibre){
        this.llibres.add(llibre);
    }

    @Override
    public String toString(){
        return this.cod_e + " - " + this.nom_e;
    }
}
