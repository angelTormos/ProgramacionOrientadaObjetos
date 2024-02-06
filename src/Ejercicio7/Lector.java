package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String dni;
    private String nom;
    private Set<Exemplar> exemplars;
    private Set<Prestec> prestecs;

    public Lector(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
        this.prestecs = new HashSet<>();
        this.exemplars = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public Set<Prestec> getPrestecs() {
        return prestecs;
    }

    public void setPrestecs(Set<Prestec> prestecs) {
        this.prestecs = prestecs;
    }
    public void addPrestecs(Prestec prestec){
        this.prestecs.add(prestec);
    }
    @Override
    public String toString(){
        return "Lector: " + this.dni + " - " + this.nom;
    }
}
