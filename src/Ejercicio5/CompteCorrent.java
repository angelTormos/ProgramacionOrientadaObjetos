package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class CompteCorrent {
    private int n_cc;
    private int cantidad;
    private Set<Client> clients;
    private Set<Domiciliacio>domiciliacions;
    private Sucursal sucursal;


    public CompteCorrent(int nCc, int cantidad, Sucursal sucursal) {
        n_cc = nCc;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.domiciliacions = new HashSet<>();
    }


    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Domiciliacio> getDomiciliacions() {
        return domiciliacions;
    }

    public void setDomiciliacions(Set<Domiciliacio> domiciliacions) {
        this.domiciliacions = domiciliacions;
    }

    public void addDomiciliacio(Domiciliacio domiciliacio) {
        this.domiciliacions.add(domiciliacio);
    }

    @Override
    public String toString(){
        return n_cc + " - " + cantidad + "€";
    }
}
