package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Client {
    private int ncli;
    private String nombre;
    private Set<Prestec> prestecs;
    private Set<CompteCorrent> comptes;

    public Client(int ncli, String nombre) {
        this.ncli = ncli;
        this.nombre = nombre;
        this.prestecs = new HashSet<>();
        this.comptes = new HashSet<>();
    }

    public int getNcli() {
        return ncli;
    }

    public void setNcli(int ncli) {
        this.ncli = ncli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Prestec> getPrestecs() {
        return prestecs;
    }

    public void setPrestecs(Set<Prestec> prestecs) {
        this.prestecs = prestecs;
    }

    public void addPrestec(Prestec prestec) {
        this.prestecs.add(prestec);
    }

    public void addCompte(CompteCorrent compteCorrent) {
        this.comptes.add(compteCorrent);
    }

    @Override
    public String toString(){
        return this.ncli + " - " + this.nombre;
    }
}
