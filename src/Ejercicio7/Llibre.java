package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Llibre {
    private String ISBN;
    private String titol;
    private Set<Autor> autors;
    private Set<Exemplar> exemplars;
    private Editorial editorial;
    private Tema tema;

    public Llibre(String ISBN, String titol, Editorial editorial, Tema tema) {
        this.ISBN = ISBN;
        this.titol = titol;
        this.exemplars = new HashSet<>();
        this.editorial = editorial;
        this.tema = tema;
        this.autors = new HashSet<>();
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public Set<Autor> getAutors() {
        return autors;
    }

    public void setAutors(Set<Autor> autors) {
        this.autors = autors;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Set<Exemplar> getExemplars() {
        return exemplars;
    }

    public void setExemplars(Set<Exemplar> exemplars) {
        this.exemplars = exemplars;
    }
    public void addExemplars(Exemplar exemplar){
        this.exemplars.add(exemplar);
    }

    @Override
    public String toString(){
        return this.ISBN + " - " + this.titol;
    }
}
