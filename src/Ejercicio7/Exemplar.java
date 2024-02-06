package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Exemplar {
    private String n_reg;
    private Llibre llibre;
    private Lector lector;
    private Set<Prestec> prestecs;

    public Exemplar(String n_reg, Llibre llibre, Lector lector) {
        this.n_reg = n_reg;
        this.llibre = llibre;
        this.lector = lector;
        this.prestecs = new HashSet<>();
    }

    public String getN_reg() {
        return n_reg;
    }

    public void setN_reg(String n_reg) {
        this.n_reg = n_reg;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public void setLlibre(Llibre llibre) {
        this.llibre = llibre;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
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
        return "Nº Ejemplar: " + this.n_reg;
    }
}
