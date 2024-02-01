package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int n_suc;
    private Banco banco;
    private String direccion;
    private Set<Prestec> prestecs;
    private Set<CompteCorrent> comptes;

    public Sucursal(int nSuc, Banco banco, String direccion) {
        this.n_suc = nSuc;
        this.banco = banco;
        this.direccion = direccion;
        this.prestecs = new HashSet<>();
        this.comptes = new HashSet<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Prestec> getPrestecs() {
        return prestecs;
    }

    public void setPrestecs(Set<Prestec> prestecs) {
        this.prestecs = prestecs;
    }

    public Set<CompteCorrent> getComptes() {
        return comptes;
    }

    public void setComptes(Set<CompteCorrent> comptes) {
        this.comptes = comptes;
    }

    public void addPrestec(Prestec prestec) {
        this.prestecs.add(prestec);
    }

    public void addCompte(CompteCorrent compteCorrent) {
        this.comptes.add(compteCorrent);
    }

    @Override
    public String toString(){
        return this.n_suc + " - " + this.direccion;
    }
}