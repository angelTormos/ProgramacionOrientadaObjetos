package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String nom;
    private Integer cod_autor;
    private Set<Llibre> llibres;

    public Autor(String nom, Integer cod_autor) {
        this.nom = nom;
        this.cod_autor = cod_autor;
        this.llibres = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCod_autor() {
        return cod_autor;
    }

    public void setCod_autor(Integer cod_autor) {
        this.cod_autor = cod_autor;
    }

    public Set<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(Set<Llibre> llibres) {
        this.llibres = llibres;
    }
    public void addLlibres(Llibre llibres) {
        this.llibres.add(llibres);
    }


    @Override
    public String toString(){
        return this.cod_autor + " - " + this.nom;
    }
}
