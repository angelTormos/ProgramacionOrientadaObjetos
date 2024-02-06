package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private int cod_tema;
    private String nom_t;
    private Set<Editorial> editorial;
    private Set<Llibre> llibres;

    public Tema(int cod_tema, String nom_t) {
        this.cod_tema = cod_tema;
        this.nom_t = nom_t;
        this.llibres = new HashSet<>();
        this.editorial = new HashSet<>();
    }

    public int getCod_tema() {
        return cod_tema;
    }

    public void setCod_tema(int cod_tema) {
        this.cod_tema = cod_tema;
    }

    public String getNom_t() {
        return nom_t;
    }

    public void setNom_t(String nom_t) {
        this.nom_t = nom_t;
    }

    public Set<Editorial> getEditorial() {
        return editorial;
    }

    public void setEditorial(Set<Editorial> editorial) {
        this.editorial = editorial;
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
        return this.cod_tema + " - " + " Tema: " + this.nom_t;
    }
}
